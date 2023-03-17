package dsa_lab11;
class Queue {

    private int[] arr;
    private int size;
    private int first;
    private int last;

    public Queue(int size) {
        this.size = size;
        arr = new int[size];
        first = -1;
        last = -1;
    }

    public boolean isEmpty() {
    	if(first == -1 && last == -1) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }

    public boolean isFull() {
    	if(last==size-1) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }

    public void enqueue(int element) {
        if (isFull()) {
            System.out.println("Queue is filled right now");
            return;
        } else if (isEmpty()) {
            first = last = 0;
        } else {
            last++;
        }
        arr[last] = element;
    }

    public int dequeue() {
        int element = 0;
        if (isEmpty()) {
            System.out.println("Queue has no elements to dequue");
        } else if (first == last) {
            element = arr[first];
            first = last = -1;
        } else {
            element = arr[first];
            first++;
        }
        return element;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }
        return arr[first];
    }
}

public class task1 {

	public static void main(String[] args) {
		Queue q1 = new Queue(5);
		System.out.println(q1.isEmpty());
		q1.enqueue(1);
		q1.enqueue(2);
		q1.enqueue(3);
		q1.enqueue(4);
		q1.enqueue(5);
		System.out.println(q1.isFull());
		System.out.println(q1.peek());
		q1.dequeue();
		System.out.println(q1.peek());
		System.out.println(q1.isFull());

	}

}

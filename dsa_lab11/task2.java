package dsa_lab11;

class Queuee {

    private LL first;
    private LL last;

    public Queuee() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void euQueue(int element) {
        LL newNode = new LL(element);
        if (last == null) {
            first = last = newNode;
            return;
        }
        last.next = newNode;
        last = newNode;
    }

    public int deQueue() {
        if (isEmpty()) {
            System.out.println("Queuee is empty");
            return -1;
        }
        int element = first.val;
        first = first.next;
        if (first == null) {
            last = null;
        }
        return element;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queuee is empty.");
            return -1;
        }
        return first.val;
    }
}

class LL {
    int val;
    LL next;

    public LL(int val) {
        this.val = val;
        next = null;
    }
}


public class task2 {

	public static void main(String[] args) {
		Queuee q1 = new Queuee();
		System.out.println(q1.isEmpty());
		q1.euQueue(1);
		q1.euQueue(2);
		q1.euQueue(3);
		q1.euQueue(4);
		q1.euQueue(5);
		System.out.println(q1.peek());
		q1.deQueue();
		System.out.println(q1.peek());
	}

}

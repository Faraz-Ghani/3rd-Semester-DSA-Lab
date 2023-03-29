package dsa;

class queue{
	 int[] arr;
	private int first=-1;
	private int last=-1;
	 int size;
	
	public queue(int size){
		this.arr = new int[size];
		this.size=size;
	}
	
	void enqueue(int data) {
		
		if(first == -1 && last==-1) {
			first++;
			last++;
			arr[last]=data;
		}
		else {
			last++;
			arr[last]=data;
		}
		}
		
	
	
	int dequeue() {
		
		if(first == -1 && last ==-1) {
			System.out.println("Queue is empty");
			return -1; 
		}
		
		else if( first>last) {
			System.out.println("Queue is empty and out of bounds");
			return -1;
		}
		
		else {
			int output=arr[first];
			first++;
			return output;
		}		
		
	}
	
	void isfull() {
		if(size>arr.length-1) {
			System.out.println("Queue is full");
		}
		else {
			System.out.println("Queue is not full");
		}
		
	}
	
	
	void isempty() {
		if(last ==-1 && first == -1) {
			System.out.println("Queue is empty");
		}
		else if(first>last) {
			System.out.println("Queue is empty");
					
		}
		else {
			System.out.println("Queue is not empty");
		}
	}
	
	int peek() {
		if(first == -1 && last ==-1) {
			System.out.println("Queue is empty");
			return -1; 
		}
		
		else if( first>last) {
			System.out.println("Queue is empty and out of bounds");
			return -1;
		}
		
		else {
			int output=arr[first];
			return output;
		}			
	}
}

class node{
	node next;
	int data;
	
	node(int data){
	this.data=data;
	next=null;
	}
}

class LLQueue{
	
	node Tail;
	node Head;
	
	void enqueue(int data) {
	node temp = new node (data);
	
	if(Tail==null) {
		Head=Tail=temp;
	}
	
	else {
		Tail.next = temp;
		Tail = Tail.next;
	}
	}
	
	int dequeue() {
	if(isempty()) {
		System.out.println("Queue is empty");
		return -1;
	}
	else {
		int Output = Head.data;
		Head= Head.next;
		return Output;
	}	
	}
	
	int peek() {
		if(isempty()) {
			System.out.println("Queue is empty");
			return -1;
		}
		else {
			return Head.data;
		}
	}
	
	boolean isempty() {
		if(Head==null && Tail==null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	int size() {
		int count=0;
		node temp =Head;
		while(temp!=null) {
			count++;
			temp=temp.next;
		}
		return count;
	}

	@Override
	public String toString() {
		String Output = "[";
		
		for(node temp = Head ; temp!=null ; temp= temp.next) {
			Output = Output +temp.data+ " ";
		}
		
		Output= Output+"]";
		
		return Output;
		
	}

	public Object[] toArray() {
		
		Object obj[] = new Object[this.size()];
		
		int i =0;
		
		for(node temp = Head; temp!=null ; temp=temp.next,i++) {
			obj[i] = temp.data;
		}
		return obj;
	}

	public int getmiddle() {
		int mid=-1;
		
		int i=0;
		for(node temp= this.Head ; temp!=null ; i++,temp=temp.next) {
		if(i == this.size()/2) {
			mid=temp.data;
			break;
		}
		}
		
		return mid;
	}

	
	public LLQueue Merge1(LLQueue q1,LLQueue q2 ) {
		
		//this method also edits q1 so it is not advised
		LLQueue MergedQueue = q1;
		
		node temp = MergedQueue.Head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		
		temp.next=q2.Head;
		
		return MergedQueue;	
	}

	public LLQueue Merge2(LLQueue q1,LLQueue q2 ) {
	    LLQueue MergedQueue = new LLQueue();
	    
	    // Copy the elements of q1 into the merged queue
	    node temp = q1.Head;
	    while (temp != null) {
	        MergedQueue.enqueue(temp.data);
	        temp = temp.next;
	    }
	    
	    // Append the elements of q2 to the merged queue
	    temp = q2.Head;
	    while (temp != null) {
	        MergedQueue.enqueue(temp.data);
	        temp = temp.next;
	    }
	    
		return MergedQueue;	
	}

}

public class LinkedQueue {

	public static void main(String[] args) {
		//Array Queue
//		queue q  = new queue(3);
//		q.isempty();
//		q.enqueue(3);
//		q.enqueue(54);
//		q.enqueue(19);
//		q.isempty();
//		q.isfull();
//		
//		System.out.println(q.dequeue());
//		System.out.println(q.dequeue());
//		System.out.println(q.dequeue());
//		q.isempty();
		
		//Linked List Queue
		LLQueue LQ = new LLQueue();
		LQ.isempty();
		LQ.enqueue(2);
		LQ.enqueue(3);
		LQ.enqueue(4);
		LQ.enqueue(5);
		LQ.enqueue(6);
		LQ.isempty();
		LQ.peek();
		
		LLQueue LQ2 = new LLQueue();
		LQ2.enqueue(7);
		LQ2.enqueue(8);
		LQ2.enqueue(9);
		LQ2.enqueue(10);
		LQ2.enqueue(11);
		
		
		LLQueue LQ3 = LQ.Merge2(LQ, LQ2);
		
		System.out.println("Merged Queue s"+LQ3);
		
		
		System.out.println("Tostring is "+LQ);
		
		System.out.println("Middle is "+LQ.getmiddle());
		
		
		//queue to array method 1 (Hard)
		Object[] objArr = LQ.toArray();//we get obj[]
		
		int[] Qarr = new int[objArr.length];//we get Queue to array
		
		for (int i = 0; i < objArr.length; i++) {
		    Qarr[i] = (int) objArr[i];
		}
		
		
		
		//queue to array method 2
		int arr [] = new int[LQ.size()];
		
		for (int i = 0; i < arr.length; i++) {
            arr[i] = LQ.dequeue();
        }
		
		//print reverse array
		System.out.print("reverse array is  ");
		for (int i = arr.length - 1; i >= 0; i--) {
	            System.out.print(arr[i] + " ");
	    }
		
		
		
	
	}

}

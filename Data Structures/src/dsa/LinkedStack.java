package dsa;

class Nodee{
	int data;
	Nodee next;
	public Nodee(int data) {
		super();
		this.data = data;
		this.next = null;
	}
	
}

class stack {
	Nodee top;
	int size;
	
	public stack() {
		top =null;
		size = 0;
	}
	public void push ( int data ) {
		Nodee node = new Nodee(data);
		node.next=top;
		top = node;
		size++;
	}
	public int pop () {
		if(isempty()) {
			return -1;
		}
		else {
		int data = top.data;
		top = top.next;
		size--;
		return data;
	}}
	
	public int size() {
		return size;
	}
	
	public int peek() {
		if(isempty()) {
			return -1;
		}
		else {
			return top.data;		
		}
	}
	
	public boolean isempty() {
		return top == null;
	}
	
	
}

public class LinkedStack {

	public static void main(String[] args) {
		stack stck = new stack();
		System.out.println(stck.isempty());
		stck.push(5);
		stck.push(3);
		stck.push(7);
		stck.push(10);
		System.out.println(stck.isempty());
		System.out.println(stck.pop());
		System.out.println(stck.size);
		System.out.println(stck.pop());
		
	}

}

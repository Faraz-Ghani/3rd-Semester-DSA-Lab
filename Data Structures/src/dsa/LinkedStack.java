package dsa;

class nodeee{
	int data;
	nodeee next;
	public nodeee(int data) {
		super();
		this.data = data;
		this.next = null;
	}
	
}

class stack {
	nodeee top;
	int size;
	
	public stack() {
		top =null;
		size = 0;
	}
	public void push ( int data ) {
		nodeee node = new nodeee(data);
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
	
	
	public stack reverse() {
		stack stack2 = new stack();
		int Size = size;
		for(int i =0 ;i <Size;i++) {
			stack2.push(this.pop());			
		}

		return stack2;
	}
	
	@Override
	public String toString() {
		String str = "[";
		stack temp = new stack();
		temp.top=this.top;
		int Size = size;
		for(int i =0 ; i<Size;i++) {
			str=str+" "+temp.pop();
		}
		str=str+" ]";
		return str;
	}
	
}

public class LinkedStack {

	public static void main(String[] args) {
		stack stck = new stack();
		stack stck2 = new stack();
//		System.out.println(stck.isempty());
		stck.push(5);
		stck.push(3);
		stck.push(7);
		stck.push(10);
//		System.out.println(stck.isempty());
//		System.out.println(stck.pop());
//		System.out.println(stck.size);
//		System.out.println(stck.pop());
//		
		
//		System.out.println(stck.pop());
//		System.out.println(stck.pop());
//		System.out.println(stck.pop());
//		System.out.println(stck.pop());
		System.out.println(stck);
		System.out.println("after reverse");
		stck= stck.reverse();
		System.out.println(stck);

	}

}

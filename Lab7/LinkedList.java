package Lab7;

import LinkedList.Node;

public class LinkedList<T> {
private class Node<T>{
	T data;
	Node next;
	public Node(T data) {
		this.data=data;
	}
}

Node head;
int size;

public void display() {
	if(size==0) {
		System.out.println("Empty Linked List");
	}
	else {
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
}
public void deleteat(int pos) {
int count=1;
Node temp=head;
	if(pos<2) {
		head=head.next;
	}
while(count<pos-1) {
	temp=temp.next;
	count++;
}
temp.next=temp.next.next;
} 


public void Search(T data) {
	Node temp = head;
	int pos=1;
	
while(temp.next!=null) {
	if(temp.data==data) {
		System.out.println(data+" found at "+pos);
		break;
	}
	else
	{temp=temp.next;
	pos++;
	}
	if(pos==size) {
		System.out.println("Data not found");
	}
}
}

public void InsertionAtFirst(T data) {
	Node newNode = new Node(data);
	newNode.next=head;
	head=newNode;
	size++;
}

public void InsertionAtLast(T data) {
	
if(size==0) {
	InsertionAtFirst(data);
}
else {
	Node newNode = new Node(data);
	Node temp=head;
	while(temp.next!=null) {
	temp=temp.next;
	}
	temp.next=newNode;
	size++;

}
}



}

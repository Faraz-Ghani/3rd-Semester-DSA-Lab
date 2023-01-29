package Lab7;

class TripList<T> {
private class Node<T>{
	T data;
	Node next;
	public Node(T data) {
		this.data=data;
	}}
	Node head;
	int size;
	public void display() {
		if(size==0) {
			System.out.println("Empty Linked List");
		}
		else {
			Node temp=head;
			System.out.println("Route :");
			while(temp!=null) {
				System.out.print(temp.data+" -> ");
				temp=temp.next;
			}
			System.out.println("MUET");
		}}//display
	
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



public class task2 {

	public static void main(String[] args) {
		TripList trip = new TripList();
		trip.InsertionAtLast("Dadu");
		trip.InsertionAtLast("Bhan");
		trip.InsertionAtLast("Sehwan");
		trip.InsertionAtLast("Amari");
		trip.InsertionAtLast("Jamshoro");
		trip.display();
		
	}

}

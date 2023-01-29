package Lab7;


public class Task3<T> {
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
public void deleteFirst() {
	this.deleteat(1);
}
public void deleteLast() {
	this.deleteat(size);
}
public void deleteValue(T val) {
if(size==1){
	if(head.data==val) {
		this.deleteat(1);
	}
}
else {
	Node temp=head;
	int count=1;
while(temp.next!=null) {
		if(temp.data==val) {
			this.deleteat(count);
			break;
		}
		count++;
	}
}
}
public int getSize() {
	return size;
}

public boolean isEmpty() {
if(head == null) {
	return true;
}
else {
	return false;
}

}

public void InsertionAt(T data, int position) {
    Node newNode = new Node(data);
    if (head == null) {
        head = newNode;
        return;
    }
    if (position == 0) {
        newNode.next = head;
        head = newNode;
        return;
    }
    Node temp = head;
    for (int i = 0; i < position - 1; i++) {
        temp = temp.next;
        if (temp == null) {
            break;
        }
    }
    newNode.next = temp.next;
    temp.next = newNode;
}


}

package Lab7;

class FireAir<T> {
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
		System.out.println("No Songs found");
	}
	else {
		System.out.println("List of Songs:");
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
System.out.println("Song Deleted");
} 


public void Search(T data) {
	Node temp = head;
	int pos=1;
	
while(temp.next!=null) {
	if(temp.data==data) {
		System.out.println(data+" found at index "+pos);
		break;
	}
	else
	{temp=temp.next;
	pos++;
	}
	if(pos==size) {
		System.out.println("Song not found");
	}
}
}

public void deleteFirstNode() {
    if (head == null) {
        return;
    }
    head = head.next;
}

public void deleteLastNode() {
    if (head == null) {
        return;
    }
    if (head.next == null) {
        head = null;
        return;
    }
    Node second_last = head;
    while (second_last.next.next != null) {
        second_last = second_last.next;
    }
    second_last.next = null;
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

public class task1 {

	public static void main(String[] args) {
FireAir m1 = new FireAir();
m1.InsertionAtLast("Lie");
m1.InsertionAtLast("Happy");
m1.InsertionAtLast("Snowman");
m1.InsertionAtLast("Favourite Girl");

m1.display();
System.out.println();
m1.Search("Snowman");
System.out.println();
m1.deleteat(2);
System.out.println();
m1.display();
	}

}

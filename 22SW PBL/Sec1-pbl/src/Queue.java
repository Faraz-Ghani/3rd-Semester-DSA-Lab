public class Queue {
    Node first;
    Node last;
    int size=0;
    public Queue(){
        first=null;
        last=null;
    }
    public Queue(Node first){
        this.first=first;
        last=first;
        size++;
    }
    public void enqueue(Node data){
        Node newData = new Node(data);
        if(first==null){
            first=newData;
            last=newData;
        }
        else{
            last.next=newData;
            last=newData;
        }
        size++;
    }
    public Node dequeue(){
        if(first==null){
            return null;
        }
        else{
            Node temp=first;
            first=first.next;
            size--;
            return temp;
        }
    }
    public void peek(){
        if(first==null){
            System.out.println("Queue is empty");
        }
        else{
            first.display();
        }
    }
    public void display(){
        Node temp=first;
        while(temp!=null){
            temp.display();
            temp=temp.next;
        }
    }
    public boolean isEmpty(){
        if(first==null){
            return true;
        }
        else{
            return false;
        }
    }
}

public class Linkedlist {
    Node head;
    int size=0;
    public Linkedlist(){
        head=null;
    }

    public Linkedlist(String[] data){
        head=new Node(data[0],data[1],data[2],data[3],data[4],data[5],data[6],data[7]);
       
        size++;
    }

    public Linkedlist(Node head){
        this.head=head;
   
        size++;
    }

    public void add(Node data){
        Node newData = new Node(data);

        if(head==null){
            head=newData;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newData;
        }
        size++;
    }

    public void add(String[] data){
        Node newNode=new Node(data[0],data[1],data[2],data[3],data[4],data[5],data[6],data[7]);
       
        if(head==null){
            head=newNode;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
        size++;
    }    

    public void display(){
        Node temp=head;
        int serial=1;
        while(temp!=null){
            System.out.print("Nume : "+(serial) +" ");
            temp.display();
            temp=temp.next;
            serial++;
        }
    }
}

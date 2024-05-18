public class Stack {
    Node top;
    int size=0;
    public Stack(){
        top=null;
    }
    public Stack(Node top){
        this.top=top;
        size++;
    }

    public void push(Node data){
        Node newData = new Node(data);
        if(top==null){
            top=newData;
        }
        else{
            newData.next=top;
            top=newData;
        }
        size++;
    }

    public Node pop(){
        if(top==null){
            return null;
        }
        else{
            Node temp=top;
            top=top.next;
            size--;
            return temp;
        }
    }

    public Node peek(){
        if(top==null){
            System.out.println("Stack is empty");
            return null;
        }
        else{
            return top;
        }    
    }

    public void display(){
        Node temp=top;
        while(temp!=null){
            temp.display();
            temp=temp.next;
        }
    }

    public boolean isEmpty(){
        if(top==null){
            return true;
        }
        else{
            return false;
        }
    }
    
}

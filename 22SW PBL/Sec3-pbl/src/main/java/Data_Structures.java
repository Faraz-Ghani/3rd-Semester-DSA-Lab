
class Node{
    String state;
    String district;
    String crop_name;
    String year;
    Node next;

    Node(String state, String district,String year ,String crop_name){
        this.state = state;
        this.district = district;
        this.crop_name = crop_name;
        this.year = year;
        this.next = null;
    }

    Node(Node n){
        this.state = n.state;
        this.district = n.district;
        this.crop_name = n.crop_name;
        this.year = n.year;
    }

}

class LinkedList{
    Node head;
    int size = 0;
    LinkedList(){
        head = null;
    }
    LinkedList(Node head){
        this.head = head;
    }

    public void insert(Node node){
        if(head == null){
            head = node;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = node;
        }
        size++;
    }

    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.println("State : "+temp.state+" District : "+temp.district+" Crop : "+temp.crop_name+" Year : "+temp.year);
            temp = temp.next;
        }
    }
    
    

}


class SimpleNode{
    int count;
    String crop_name;
    SimpleNode next;
    SimpleNode(String crop_name, int count){
        this.crop_name = crop_name;
        this.count = count;
        this.next = null;
    }

}


class stack{
    SimpleNode top;
    stack(){
        top = null;
    }
    stack(SimpleNode top){
        this.top = top;
    }
    public void push(SimpleNode node){
        if(top == null){
            top = node;
        }
        else{
            node.next = top;
            top = node;
        }
    }
    public void push(String crop_name, int count){
        SimpleNode node = new SimpleNode(crop_name, count);
        if(top == null){
            top = node;
        }
        else{
            node.next = top;
            top = node;
        }
    }
    public void pop(){
        if(top == null){
            System.out.println("Stack is empty");
        }
        else{
            top = top.next;
        }
    }
    public void print(){
        SimpleNode temp = top;
        while(temp != null){
            System.out.println("Crop name: "+temp.crop_name+" Count: "+temp.count);
            temp = temp.next;
        }
    }
    public void peek(){
        if(top == null){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Crop name: "+top.crop_name+" Count: "+top.count); }
    }
    public boolean isEmpty(){
        return top == null;
    }
}


class queue{
    Node front;
    queue(Node front){
        this.front = front;
    }
    public queue() {
    }
    public void enqueue(Node node){
        if(front == null){
            front = node;
        }
        else{
            Node temp = front;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = node;
        }
    }
    public void dequeue(){
        if(front == null){
            System.out.println("Queue is empty");
        }
        else{
            front = front.next;
        }
    }

    public void enqueue(Node n, int index ){
        if(front == null){
            front = n;
        }
        else{
            Node temp = front;
            for(int i = 0; i < index-1; i++){
                temp = temp.next;
            }
            n.next = temp.next;
            temp.next = n;
        }
    }
    
    public void print(){
        Node temp = front;
        while(temp != null){
            System.out.println("State : "+temp.state+" District : "+temp.district+" Crop : "+temp.crop_name+" Year : "+temp.year);
            temp = temp.next;
        }
    }         
}
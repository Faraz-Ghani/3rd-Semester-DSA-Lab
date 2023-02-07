package lab8;
class Node {
    public String data;
    
    public Node next;
    
    public Node prev;

	public Node(String data, Node next, Node prev) {
		this.data = data;
		this.next = next;
		this.prev = prev;
	}
}
class Photoviewer {  
	int counter=0;
    Node head = null;
    Node tail = null;
    Node current;
    
    public void Current() {
    	System.out.println(current.data);
    	System.out.println();
    }
    
    public void Previous() {
    	if(current.prev!=null) {
    		current=current.prev;
        	System.out.println(current.data);
        	System.out.println();
    	}
    	else {
    		System.out.println("Can't Go back,This is the First image");
    		System.out.println();
    	}	
    }
    public void next() {
    	if(current.next!=null) {
    	 	current=current.next;
        	System.out.println(current.data);	
        	System.out.println();
    	}
    	else {
    		System.out.println("Can't Go back,This is the last image");
    		System.out.println();
    	}
    }
    
    public void AddImage(String val) {
        Node temp = new Node(val, null, tail);
        if(tail != null) 
        {
            tail.next = temp;
        }
        tail = temp;
        if(head == null) 
        { 
            head = temp;
            current=temp;
        }
        counter++;
      
    }
    
    public void Display(){
        
        Node temp = head;
            
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println();}
    
    public int search(String data) {
    	Node temp = head;
        int count=0;
        while(temp != null){
         if(temp.data==data) {
        	 System.out.println("Image found at index "+count);
        	 System.out.println();
         return count;
         }
         else{
        	 temp = temp.next;
         }
         count++;
        }
        System.out.println("Image not found");
        System.out.println();
        return -1;
    }
    
    public void delete(String data) {
    	Node temp = head;
    	while(temp != null){
            if(temp.data==data) {
           	temp.prev.next=temp.next;
           	counter--;
           	break;
            }
            else{
           	 temp = temp.next;
            }
           }       
    }
    
    public void update(String data,String newdata) {
    	Node temp = head;
    	while(temp != null){
            if(temp.data==data) {
           	temp.data=newdata;
            	break;
            }
            else{
           	 temp = temp.next;
            }
           }       
    }
    
    public int size() {
    	return counter;
    }
    
    public void slideshow() throws InterruptedException {
    	Node temp = head;
        
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
            Thread.sleep(200);
        }
        System.out.println();
    }
    
} 
public class task1 {
public static void main(String[] args) throws InterruptedException {
Photoviewer pv = new Photoviewer();
pv.AddImage("IMG1");
pv.AddImage("IMG2");
pv.AddImage("IMG3");
pv.AddImage("IMG4");

pv.Current();
pv.Previous();
pv.next();
pv.slideshow();
pv.delete("IMG2");
pv.update("IMG4", "NEWIMG");
pv.Display();
pv.search("NEWIMG");
pv.size();
}
}

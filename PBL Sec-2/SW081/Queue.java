package SW081;


public class Queue {
	Node Front,Back;
	class Node{
		String Year;
		String Month;
		String Day;
		String Lighting;
		String Weather;
		String Casuality;
		String HitAndRun;
		Node next;
		public Node(String year, String month, String day, String lighting, String weather, String casuality,
				String hitAndRun) {
			next=null;
			Year = year;
			Month = month;
			Day = day;
			Lighting = lighting;
			Weather = weather;
			Casuality = casuality;
			HitAndRun = hitAndRun;
		}
		@Override
		public String toString() {
			return Year+Month+Day+Lighting+Weather+Casuality+HitAndRun;
		}
		}
		
	public void Add(String year, String month, String day,String hitAndRun, String lighting, String weather, String casuality) {
	Node NewNode= new Node( year, month, day, lighting, weather, casuality,hitAndRun);	
	
	if(Front==null && Back==null){
        Front=Back=NewNode;
    }
    Back.next=NewNode;
    Back=NewNode;
	}
	 public int size(){
	        Node temp=Front;
	        int size=0;
	        if(temp!=null){
	            while(temp!=null){
	                temp=temp.next;
	                size++;
	            }
	            return size;
	        }
	        else {
	         return -1;
	        }
	    }
	 
	 public void traverse(){
	        Node temp=Front;
	        if(temp!=null){
	            while(temp!=null){
	                System.out.println(temp.Year+" "+temp.Month+" "+
	                        " "+" "+temp.Day+ " "+temp.Weather);
	                temp=temp.next;
	            }
	        }
	        else {
	            System.out.println("List is emtpy");
	        }
	    }
}

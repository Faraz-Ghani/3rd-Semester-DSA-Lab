package SW081;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Insertion {
    ArrayList<Queue> arr;
    Insertion(){
        arr=new ArrayList<>();
        for(int i=0;i<12;i++){
            Queue queue=new Queue();
            arr.add(i,queue);
        }}
    
    public void Input() throws IOException {
    	int counter = 0;
    	Scanner sc = new Scanner(new File("C:\\Users\\faraz\\OneDrive\\Desktop\\ped_crashes.csv" ));
    	sc.useDelimiter(",");
    	while(sc.hasNextLine()) {
    		String[] data = sc.nextLine().split(",", 14);
    		if(counter!=0) {
    			
    		if(data[1].contains("January"))arr.get(0).Add(data[0], data[1],data[4], data[7],data[8], data[9], data[11]);
    		else if(data[1].contains("February"))arr.get(1).Add(data[0], data[1],data[4], data[7],data[8], data[9], data[11]);
    		else if(data[1].contains("March"))arr.get(2).Add(data[0], data[1],data[4], data[7],data[8], data[9], data[12]);
    		else if(data[1].contains("April"))arr.get(3).Add(data[0], data[1],data[4], data[7],data[8], data[9], data[12]);
    		else if(data[1].contains("May"))arr.get(4).Add(data[0], data[1],data[4], data[7],data[8], data[9], data[12]);
    		else if(data[1].contains("June"))arr.get(5).Add(data[0], data[1],data[4], data[7],data[8], data[9], data[11]);
    		else if(data[1].contains("July"))arr.get(6).Add(data[0], data[1],data[4], data[7],data[8], data[9], data[11]);
    		else if(data[1].contains("August"))arr.get(7).Add(data[0], data[1],data[4], data[7],data[8], data[9], data[11]);
    		else if(data[1].contains("September"))arr.get(8).Add(data[0], data[1],data[4], data[7],data[8], data[9], data[11]);
    		else if(data[1].contains("October"))arr.get(9).Add(data[0], data[1],data[4], data[7],data[8], data[9], data[11]);
    		else if(data[1].contains("November"))arr.get(10).Add(data[0], data[1],data[4], data[7],data[8], data[9], data[11]);
    		else if(data[1].contains("December"))arr.get(11).Add(data[0], data[1],data[4], data[7],data[8], data[9], data[11]);
    	}counter++;}
    	sc.close();
    }
    
        public void Combine(Queue Main) {
    	try {
			Input();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	for(int i=0;i<12;i++) {
    		Queue.Node TempNode=arr.get(i).Front;
    		if(TempNode!=null) {
        	while(TempNode!=null) {
        		Main.Add(TempNode.Year, TempNode.Month, TempNode.Day, TempNode.HitAndRun, TempNode.Lighting, TempNode.Weather, TempNode.Casuality);	
        	TempNode=TempNode.next;	
        	}
    		}
    		else {
    			System.out.println("LIST EMPTY!");
    		}
    	}
    	
    }

}
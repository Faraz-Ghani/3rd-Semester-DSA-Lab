import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

public class Main {
    public static void main(String[] args) {
      
        // Reading the CSV File
        LinkedList list = ReadCSV();
        

        // Step 0.5: Extract unique state names
        ArrayList<String> states = unique_Words(list,"state");


        // Step 1: Linkedlist for each state
        LinkedList[] state_list = State_linkedlist(list, states);

        // Step 2: Stack for each state with more frequent crops at the bottom
        stack[] crop_stack = State_Stacks(state_list);

        // Step 3: Queue for andhra pradash based on year column

        queue andhra_pradesh = State_Queue(state_list[0]);
        andhra_pradesh.print();
    }
    
    private static LinkedList ReadCSV(){
    	LinkedList data = new LinkedList();
    	try (CSVReader reader = new CSVReader(new FileReader("pbl\\src\\main\\java\\crop_production.csv"))) {
            List<String[]> records = reader.readAll();
            int count = 0;
            
            for (int i = 1; i < records.size(); i++) {
                String[] record = records.get(i);
                System.out.println(count++);
                String state = record[0];
                String district = record[1];
                String year = record[3];
                String cropName = record[2];

                Node node = new Node(state, district, year, cropName);
                data.insert(node);
            }
    	} catch (IOException | CsvException e) {
			
			e.printStackTrace();
		}
    	return data;
    }
    
   

    // Step 0.5: Extract unique state names
    private static ArrayList<String> unique_Words(LinkedList list,String value ) {
        ArrayList<String> names = new ArrayList<String>();
        Node temp = list.head;
        while(temp != null){
            switch (value) {
                case "state":
                    if(names.contains(temp.state)==false){
                        names.add(temp.state);
                    }   
                    break;
                
                case "Crop Name":
                    if(names.contains(temp.crop_name)==false){
                        names.add(temp.crop_name);
                    }
                    break;
                case "Year":
                    if(names.contains(temp.year)==false){
                        names.add(temp.year);
                    }
                    break;
                default:
                    break;
            }
            
            
            temp = temp.next;
        }
        return names;
    }
     
    // Step 1: Linkedlist for each state
    private static LinkedList[] State_linkedlist(LinkedList list, ArrayList<String> states){
        // linkedlist with 33 states
        LinkedList[] state_list = new LinkedList[states.size()];
        // initializing the linkedlist
        for(int i = 0; i < states.size(); i++){
            state_list[i] = new LinkedList();
        }

        // inserting the data into the linkedlist
        Node temp = list.head;
        while (temp != null) {

            //go through every state in the array of the linkedlists
            for(int i = 0; i < states.size(); i++){
                if(temp.state.equals(states.get(i))){
                    state_list[i].insert(new Node(temp));
                }
            }
            temp= temp.next;
        }
        
        return state_list;
    }


    // Step 2: Stack for each state with more frequent crops at the bottom
    private static stack[] State_Stacks(LinkedList[] states){
        stack State_stack[] = new stack[states.length];

        for(int i = 0; i < states.length; i++){
            State_stack[i] = new stack();
            ArrayList<String> crops = unique_Words(states[i], "Crop Name"); 
            int count[] = new int[crops.size()];
            Node temp = states[i].head;
            
            //counting the frequency of each crop
            while(temp != null){
                    count[crops.indexOf(temp.crop_name)]++;
                temp = temp.next;
            }

            // pushing crops into the stack based on count
            for (int j = 0; j < crops.size(); j++) {
                int maxIndex = 0;
                int maxCount = count[0];

                // find the crop with the highest count
                for (int k = 1; k < count.length; k++) {
                    if (count[k] > maxCount) {
                        maxIndex = k;
                        maxCount = count[k];
                    }
                }
               // push the crop into the stack
                State_stack[i].push(crops.get(maxIndex), maxCount);
                count[maxIndex] = -1; // mark the count as -1 to avoid re-selection
            }
        }
        
    return State_stack;
    }


    //Step 3: Queue for andhra pradash based on year column
    private static queue State_Queue(LinkedList state){
        queue State_queue = new queue();
        ArrayList<String> years = unique_Words(state, "Year");
        years.sort(null);
        Node temp = state.head;
        for (String year : years) {
            temp = state.head;
            while (temp != null) {
                if (temp.year.equals(year)) {
                    State_queue.enqueue(new Node(temp.state, temp.district, temp.year, temp.crop_name));
                }
                temp = temp.next;
            }
        }


        return State_queue;
    }

  
}
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Pbl {
   public static void main(String[] args) {
    Linkedlist Data = Readfile();
    
    //Step 1
    Linkedlist Gender[] = Gender(Data);
    Linkedlist Male = Gender[0];
    Linkedlist Female = Gender[1];


    //Step 2
    Stack Male_Avg = Average(Male);


    Stack Female_Avg = Average(Female);

    //Step 3
    Queue[] Parental_Queues = Parental_Queue(Male_Avg,Female_Avg);
    Queue Some_High_School = Parental_Queues[0];
    Queue High_School = Parental_Queues[1];
    Queue Some_College = Parental_Queues[2];
    Queue Associate_Degree = Parental_Queues[3];
    Queue Bachelor_Degree = Parental_Queues[4];
    Queue Master_Degree = Parental_Queues[5]; 

    //Step 4
    Queue[] Group_Queues = Group_Queue(Male_Avg,Female_Avg);
    Queue Group_A = Group_Queues[0];
    Queue Group_B = Group_Queues[1];
    Queue Group_C = Group_Queues[2];
    Queue Group_D = Group_Queues[3];
    Queue Group_E = Group_Queues[4];

    // Problem 1 finding best average by simply peeking the start of the queue
    
    System.out.println("Best Average in Group A: " + Group_A.first.average_score);
    System.out.println("Best Average in Group B: " + Group_B.first.average_score);
    System.out.println("Best Average in Group C: " + Group_C.first.average_score);
    System.out.println("Best Average in Group D: " + Group_D.first.average_score);
    System.out.println("Best Average in Group E: " + Group_E.first.average_score);
    System.out.println("------------------------------------------------");
    // Problem 2 finding the gender which perfomed best at various parental levels

    System.out.println("The Gender which perfomed better with parental education level of Some High School is : "
     + Some_High_School.first.gender);
    System.out.println("The gender which perfomed better with parental education level of High School is : "
     + High_School.first.gender);
    System.out.println("The Gender which perfomed better with parental education level of Some College is : "
     + Some_College.first.gender);
    System.out.println("The Gender which perfomed better with parental education level of Associate's Degree is : "
     + Associate_Degree.first.gender);
    System.out.println("The Gender which perfomed better with parental education level of Bachelor's Degree is : "
     + Bachelor_Degree.first.gender);
     System.out.println("The Gender which perfomed better with parental education level of Master's Degree is : "
     + Master_Degree.first.gender);
     
    System.out.println("------------------------------------------------");
     // Problem 3 Group which perfomed best at all parental education levels
     // We will check the group which has the highest average score in each queue and add a point to their score
    
     int scores[] = new int[5];
      scores[0] = Group_A.first.average_score;
      scores[1] = Group_B.first.average_score;
      scores[2] = Group_C.first.average_score;
      scores[3] = Group_D.first.average_score;
      scores[4] = Group_E.first.average_score;
      int maxScore = 0;
      String groupName = "";

      if (Group_A.first.average_score > maxScore) {
          maxScore = Group_A.first.average_score;
          groupName = "Group A";
      }
      if (Group_B.first.average_score > maxScore) {
          maxScore = Group_B.first.average_score;
          groupName = "Group B";
      }
      if (Group_C.first.average_score > maxScore) {
          maxScore = Group_C.first.average_score;
          groupName = "Group C";
      }
      if (Group_D.first.average_score > maxScore) {
          maxScore = Group_D.first.average_score;
          groupName = "Group D";
      }
      if (Group_E.first.average_score > maxScore) {
          maxScore = Group_E.first.average_score;
          groupName = "Group E";
      }

      System.out.println("The highest average score at all parental levels is in " + groupName);
        
    System.out.println("------------------------------------------------");
    
    //Problem 4 Median of average marks obtained by Male & Female students
    // Problem 4
    double maleMedian = calculateMedian(Male_Avg);
    double femaleMedian = calculateMedian(Female_Avg);
    
    System.out.println("Median of average marks obtained by Male students: " + maleMedian);
    System.out.println("Median of average marks obtained by Female students: " + femaleMedian);
  
    
  }
   
      
   

  //Reading from csv file into linkedlist
   public static Linkedlist Readfile(){
     Linkedlist Data = new Linkedlist();
     //Reading from csv file and txt file
     File file=new File("exams.csv");
     try {
         Scanner scan = new Scanner(file);
         scan.nextLine();//skip the first line
         while (scan.hasNextLine()){
            Data.add(scan.nextLine().replace("\"", "").split(","));
         }
         scan.close();
     } catch (FileNotFoundException e) {
         throw new RuntimeException(e);
     }
   return Data;
   }


   //Step 1
    public static Linkedlist[] Gender( Linkedlist Data){
      Linkedlist Genderlists[] = new Linkedlist[2];
      Genderlists[0] = new Linkedlist();
      Genderlists[1] = new Linkedlist();

      for(Node temp = Data.head; temp!=null; temp=temp.next){
        if(temp.gender.equalsIgnoreCase("Male")){ 
        Genderlists[0].add(temp);
        }

        if(temp.gender.equalsIgnoreCase("Female")){ 
          Genderlists[1].add(temp);
        }
      }
      return Genderlists;
    }


    //Step 2
    public static Stack Average(Linkedlist list){
    Stack avg = new Stack();
    Node current = list.head;
    
      // Iterate through the linked list
      while (current != null) {
          Node temp = current.next; // Save the next node before modifying 'current'
          current.next = null; // Disconnect 'current' from the rest of the list
          // Insert 'current' into the stack in ascending order of scores
          insertInDescendingOrder(avg, current);
          current = temp; // Move to the next node
          }
    
        return avg;
      }

  
     // Method to insert a node into the stack with the highest score on top
    public static void insertInDescendingOrder(Stack stack, Node newNode) {
      
      if (stack.isEmpty() || newNode.average_score > stack.peek().average_score) {
          stack.push(newNode); // Push the new node to the top if it has the highest score
      } else {
          Stack tempStack = new Stack();
          // Pop elements from 'stack' and push them to 'tempStack' until we find the correct position for 'newNode'
          while (!stack.isEmpty() && stack.peek().average_score > newNode.average_score) {
              tempStack.push(stack.pop());
          }

          stack.push(newNode); // Insert 'newNode' into 'stack'

          // Pop elements from 'tempStack' and push them back to 'stack'
          while (!tempStack.isEmpty()) {
              stack.push(tempStack.pop());
          }
      }
  }


     // Step 3
     public static Queue[] Parental_Queue(Stack stck1, Stack stck2){
      // [0] Some high school, [1] High school, [2] Some college, [3] Associate's degree, [4] Bachelor's degree, [5] Master's degree
      Queue[] Queues = new Queue[6];

      //Init each queue
      for (int i = 0; i < Queues.length; i++) {
        Queues[i] = new Queue();
      }
      
      Node Male_Temp = stck1.top;
      Node Female_Temp = stck2.top;

      while (Male_Temp!=null || Female_Temp!=null) {
        if(Male_Temp==null || Female_Temp.average_score>=Male_Temp.average_score){
          if(Female_Temp.parental_level.equals("some high school")){
            Queues[0].enqueue(Female_Temp);
          }
          else if(Female_Temp.parental_level.equals("high school")){
            Queues[1].enqueue(Female_Temp);
          }
          else if(Female_Temp.parental_level.equals("some college")){
            Queues[2].enqueue(Female_Temp);
          }
          else if(Female_Temp.parental_level.equals("associate's degree")){
            Queues[3].enqueue(Female_Temp);
          }
          else if(Female_Temp.parental_level.equals("bachelor's degree")){
            Queues[4].enqueue(Female_Temp);
          }
          else if(Female_Temp.parental_level.equals("master's degree")){
            Queues[5].enqueue(Female_Temp);
          }
          Female_Temp = Female_Temp.next;
        }
        else{
          if(Male_Temp.parental_level.equals("some high school")){
            Queues[0].enqueue(Male_Temp);
          }
          else if(Female_Temp.parental_level.equals("high school")){
            Queues[1].enqueue(Male_Temp);
          }
          else if(Female_Temp.parental_level.equals("some college")){
            Queues[2].enqueue(Male_Temp);
          }
          else if(Female_Temp.parental_level.equals("associate's degree")){
            Queues[3].enqueue(Male_Temp);
          }
          else if(Female_Temp.parental_level.equals("bachelor's degree")){
            Queues[4].enqueue(Male_Temp);
          }
          else if(Female_Temp.parental_level.equals("master's degree")){
            Queues[5].enqueue(Male_Temp);
          }
          Male_Temp = Male_Temp.next;
        }
      } 

      return Queues;
     }

     // Step 4
     public static Queue[] Group_Queue(Stack stck1, Stack stck2){
      // [0] Group A, [1] Group B, [2] Group C, [3] Group D, [4] Group E
      Queue[] Queues = new Queue[5];
      //Init each queue
      for (int i = 0; i < Queues.length; i++) {
        Queues[i] = new Queue();
      }

      Node Male_Temp = stck1.top;
      Node Female_Temp = stck2.top;

      while (Male_Temp!=null || Female_Temp!=null) {
        if(Male_Temp==null || Female_Temp.average_score>=Male_Temp.average_score){
          if(Female_Temp.group.equalsIgnoreCase("group A")){
            Queues[0].enqueue(Female_Temp);
          }
          else if(Female_Temp.group.equalsIgnoreCase("group B")){
            Queues[1].enqueue(Female_Temp);
          }
          else if(Female_Temp.group.equalsIgnoreCase("group C")){
            Queues[2].enqueue(Female_Temp);
          }
          else if(Female_Temp.group.equalsIgnoreCase("group D")){
            Queues[3].enqueue(Female_Temp);
          }
          else if(Female_Temp.group.equalsIgnoreCase("group E")){
            Queues[4].enqueue(Female_Temp);
          }
          Female_Temp = Female_Temp.next;
        }
        else{
          if(Male_Temp.group.equalsIgnoreCase("group A")){
            Queues[0].enqueue(Female_Temp);
          }
          else if(Male_Temp.group.equalsIgnoreCase("group B")){
            Queues[1].enqueue(Female_Temp);
          }
          else if(Male_Temp.group.equalsIgnoreCase("group C")){
            Queues[2].enqueue(Female_Temp);
          }
          else if(Male_Temp.group.equalsIgnoreCase("group D")){
            Queues[3].enqueue(Female_Temp);
          }
          else if(Male_Temp.group.equalsIgnoreCase("group E")){
            Queues[4].enqueue(Female_Temp);
          }
          Male_Temp = Male_Temp.next;
        }
      } 
       
      return Queues;
      }


    // Calculate medain for problem 4
      public static double calculateMedian(Stack stack) {
        int size = stack.size;
        double[] scores = new double[size];
        
        // Store the scores in an array
        for (int i = 0; i < size; i++) {
            scores[i] = stack.pop().average_score;
        }
        
        // Sort the scores in ascending order
        Arrays.sort(scores);
        
        // Calculate the median
        if (size % 2 == 0) {
            int middleIndex = size / 2;
            return (scores[middleIndex - 1] + scores[middleIndex]) / 2;
        } else {
            int middleIndex = size / 2;
            return scores[middleIndex];
        }
    }
    }


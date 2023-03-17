package SW081;

import java.util.Arrays;
import java.util.Collections;

public class Steps {
static Queue main,clear,snowy,rainy,mondayQ,tuesdayQ,wednesdayQ,thursdayQ,fridayQ,saturdayQ,sundayQ;
static BST HitandRun,NotHitandRun;
static int[] Deaths;
static int[] Friday;
public static void main(String[] args) {
		initialize();
		stepOne();
		stepTwo();
		stepThree();
		stepFour();
		popstulate();
	}
	private static void initialize() {
		main= new Queue();
		clear = new Queue();
		snowy = new Queue();
		rainy = new Queue();
		mondayQ=new Queue();
        tuesdayQ=new Queue();
        wednesdayQ=new Queue();
        thursdayQ=new Queue();
        fridayQ=new Queue();
        saturdayQ=new Queue();
        sundayQ=new Queue();
		HitandRun = new BST();
		NotHitandRun = new BST();
		
	}
	public static void stepOne(){
		Insertion Import = new Insertion();
		Import.Combine(main);
	}
	
	public static void stepTwo() {
		Queue.Node TempNode = main.Front;
		if(TempNode!= null) {
			while(TempNode !=null){
				
			if(TempNode.Weather.contains("clear")) {
				clear.Add(TempNode.Year, TempNode.Month, TempNode.Day, TempNode.HitAndRun, TempNode.Lighting, TempNode.Weather, TempNode.Casuality);
			}
			else if(TempNode.Weather.contains("Snow")) {
				snowy.Add(TempNode.Year, TempNode.Month, TempNode.Day, TempNode.HitAndRun, TempNode.Lighting, TempNode.Weather, TempNode.Casuality);
			}
			else if(TempNode.Weather.contains("Rain")) {
				rainy.Add(TempNode.Year, TempNode.Month, TempNode.Day, TempNode.HitAndRun, TempNode.Lighting, TempNode.Weather, TempNode.Casuality);
			}
			
				TempNode= TempNode.next;
			}
		}
		else {
			System.out.println("LIST IS EMPTY!");
		}
		
	}

	public static void stepThree() {
		Queue.Node TempNode= main.Front;
		if(TempNode!=null) {
			while(TempNode!=null) {
				if(TempNode.Day.contains("Monday")) {
					mondayQ.Add(TempNode.Year, TempNode.Month, TempNode.Day, TempNode.HitAndRun, TempNode.Lighting, TempNode.Weather, TempNode.Casuality);
				}
				else if(TempNode.Day.contains("Tuesday")) {
					tuesdayQ.Add(TempNode.Year, TempNode.Month, TempNode.Day, TempNode.HitAndRun, TempNode.Lighting, TempNode.Weather, TempNode.Casuality);
				}
				else if(TempNode.Day.contains("Wednesday")) {
					wednesdayQ.Add(TempNode.Year, TempNode.Month, TempNode.Day, TempNode.HitAndRun, TempNode.Lighting, TempNode.Weather, TempNode.Casuality);
				}
				else if(TempNode.Day.contains("Thursday")) {
					thursdayQ.Add(TempNode.Year, TempNode.Month, TempNode.Day, TempNode.HitAndRun, TempNode.Lighting, TempNode.Weather, TempNode.Casuality);
				}
				else if(TempNode.Day.contains("Friday")) {
					fridayQ.Add(TempNode.Year, TempNode.Month, TempNode.Day, TempNode.HitAndRun, TempNode.Lighting, TempNode.Weather, TempNode.Casuality);
				}
				else if(TempNode.Day.contains("Saturday")) {
					saturdayQ.Add(TempNode.Year, TempNode.Month, TempNode.Day, TempNode.HitAndRun, TempNode.Lighting, TempNode.Weather, TempNode.Casuality);
				}
				else if(TempNode.Day.contains("Sunday")) {
					sundayQ.Add(TempNode.Year, TempNode.Month, TempNode.Day, TempNode.HitAndRun, TempNode.Lighting, TempNode.Weather, TempNode.Casuality);
				}
				TempNode=TempNode.next;
				
			}
		}
		else {
			System.out.println("LIST IS EMPTY!");
		}
	}

	public static void stepFour() {
		//keep track of data for all months
		int[] Hit = new int[12];
		int[] notHit = new int[12];
		
		Queue.Node TempNode = main.Front;
		if(TempNode!= null) {
			while(TempNode !=null){
				if(TempNode.HitAndRun.equals("Hit-and-run")) {
					 if(TempNode.Month.equals("January")){
			                Hit[0]++;
			            }else if(TempNode.Month.equals("February")){
			              Hit[1]++;
			            }
			            else if(TempNode.Month.equals("March")){
				          Hit[2]++;
				        }
			            else if(TempNode.Month.equals("April")){
			              Hit[3]++;
			            }else if(TempNode.Month.equals("June")){
			              Hit[5]++;
			            }else if(TempNode.Month.equals("May")){
			              Hit[4]++;
			            }else if(TempNode.Month.equals("July")){
			              Hit[6]++;
			            }else if(TempNode.Month.equals("August")){
			              Hit[7]++;
			            }else if(TempNode.Month.equals("September")){
			              Hit[8]++;
			            }else if(TempNode.Month.equals("October")){
			              Hit[9]++;
			            }else if(TempNode.Month.equals("November")){
			              Hit[10]++;
			            }
			            else if(TempNode.Month.equals("December")){
				          Hit[11]++;
				        }
				}
				else if(TempNode.HitAndRun.equals("Not hit-and-run")) {
					 if(TempNode.Month.equals("January")){
			              notHit[0]++;
			          }else if(TempNode.Month.equals("March")){
			            notHit[2]++;

			          }else if(TempNode.Month.equals("February")){
			            notHit[1]++;

			          }else if(TempNode.Month.equals("April")){
			            notHit[3]++;
			          }else if(TempNode.Month.equals("June")){
			            notHit[5]++;
			          }else if(TempNode.Month.equals("May")){
			            notHit[4]++;
			          }else if(TempNode.Month.equals("July")){
			            notHit[6]++;
			          }else if(TempNode.Month.equals("August")){
			            notHit[7]++;
			          }else if(TempNode.Month.equals("September")){
			            notHit[8]++;
			          }else if(TempNode.Month.equals("October")){
			            notHit[9]++;
			          }else if(TempNode.Month.equals("November")){
			            notHit[10]++;
			          }else if(TempNode.Month.equals("December")){
				        notHit[11]++;
				      }
			          
				}
				TempNode=TempNode.next;
			}
	
		}
		 String months[] = {
		            "January", "February","March","April","May",
		            "June","July","August","September","October",
		            "November","December",
		          };
		 for(int i = 0 ; i < 12 ; i++){
             HitandRun.insert(months[i], Hit[i]);
             NotHitandRun.insert(months[i], notHit[i]);

         }
		 
	}

	public static void p1() {
		Queue.Node temp = main.Front; 
		Deaths = new int[7];
		Friday= new int[12];
		int deadliestFriday;
		int deadliestDay;
		if(temp!=null) {
			while(temp!=null) {
				if(temp.Day.contains("Monday")&& temp.Casuality.contains("Fatal injury (K)")){
					Deaths[0]++;
				}
				else if(temp.Day.contains("Tuesday")&& temp.Casuality.contains("Fatal injury (K)")){
					Deaths[1]++;
				}
				else if(temp.Day.contains("Wednesday")&& temp.Casuality.contains("Fatal injury (K)")){
					Deaths[2]++;
				}
				else if(temp.Day.contains("Thursday")&& temp.Casuality.contains("Fatal injury (K)")){
					Deaths[3]++;
				}
				else if(temp.Day.contains("Saturday")&& temp.Casuality.contains("Fatal injury (K)")){
					Deaths[5]++;
				}
				else if(temp.Day.contains("Sunday")&& temp.Casuality.contains("Fatal injury (K)")){
					Deaths[6]++;
				}
				else if(temp.Day.contains("Friday")&& temp.Casuality.contains("Fatal injury (K)")){
					Deaths[4]++;
					if(temp.Month.contains("January")) {
						Friday[0]++;
					}
					else if(temp.Month.contains("Feburary")) {
						Friday[1]++;
					}
					else if(temp.Month.contains("March")) {
						Friday[2]++;
					}else if(temp.Month.contains("April")) {
						Friday[3]++;
					}else if(temp.Month.contains("May")) {
						Friday[4]++;
					}else if(temp.Month.contains("June")) {
						Friday[5]++;
					}else if(temp.Month.contains("July")) {
						Friday[6]++;
					}else if(temp.Month.contains("August")) {
						Friday[7]++;
					}else if(temp.Month.contains("September")) {
						Friday[8]++;
					}else if(temp.Month.contains("October")) {
						Friday[9]++;
					}else if(temp.Month.contains("November")) {
						Friday[10]++;
					}else if(temp.Month.contains("December")) {
						Friday[11]++;
					}
				}


			temp= temp.next;	
			}
		}
		else {
			System.out.println("List is empty");
		}
		
		deadliestFriday = findmax(Friday);
		deadliestDay = findmax(Deaths);
		
		switch(deadliestDay){
		case 0 -> System.out.println("Deadliest day is Monday");	
		case 1 -> System.out.println("Deadliest day is Tueday");	
		case 2 -> System.out.println("Deadliest day is Wednesday");	
		case 3 -> System.out.println("Deadliest day is Thursday");	
		case 4 -> System.out.println("Deadliest day is Friday");	
		case 5 -> System.out.println("Deadliest day is Saturday");	
		case 6 -> System.out.println("Deadliest day is Sunday");	
		}
		
		switch(deadliestFriday) {
		case 0 -> System.out.println("Deadliest friday is in the January");
		case 1 -> System.out.println("Deadliest friday is in the Febuary");
		case 2 -> System.out.println("Deadliest friday is in the March");
		case 3 -> System.out.println("Deadliest friday is in the April");
		case 4 -> System.out.println("Deadliest friday is in the May");
		case 5 -> System.out.println("Deadliest friday is in the June");
		case 6 -> System.out.println("Deadliest friday is in the July");
		case 7 -> System.out.println("Deadliest friday is in the August");
		case 8 -> System.out.println("Deadliest friday is in the September");
		case 9 -> System.out.println("Deadliest friday is in the October");
		case 10 -> System.out.println("Deadliest friday is in the November");
		case 11 -> System.out.println("Deadliest friday is in the December");
		
		}
		
	}
	public static void p2() {
	int[] rainyCrashes = new int[12];
	Queue.Node temp= rainy.Front;
	while(temp!=null) {
		if(temp.Month.contains("January")) {
			rainyCrashes[0]++;
		}
		if(temp.Month.contains("February")) {
			rainyCrashes[1]++;
		}if(temp.Month.contains("March")) {
			rainyCrashes[2]++;
		}if(temp.Month.contains("April")) {
			rainyCrashes[3]++;
		}if(temp.Month.contains("May")) {
			rainyCrashes[4]++;
		}if(temp.Month.contains("June")) {
			rainyCrashes[5]++;
		}if(temp.Month.contains("July")) {
			rainyCrashes[6]++;
		}if(temp.Month.contains("August")) {
			rainyCrashes[7]++;
		}if(temp.Month.contains("September")) {
			rainyCrashes[8]++;
		}if(temp.Month.contains("October")) {
			rainyCrashes[9]++;
		}if(temp.Month.contains("November")) {
			rainyCrashes[10]++;
		}if(temp.Month.contains("December")) {
			rainyCrashes[11]++;
		}
		temp= temp.next;	
		}
	 System.out.println("January rainy day Crashes:"+rainyCrashes[0]);
     System.out.println("Febuary rainy day Crashes:"+rainyCrashes[1]);
     System.out.println("March rainy day Crashes:"+rainyCrashes[2]);
     System.out.println("April rainy day Crashes:"+rainyCrashes[3]);
     System.out.println("May rainy day Crashes:"+rainyCrashes[4]);
     System.out.println("June rainy day Crashes:"+rainyCrashes[5]);
     System.out.println("July rainy day Crashes:"+rainyCrashes[6]);
     System.out.println("August rainy day Crashes:"+rainyCrashes[7]);
     System.out.println("September rainy day Crashes:"+rainyCrashes[8]);
     System.out.println("October rainy day Crashes:"+rainyCrashes[9]);
     System.out.println("November rainy day Crashes:"+rainyCrashes[10]);
     System.out.println("December rainy day Crashes:"+rainyCrashes[11]);
	}
	
	public static void p3() {
		System.out.print("Maximum amount of hit and runs are ");
		HitandRun.max();
		System.out.print("Minimum amount of hit and runs are ");
		HitandRun.min();
		System.out.print("Maximum amount of not hit and runs are ");
		NotHitandRun.max();
		System.out.print("Minimum amount of hit and runs are ");
		NotHitandRun.min();
	}
	
	public static void popstulate() {
	int mon= getDarkCrash(mondayQ);
	int tue= getDarkCrash(tuesdayQ);
	int sat= getDarkCrash(saturdayQ);
	int sun= getDarkCrash(sundayQ);
	
	if(mon+tue<sat+sun) {
    	System.out.println("Yes, Weekends have more crashes in unlit enviroment");
    }
	else {
    	System.out.println("No, Weekdays have more crashes in unlit enviroment");
    }
	
	}
	
	public static int getDarkCrash(Queue Q) {
		Queue.Node current = Q.Front;
		int crashes=0;
		
		while(current!=null) {
			if(current.Lighting.contains("Dark unlighted")) {
				crashes++;
			}
			current=current.next;
		}
		return crashes;
	}
	
	public static int findmax(int[] arr) {
		int max=0;
		for (int i = 0; i < arr.length; i++) {  
            //Compare elements of array with max  
           if(arr[i] > arr[max])  
               max = i;  
        }  
			return max;
	}  
	
}

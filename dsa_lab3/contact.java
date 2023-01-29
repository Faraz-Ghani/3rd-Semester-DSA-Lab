package dsa_lab3;

import java.util.Scanner;

/*input array
 * display array
 * search
 * Exit
 * increase
 * deletion
 * exit
 */
public class contact {

public static int[] arr ;
	static Scanner sc = new Scanner(System.in);
	
     static void menu() throws Exception {
	int X;
	System.out.println("");
	System.out.println("1)Input array");
	System.out.println("2)Output array");
	System.out.println("3)Display");
	System.out.println("4)Search array");
	System.out.println("5)update");
	System.out.println("6)Deletion");
	System.out.println("7)Exit");
	System.out.println("");

	System.out.println("Enter your choice Please");
	
	X=sc.nextInt();
	
	
	switch(X) {
	case 1:
	input();
		break;
	case 2:
		output();
		break;	
	case 3:
		display();
		break;
			
	case 4:
		search();
		break;
			
	case 5:
		update();
		break;
			
	case 6:
		Deletion();
		break;
			
	case 7:
		Exit();
		System.exit(0);
		break;
	}
	
}
public static  void input() throws Exception {
System.out.println("Input Number of elements");	
int i = sc.nextInt();
arr= new int[i] ;
for(int j = 0 ;j<i;j++) {
	System.out.println("Enter Element No :"+ (j));
	arr[j]=sc.nextInt();
}
}

public static void output()throws Exception {
System.out.println("Array Is Displayed below");
for(int i = 0 ; i<arr.length; i++) {
	System.out.print(arr[i]+ " , ");
}
}
public static void display() throws Exception{
output();
}
public static void search()throws Exception {
System.out.println("Which element you want to search for");
int search = sc.nextInt();
for(int i = 0 ; i<arr.length;i++) {
	if(arr[i]==search) {
		System.out.println("Element found on index "+i);
	}
}
}
public static void update()throws Exception {
System.out.println("Which element you want to update, enter it's index");
int input=sc.nextInt();
System.out.println("The current element is "+arr[input]);
System.out.println("What do u want to replace it with?");
arr[input]=sc.nextInt();
System.out.println("Updated");

}

public static void Deletion() throws Exception{
System.out.println("Deletion");	
System.out.println("Which element you want to Delete, enter it's index");
int input=sc.nextInt();
System.out.println("The current element is "+arr[input]);
System.out.println("input 1 if you want to delete ");

if(sc.nextInt()==1) {
	arr[input]=0;
}

}
public static void Exit() {
System.out.println("Exit");	
System.exit(1);
}

	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
while(true) {
		menu();

	}}

}

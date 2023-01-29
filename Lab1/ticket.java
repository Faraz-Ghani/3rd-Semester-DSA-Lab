package Lab1;

import java.util.Scanner;

public class ticket {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter age");
	int age=sc.nextInt();
	
	
	if(age<13 && age>0) {
System.out.println("price is 5$");	
	}
	else if(age>=13 && age<=65) {
		System.out.println("price is 10$");	
				
	}
	else if(age>65) {
		System.out.println("price is 7$");
	}
	else{
		System.out.println("Invalid age");
	}
}
}

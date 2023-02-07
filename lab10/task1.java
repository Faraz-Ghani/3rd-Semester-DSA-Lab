package lab10;

import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
Scanner Sc = new Scanner(System.in);
System.out.println("Input the number u want a factorial of");
int input = Sc.nextInt();
int fact = factorial(input);
System.out.println("Factoria of "+input+" is "+fact);
	}
	public static int factorial(int n){    
		  if (n == 0)    
		    return 1;    
		  else    
		    return(n * factorial(n-1));    
		 }    
}

package lab10;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Input the number u want to print to");
		int n = Sc.nextInt();
		print(n);
	}

	public static void print(int n) {
		  if (n > 0) {
			  print(n - 1);
			  System.out.print(n+" ");
		  }
	}

}

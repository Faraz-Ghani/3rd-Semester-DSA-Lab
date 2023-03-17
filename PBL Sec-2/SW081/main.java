package SW081;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
Steps s = new Steps();
s.main(args);
		
Scanner sc = new Scanner(System.in);
while (true) {
	System.out.println();
	System.out.println("Enter a number :");
	System.out.println("Problem 1 (1)");
	System.out.println("Problem 2 (2)");
	System.out.println("Problem 3 (3)");
	System.out.println("Popsulate (4)");
	System.out.println("Exit (0)");
	System.out.println();
	
	int input =sc.nextInt();
	switch(input) {
	case 0 -> System.exit(1);
	case 1 -> s.p1();
	case 2 -> s.p2();
	case 3 -> s.p3();
	case 4 -> s.popstulate();
	}
	
}
}

}

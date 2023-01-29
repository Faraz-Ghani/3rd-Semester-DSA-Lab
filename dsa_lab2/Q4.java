package dsa_lab2;
import java.math.*;
import java.util.Random;
public class Q4 {

	public static void main(String[] args) {
		Random rand = new Random();
	boolean hit;	// TODO Auto-generated method stub
	int et,ct;
 	int et_score = 0,ct_score = 0;
	et = rand.nextInt(6);
	ct = et;
	System.out.println("Number of plyers ");
	System.out.println("Your team "+ct);
	System.out.println("Enemy team "+et);
	
	for(int i = 0; i<et ; i++) {
		hit = hitornot();
		if(hit) {
			System.out.println("you got hit!");
			
			et_score++;
			
		}
		if(!hit){
			System.out.println("Enemy got hit");

			ct_score++;
		}
		
	}
	if(ct_score>et_score) {
	System.out.println("your team won");}
	else {
		System.out.println("Enemy team won");
	}
	}

	public static boolean hitornot() {
		boolean hit;
		int a,b;
		a = (int)(Math.random()*8);
		b = (int)(Math.random()*8);
		System.out.println();
		System.out.println("Pair of numbers :"+a);
		System.out.println("Pair of numbers :"+b);

		if(a==b) {
		hit=true;
		}
		else{
	hit= false;
		}
		return hit;
		
		
	}

}

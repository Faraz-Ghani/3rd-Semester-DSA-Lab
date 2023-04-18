package dsa;

public class fact {
int fact;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(fact(4));
	}
public static int fact(int fact) {
	
	if(fact==0 || fact==1) {
		return 1;
	}
	else return fact * fact(fact-1);
	
}
}

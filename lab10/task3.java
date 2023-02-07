package lab10;

public class task3 {
	static int n1=0,n2=1,n3=0;
	public static void main(String[] args) {
		System.out.print(n1+" "+n2+" ");
Fibonacci(10-2);
	}
	
	static void Fibonacci(int count){  
		
	    if(count>0){    
	         n3 = n1 + n2;    
	         n1 = n2;    
	         n2 = n3;    
	         System.out.print(n3+" ");   
	         Fibonacci(count-1);    
	     }    
	 }    
}

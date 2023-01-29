package dsa_lab2;

public class q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double price_per_bag =5.50;
		double large20=1.8;
		double medium10=1;
		double small5=0.6;
		int largecount = 0,mediumcount = 0,smallcount = 0;
	double total=0;
		
int order =32;

System.out.println("Number of bags :"+order);

while(order%5!=0) {
	order++;
}
while(order>0) {
	if(order>=20) {
		largecount++;
		order-=20;
	}
	else if(order >=10) {
		mediumcount++;
		order-=10;
	}
	else if(order >=5) {
		smallcount++;
		order-=5;
	}
}
total+=largecount*large20;
total+=mediumcount*medium10;
total+=smallcount*small5;
System.out.println("Large boxes : "+largecount);
System.out.println("Medium boxes : "+mediumcount);
System.out.println("Small boxes : "+smallcount);

System.out.println("The total is $"+total);
	}

}

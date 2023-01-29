package dsa_lab3;

import java.util.Scanner;

class ContactApp{
	String[][] Contact= new String[20][2];
	int count=0;
	String input;
	Scanner sc = new Scanner(System.in);
	public void display(){
		for(int i=0 ; i<count;i++) {
			System.out.println("Name : "+Contact[i][0] +" Number : "+Contact[i][1]);
		}
	}
	public void add(){
		System.out.println("Enter the name of the contact ");
		Contact[count][0]=sc.next();
		System.out.println("Enter the number of "+Contact[count][0]);
		Contact[count][1]=sc.next();
		count++;
	}
	public void update(){
		System.out.println("Enter the person whose number you want to update");
		input = sc.next();
		for(int i=0;i<count;i++) {
			if(input.equalsIgnoreCase(Contact[i][0].toString())) {
				System.out.println("Enter the new name of "+Contact[i][0]);
				Contact[i][0]= sc.next();
			}
		}
	}
	public void delete() {
		System.out.println("Enter the person whose number you want to delete");
		input = sc.next();
		for(int i=0;i<count;i++) {
			if(input.equalsIgnoreCase(Contact[i][0].toString())) {
				System.out.println("Contact for "+Contact[i][0]+" has been deleted");
				Contact[i][0]="";
				Contact[i][1]="";
				count--;
			}
		}
	}
	
	public void search(){
		System.out.println("Enter the person whose number you want to search");
		input = sc.next();
		for(int i=0;i<count;i++) {
			if(input.equalsIgnoreCase(Contact[i][0].toString())) {
				System.out.println("Name : "+Contact[i][0] +" Number : "+Contact[i][1]);
			
			}
		}
	}
}
public class task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ContactApp abc = new ContactApp();
abc.add();
abc.add();
abc.display();
abc.search();
abc.update();
abc.delete();
abc.display();
	}

}

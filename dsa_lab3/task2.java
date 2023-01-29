package dsa_lab3;

import java.util.Scanner;

class FireAir{
	String[] Song= new String[20];
	String input;
	int count;
	Scanner sc = new Scanner(System.in);
	public void display(){
		for(int i=0 ; i<count;i++) {
			System.out.println("Song Name : "+Song[i]);
		}
	}
	public void add(){
		System.out.println("Enter the name of the Song ");
		Song[count]=sc.next();
		count++;
	}
	public void update(){
		System.out.println("Enter the song index whose name you want to update");
		input=sc.next();
				System.out.println("Enter the new name of "+Song[Integer.parseInt(input)]);
				Song[Integer.parseInt(input)]=sc.next();
		
	}
	public void delete() {
		System.out.println("Enter the song name you want to delete");
		input = sc.next();
		for(int i=0;i<count;i++) {
			if(input.equalsIgnoreCase(Song[i].toString())) {
				System.out.println(Song[i]+" has been deleted");
				
				Song[i]=Song[i+1];
				Song[i+1]="";
				count--;
				
				
			}
		}
	}
	
	public void search(){
		System.out.println("Enter the index of the song you want to search");
		input = sc.next();
		System.out.println("The song at index "+input+" is "+Song[Integer.parseInt(input)]);
	}
}

public class task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FireAir mp4= new FireAir();
mp4.add();
mp4.add();
mp4.display();
mp4.search();
mp4.update();
mp4.delete();
mp4.display();
	}

}

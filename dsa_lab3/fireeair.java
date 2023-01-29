package dsa_lab3;
import java.util.Scanner;
import java.util.ArrayList;
public class fireeair{
	ArrayList<String> Songs = new ArrayList<String>();
	Scanner sc = new Scanner(System.in);
	
void Display() {
	for(int i = 0 ; i<Songs.size(); i++) {
		System.out.println(Songs.get(i));
	}
}

void Add() {
	System.out.println("Enter the Song name");
	Songs.add(sc.next());

}
void Search() {
	System.out.println("Enter the Song name you want to search for");
	String input= sc.next();
	for(int i = 0 ; i<Songs.size(); i++) {

		if(input.equalsIgnoreCase(Songs.get(i))) {
			System.out.println(Songs.get(i)+" Found at index "+i);
		}
	}
	
}
void Update() {
	System.out.println("Enter the Song name you want to update");
	String input= sc.next();
	for(int i = 0 ; i<Songs.size(); i++) {

		if(input.equalsIgnoreCase(Songs.get(i))) {
			
			System.out.println("Song Found at index "+i);
			System.out.println("Enter the updated song name");
			input=sc.next();
			Songs.remove(i);
			Songs.add(i, input);
		
		}
	}	
	
	
}
void delete() {
	System.out.println("Enter the Song name you want to delete");
	String input= sc.next();
	for(int i = 0 ; i<Songs.size(); i++) {

		if(input.equalsIgnoreCase(Songs.get(i))) {
			Songs.remove(i);
			System.out.println(input+" at index "+i+" has been removed");
		}
	}
}

}

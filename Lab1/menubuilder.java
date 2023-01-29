package Lab1;
import java.util.ArrayList;
public class menubuilder {
    public static void main(String[] args) {

        // Create a variable called menuTitle of type String and assign it the value "My
        // Dream Menu:".
String menuTitle="MyDreamMenu";
        // Print the menuTitle variable to the console.
System.out.println(menuTitle);
        // Create a variable called menu of type ArrayList.
ArrayList<String> menu= new ArrayList<String>();
        // Create a variable called starter of type string and pass in the name of
        // your favourite starter.
String starter="Cheeseballs";
        // Add the starter variable to the ArrayList called menu.
menu.add(starter);
        // Create a variable called mainCourse of type string and pass in the name of
        // your favourite main course.
String mainCourse="Pizza";
        // Add the mainCourse variable to the ArrayList called menu.
menu.add(mainCourse);
// Create a variable called dessert of type string and pass in the name of
        // your favourite dessert.
String dessert = "Ice cream";
        // Add the dessert variable to the ArrayList called menu.
menu.add(dessert);
        // Print the menu variable to the console.
    System.out.println(menu);
    }

}

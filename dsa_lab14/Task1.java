package dsa_lab14;

import java.util.Hashtable;
import java.util.Scanner;

public class Task1 {
	private Hashtable<String, String> contacts;

	public Task1() {
		contacts = new Hashtable<String, String>();
	}

	public void displayContacts() {
		System.out.println("Contacts:");
		System.out.println("-------------------------");
		for (String name : contacts.keySet()) {
			System.out.println(name + " -> " + contacts.get(name));
		}
		System.out.println("-------------------------");
	}

	public void searchContact(String name) {
		if (contacts.containsKey(name)) {
			System.out.println(name + " -> " + contacts.get(name));
		} else {
			System.out.println("Contact not found.");
		}
	}

	public void addContact(String name, String number, int index) {
		if (index < 0 || index > contacts.size()) {
			System.out.println("Invalid index.");
			return;
		}
		contacts.put(name, number);
		if (index == contacts.size() - 1) {
			return;
		}
		int i = 0;
		Hashtable<String, String> temp = new Hashtable<String, String>();
		for (String n : contacts.keySet()) {
			if (i == index) {
				temp.put(name, number);
			}
			if (!n.equals(name)) {
				temp.put(n, contacts.get(n));
			}
			i++;
		}
		contacts = temp;
	}

	public void updateContact(String oldName, String newName, String newNumber) {
		if (contacts.containsKey(oldName)) {
			contacts.remove(oldName);
			contacts.put(newName, newNumber);
			System.out.println("Contact updated.");
		} else {
			System.out.println("Contact not found.");
		}
	}

	public void deleteContact(String name) {
		if (contacts.containsKey(name)) {
			contacts.remove(name);
			System.out.println("Contact deleted.");
		} else {
			System.out.println("Contact not found.");
		}
	}

	public static void main(String[] args) {
		Task1 contactApp = new Task1();
		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		while (!quit) {
			System.out.println("\nSelect an option:");
			System.out.println("1. Display contacts");
			System.out.println("2. Search contact by name");
			System.out.println("3. Add new contact");
			System.out.println("4. Update contact");
			System.out.println("5. Delete contact");
			System.out.println("6. Quit");
			int choice = scanner.nextInt();
			scanner.nextLine();
			switch (choice) {
			case 1:
				contactApp.displayContacts();
				break;
			case 2:
				System.out.println("Enter name:");
				String name = scanner.nextLine();
				contactApp.searchContact(name);
				break;
			case 3:
				System.out.println("Enter name:");
				String newName = scanner.nextLine();
				System.out.println("Enter number:");
				String newNumber = scanner.nextLine();
				System.out.println("Enter index:");
				int index = scanner.nextInt();
				scanner.nextLine();
				contactApp.addContact(newName, newNumber, index);
				break;
			case 4:
				System.out.println("Enter old name:");
				String oldName = scanner.nextLine();
				System.out.println("Enter new name:");
				newName = scanner.nextLine();
				System.out.println("Enter new number:");
				newNumber = scanner.nextLine();
				contactApp.updateContact(oldName, newName, newNumber);
				break;
			case 5:
				System.out.println("Enter name:");
				name = scanner.nextLine();
				contactApp.deleteContact(name);
				break;
			case 6:
				System.exit(1);
			}
		}
	}
}

package ACTIVITIES;

import java.util.*;

public class ACTIVITY_1 {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		String listOfNames[] = { "JM", "Jonas", "Jem", "John", "Jay-arr", "Jayvee", "Jaypee" };
		boolean nameFound = false;

		System.out.print("Enter a name to Search: ");
		String name = input.nextLine();

		for (int i = 0; i < listOfNames.length; i++) {
			if (listOfNames[i].equals(name)) {
				nameFound = true;
			}
		}

		if (nameFound) {
			System.out.println(name + " is found ");
		} else {
			System.out.println(name + " is not found");
		}

	}
}

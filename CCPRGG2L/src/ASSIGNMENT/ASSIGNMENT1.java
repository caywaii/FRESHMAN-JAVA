package ASSIGNMENT;

import java.util.*;

public class ASSIGNMENT1 {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		String userName[] = { "one", "two", "three", "four", "five", "six"};
		int passwords[] = { 1, 2, 3, 4, 5, 6};
		int userId = -1;
		int PassId = -1;

		System.out.print("Enter a Username: ");
		String name = input.nextLine();

		System.out.print("Password: ");
		int userPassword = input.nextInt();

		for (int i = 0; i < userName.length; i++) {
			if (userName[i].equals(name)) {
				userId = i;
				break;
			}
		}
		for (int j = 0; j < passwords.length; j++) {
			if (passwords[j] == userPassword) {
                PassId = j;
				break;
			}
		}
		if (userId == -1 && PassId == -1) {
			System.out.println("Username and Password not found!");
		} else if (userId == PassId) {
			System.out.println("Welcome to our system!");	
		} else {
			System.out.println("Username and Password Mismatch");
		}
	}

}

package ACTIVITIES;

import java.util.*;

public class ACTIVITY_2 {

	static Scanner input = new Scanner(System.in);
	static int num1 = 0, num2 = 1, num3 = 0, total;

	public static void main(String[] args) {

		System.out.print("Enter number of recursion: ");
		int usernum = input.nextInt();

		if (usernum < 1) {
			System.out.println("Invalid Input!");
		} else {
			System.out.println(num1 + "\n" + num2);
			Computation(usernum - 2); //
			System.out.println("\nOUTPUT: " + total);

		}

	}

	public static void Computation(int usernum) {
		if (usernum > 0) {
			num3 = num1 + num2;
			System.out.println(num3);
			num1 = num2;
			num2 = num3;
			Computation(usernum - 1); 
			total = num3 + num2 + num1 - 1;
			
		}

	}
}

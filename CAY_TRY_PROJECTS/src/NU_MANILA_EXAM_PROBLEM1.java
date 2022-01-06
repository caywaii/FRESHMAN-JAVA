import java.util.*;

public class NU_MANILA_EXAM_PROBLEM1 {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("NU MANILA EXAM (PROBLEM 1)");
		System.out.println("==============================================");

		System.out.println("TEST CASE 1: Finding The Product");
		System.out.println("==============================================");

		System.out.print("Enter First Number ");
		double x = input.nextDouble();

		System.out.print("Enter Second Number ");
		double y = input.nextDouble();

		double z = x * y;
		System.out.println("The Product is " + z);

		System.out.println("\nTEST CASE 2: Finding The Largest Number");
		System.out.println("==============================================");

		int a, b, c;

		System.out.println("Please Enter Three Numbers: ");
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();

		if (a >= b && a >= c) {
			System.out.println("The Largest Number is " + a);
		} else if (b >= a && b >= c) {
			System.out.println("The Largest Number is " + b);
		} else {
			System.out.println("The Largest number is " + c);
		}

		System.out.println("\nTEST CASE 3: Finding The Age");
		System.out.println("==============================================");

		System.out.println("Please Enter Your Birth Year: ");
		int year = input.nextInt();

		int age = 2021 - year;

		System.out.println("Your Age is " + age);
	}

}

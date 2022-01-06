import java.util.*;

public class SPDQ_CALCULATOR {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		int num1, num2;
		String name;

		System.out.print("Enter your name: ");
		name = input.nextLine();

		System.out.print("Enter First number: ");
		num1 = input.nextInt();

		System.out.print("Enter Second number: ");
		num2 = input.nextInt();

		Sum(num1, num2, name);
		Difference(num1, num2, name);
		Product(num1, num2, name);
		Quotient(num1, num2, name);

	}

	public static void Sum(int x, int y, String z) {
		int result = x + y;
		System.out.println("Hello, " + z + "! The sum is " + result);
	}

	public static void Difference(int x, int y, String z) {
		int result = x - y;
		System.out.println("Hello, " + z + "! The difference is " + result);
	}

	public static void Product(int x, int y, String z) {
		int result = x * y;
		System.out.println("Hello, " + z + "! The product is " + result);
	}

	public static void Quotient(int x, int y, String z) {
		int result = x / y;
		System.out.println("Hello, " + z + "! The quotient is " + result);
	}

}

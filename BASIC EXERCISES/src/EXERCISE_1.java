import java.util.*;

public class EXERCISE_1 {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println(
				"Write a Java program that accepts four integer from the user \nand prints equal if all four are equal, and not equal otherwise");

		System.out.print("\n Input First Number: ");
		int num1 = input.nextInt();

		System.out.print("\nInput Second Number: ");
		int num2 = input.nextInt();

		System.out.print("\nInput Third Number: ");
		int num3 = input.nextInt();

		System.out.print("\ninput Fourth Number: ");
		int num4 = input.nextInt();

		if (num1 == num2 && num1 == num3 && num1 == num4 && num2 == num3 && num2 == num4 && num3 == num4) {
			System.out.println("all are equal");
		} else {
			System.out.println("not equal!");
		}

	}

}

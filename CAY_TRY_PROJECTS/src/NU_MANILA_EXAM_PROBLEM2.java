import java.util.*;

public class NU_MANILA_EXAM_PROBLEM2 {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		int ans = 1;

		do {

			System.out.println("SALARY EXAM");

			System.out.print("Enter Your Name: ");
			String name = input.next();

			System.out.print("Enter your Fixed Salary: ");
			double fs = input.nextDouble();
			input.nextLine();
			System.out.print("Enter Your Sales: ");
			double s = input.nextDouble();

			System.out.println("=================================");
			System.out.println("Name: " + name);

			double result = fs + s * 0.15;

			System.out.println("Total Income: " + String.format("%.2f", result));

			if (result < 10000) {
				System.out.println("Report To Your Superior! Quota Below 10,000");
			} else if (result > 10000) {
				System.out.println("You Meet Your Monthly Quota! ");
			}

			System.out.println("===================================");
			System.out.println("Do you want another transaction: [1]-Yes [2]-No");
			ans = input.nextInt();
		} while (ans == 1);

		System.out.println("Thank You Have a Great Day Ahead!");
	}
}

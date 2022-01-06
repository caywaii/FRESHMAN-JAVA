import java.util.*;

public class APPLY_MATHEMITICAL {

	public static void main(String[] args) {

		String ans = "1";

		do {

			Scanner input = new Scanner(System.in);

			System.out.println("Welcome to the simple math helper");
			System.out.println("What would you like to calculate");
			System.out.println("1. Sqrt");
			System.out.println("2. Log");
			System.out.println("3. Factorial");

			System.out.print("> ");
			String chooseEquation = input.nextLine();

			switch (chooseEquation) {

			case "1":
				System.out.println("Enter the number to calculate its sqrt");
				System.out.print("> ");
				int sqrt = input.nextInt();

				System.out.println(Math.sqrt(sqrt));
				break;

			case "2":
				System.out.println("Enter the number to calculate its log");
				System.out.print("> ");
				int log = input.nextInt();

				System.out.println(Math.log(log));
				break;

			case "3":
				int usernum, i, fact = 1;

				System.out.println("Enter the number to calculate its factorial");
				usernum = input.nextInt();

				if (usernum < 0) {
					System.out.println("Invalid Input!");
				} else {
					for (i = 1; i <= usernum; i++) {

						fact = fact * i;
						System.out.println("Factorial of " + usernum + " is " + fact);
					}
				}
				break;
			default:
				System.out.println("Invalid Input!");
			}

			System.out.println("Would you like to try again? [1] - Yes [2] - No");
			ans = input.nextLine();

		} while (ans.equals("1"));

		System.out.println("Thank you!");

	}
}

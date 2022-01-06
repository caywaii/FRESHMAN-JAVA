import java.util.*;

public class AXIE_CALCULATOR {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		int used, gained, destroy, tempo1;
		int round = 2;
		int ans = 1;

		System.out.println("AXIE ENERGY CALCULATOR");
		System.out.println("============================");

		System.out.println("============================");

		System.out.println("Round: 1");

		System.out.println("============================");

		try {
			System.out.print("ENERGY USED: ");
			used = input.nextInt();

			System.out.print("ENERGY GAINED: ");
			gained = input.nextInt();

			System.out.print("ENERGY DESTROY: ");
			destroy = input.nextInt();

			tempo1 = 3 - used + gained - destroy + 2;

			System.out.println("ENERGY NEXT ROUND: " + tempo1);

			do {

				System.out.println("============================");

				System.out.println("Round: " + round++);

				System.out.println("============================");

				System.out.print("ENERGY USED: ");
				used = input.nextInt();

				System.out.print("ENERGY GAINED: ");
				gained = input.nextInt();

				System.out.print("ENERGY DESTROY: ");
				destroy = input.nextInt();

				int tempo2;
				tempo2 = tempo1 + gained - used - destroy + 2;

				System.out.println("ENERGY NEXT ROUND: " + tempo2);

			} while (ans == 1);
		} catch (Exception e) {
			System.out.println("Invalid Input");
		}

		System.out.println("Would you like to stop the calculator? Q - YES or q - NO");
		String response = input.next();

		if (!response.equals("Q") && !response.equals("q")) {
			System.out.println("You are still playing!");
		} else {
			System.out.println("You stopped playing!");
		}

	}
}

import java.util.*;

public class FINALS_2 {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int ans = 1;
		int fnalbalance = 10000;
		
		System.out.println("ABC BANK OF COMMERCE");

		System.out.print("\nEnter a Pin: ");
		String pin = input.nextLine();
		
		do {
			
			if (pin.equals("123456")) {
				System.out.println("++++++++++++++++++++++++++++++++++++");
				System.out.println("\nABC Bank of Commerce");
				System.out.println("\n1. Balance Inquiry");
				System.out.println("2. Deposit");
				System.out.println("3. Withdrawals");

				System.out.print("\nSelect a Transaction: ");
				String transaction = input.nextLine();

				if (transaction.equals("1")) {
					System.out.println("Your Current Balance is: " + fnalbalance);

				} else if (transaction.equals("2")) {
					System.out.print("Enter amount to deposit: ");
					int deposit = input.nextInt();
					            input.nextLine();
					fnalbalance += deposit;
					System.out.println("Balance is: " + fnalbalance);

				} else if (transaction.equals("3")) {

					System.out.print("Enter amount to withdraw: ");
					int withdraw = input.nextInt();
					               input.nextLine();

					if (withdraw > fnalbalance) {
						System.out.println("Insufficient Fund");
					} else {
						fnalbalance -= withdraw;
						System.out.println("Balcnce is: " + fnalbalance);
					}

				} else {
					System.out.println("Invalid Input");
				}

			}else {
				System.out.println("Invalid Input");
			}

			System.out.println("\nDo you want another transaction? 1 - Yes; 2 - No");
             ans = input.nextInt();
                   input.nextLine();
		} while (ans == 1);

	}
}

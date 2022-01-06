import java.text.DecimalFormat;
import java.util.*;

public class BANK {

	static Scanner input = new Scanner(System.in);
	static DecimalFormat DF = new DecimalFormat();
	
	public static void main(String[] cay) {
		
		DF.setMaximumFractionDigits(2);

		System.out.println("Welcome to CayBank");

		System.out.println("\nCaryl Santiago - [1]");
		System.out.println("\nSantiago Caryl - [2]");
		System.out.println("\nShanti Dope - [3]");

		System.out.print("\nChoose User: ");
		String user = input.nextLine();

		if (user.equals("1")) {
			User1(user);
		} else if (user.equals("2")) {
			User2(user);
		} else if (user.equals("3")) {
			User3(user);
		} else {
			System.out.println("Not in the choices!");
		}

	}

	static void User1(String user) {

		System.out.println("=====================================");

		System.out.println("Hello Caryl Santiago!");
		System.out.println("\nDeposit - [1]");
		System.out.println("Withdrawal - [2]");

		System.out.print("\nEnter Choice: ");
		String choice = input.nextLine();

		double balance = 15000;
		System.out.println("BALANCE: " + String.format("%,.2f", balance));

		if (choice.equals("1")) {
			System.out.print("\nEnter Amount (> 100): ");
			double amountdepo = input.nextDouble();

			if (amountdepo < 100) {
				System.out.println("The amount should be greater than 100 pesos");
			} else {
				System.out.println("Deposit Succesful!");
				double totaldepo = balance + amountdepo;
				System.out.println("Your current balance is: " + String.format("%,.2f", totaldepo));
			}
		} else if (choice.equals("2")) {
			System.out.println("\nEnter Amount (> 500): ");
			double amountwithdraw = input.nextDouble();
			
			if (amountwithdraw < 500) {
				System.out.println("The amount should be greater than 500 pesos");
			} else if (amountwithdraw > balance) {
				System.out.println("Not enough balance");
			} else {
				System.out.println("Withdraw Succesful");
				double totalwithdraw = balance - amountwithdraw;
				System.out.println("Your current balance is: " + String.format("%,.2f", totalwithdraw));
			}
		}
	}

	static void User2(String user) {
		System.out.println("=====================================");

		System.out.println("Hello Santiago Caryl!");
		System.out.println("\nDeposit - [1]");
		System.out.println("Withdrawal - [2]");

		System.out.print("\nEnter Choice: ");
		String choice = input.nextLine();

		double balance = 250;
		System.out.println("BALANCE: " + String.format("%.2f", balance));

		if (choice.equals("1")) {
			System.out.print("\nEnter Amount (> 100): ");
			double amountdepo = input.nextDouble();

			if (amountdepo < 100) {
				System.out.println("The amount should be greater than 100 pesos");
			} else {
				System.out.println("Deposit Succesful!");
				double totaldepo = balance + amountdepo;
				System.out.println("Your current balance is: " + String.format("%.2f", totaldepo));
			}
		} else if (choice.equals("2")) {
			System.out.println("\nEnter Amount (> 500): ");
			double amountwithdraw = input.nextDouble();
			
			if (amountwithdraw < 500) {
				System.out.println("The amount should be greater than 500 pesos");
			} else if (amountwithdraw > balance) {
				System.out.println("Not enough balance");
			} else {
				System.out.println("Withdraw Succesful");
				double totalwithdraw = balance - amountwithdraw;
				System.out.println("Your current balance is: " + String.format("%.2f", totalwithdraw));
			}
		}
	
	}

	static void User3(String user) {

		System.out.println("=====================================");

		System.out.println("Hello Caryl Santiago!");
		System.out.println("\nDeposit - [1]");
		System.out.println("Withdrawal - [2]");

		System.out.print("\nEnter Choice: ");
		String choice = input.nextLine();

		double balance = 0;
		System.out.println("BALANCE: " + String.format("%,.2f", balance));

		if (choice.equals("1")) {
			System.out.print("\nEnter Amount (> 100): ");
			double amountdepo = input.nextDouble();

			if (amountdepo < 100) {
				System.out.println("The amount should be greater than 100 pesos");
			} else {
				System.out.println("Deposit Succesful!");
				double totaldepo = balance + amountdepo;
				System.out.println("Your current balance is: " + String.format("%,.2f", totaldepo));
			}
		} else if (choice.equals("2")) {
			System.out.println("\nEnter Amount (> 500): ");
			double amountwithdraw = input.nextDouble();
			
			if (amountwithdraw < 500) {
				System.out.println("The amount should be greater than 500 pesos");
			} else if (amountwithdraw > balance) {
				System.out.println("Not enough balance");
			} else {
				System.out.println("Withdraw Succesful");
				double totalwithdraw = balance - amountwithdraw;
				System.out.println("Your current balance is: " + String.format("%,.2f", totalwithdraw));
			}
		}

	}
}

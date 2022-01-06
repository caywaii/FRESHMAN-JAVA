import java.text.DecimalFormat;
import java.util.*;

public class SALESCODE_NEW_ERA_SCHOOL {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		DecimalFormat DF = new DecimalFormat("#.##");
		DF.setGroupingUsed(true);
		DF.setGroupingSize(3);

		System.out.println("Sales Input:");

		System.out.print("\nEnter Product 1: " + "\t");
		String prod1 = input.nextLine();
		System.out.print("Enter Price: " + "\t\t" + "$");
		double price1 = input.nextDouble();
		input.nextLine();
		System.out.print("\nEnter Product 2: " + "\t");
		String prod2 = input.nextLine();
		System.out.print("Enter Price: " + "\t\t" + "$");
		double price2 = input.nextDouble();
		input.nextLine();
		System.out.print("\nEnter Product 3: " + "\t");
		String prod3 = input.nextLine();
		System.out.print("Enter Price: " + "\t\t" + "$");
		double price3 = input.nextDouble();

		System.out.println("\nInput Mode of Payment Terms");

		System.out.print("Cash Discount: " + "\t\t");
		double discount = input.nextDouble();
		System.out.println("\tYou input " + discount + "% " + " Discount for Cash");

		System.out.print("\n3 Months Installment: " + "\t");
		double threeinstall = input.nextDouble();
		System.out.println("\tYou input " + threeinstall + "% " + " Interest for 3 Months Installment");

		System.out.print("\n6 Months Installment: " + "\t");
		double sixinstall = input.nextDouble();
		System.out.println("\tYou input " + sixinstall + "% " + " Interest for 6 Months Installment");

		System.out.print("\n12 Months Installment: " + "\t");
		double twelveinstall = input.nextDouble();
		input.nextLine();
		System.out.println("\tYou input " + twelveinstall + "% " + " Interest for 12 Months Installment");

		System.out.println("========================================================================");

		System.out.println("\nMain Menu? ");

		System.out.println("Press I/i: " + prod1 + "\t" + "\t" + "\t" + "$" + String.format("%.2f", price1));
		System.out.println("Press S/s: " + prod2 + "\t" + "\t" + "$" + String.format("%.2f", price2));
		System.out.println("Press X/x: " + prod3 + "\t" + "\t" + "$" + String.format("%.2f", price3));

		System.out.print("Enter Item: " + "\t\t\t\t");
		String item = input.nextLine();

		System.out.println("\n========================================================================");

		double finalDiscount, totalAmount, amortization;

		if (item.equalsIgnoreCase("I")) {

			System.out.println("\nYour Item is " + prod1);
			System.out.println("Price: " + "\t\t" + "$" + String.format("%.2f", price1));

			System.out.println("\nSelect Mode of Payment");

			System.out.println("\nPress 1: Cash" + "\t\t\t" + discount + "%" + " Discount");
			System.out.println("Press 2: 3 Months Installment" + "\t" + threeinstall + "%" + " Discount");
			System.out.println("Press 3: 6 Months Installment" + "\t" + sixinstall + "%" + " Discount");
			System.out.println("Press 4: 12 Months Installment" + "\t" + twelveinstall + "%" + " Discount");

			System.out.print("Enter Mode of Payment: " + "\t\t");
			String paymentI = input.nextLine();

			System.out.println("\n========================================================================");

			if (paymentI.equals("1")) {

				System.out.println("Mode of Payment:  \tCash Discount");
				System.out.println("Item: " + "\t" + "\t\t" + prod1);
				System.out.println("Item: " + "\t" + "\t\t" + "$" + String.format("%.2f", price1));
				double percentage = discount/100;
				finalDiscount = price1 * percentage;
				totalAmount = price1 - finalDiscount;
				System.out.println("Discount/Interest: " + "\t" + "$" + String.format("%.2f", finalDiscount));
				System.out.println("Total Amount: " + "\t" + "\t" + "$" + String.format("%.2f", totalAmount));

			} else if (paymentI.equals("2")) {

				System.out.println("Mode of Payment:  \t\t3 Month Installment");
				System.out.println("Item: " + "\t" + "\t\t\t" + prod1);

				System.out.println("Price: " + "\t\t\t\t" + "$" + String.format("%.2f", price1));
				double percentage = threeinstall/100;
				finalDiscount = price1 * percentage;
				System.out.println("Discount/Interest: " + "\t\t" + "$" + String.format("%.2f", finalDiscount));
				totalAmount = price1 + finalDiscount;
				System.out.println("Total Amount: " + "\t\t\t" + "$" + String.format("%.2f", totalAmount));
				amortization = totalAmount / 3;
				System.out.println("Monthly Amortization: " + "\t\t" + "$" + String.format("%.2f", amortization));

			} else if (paymentI.equals("3")) {
				
				System.out.println("Mode of Payment:  \t\t6 Month Installment");
				System.out.println("Item: " + "\t" + "\t\t\t" + prod1);

				System.out.println("Price: " + "\t\t\t\t" + "$" + String.format("%.2f", price1));
				double percentage = sixinstall/100;
				finalDiscount = price1 * percentage;
				System.out.println("Discount/Interest: " + "\t\t" + "$" + String.format("%.2f", finalDiscount));
				totalAmount = price1 + finalDiscount;
				System.out.println("Total Amount: " + "\t\t\t" + "$" + String.format("%.2f", totalAmount));
				amortization = totalAmount / 6;
				System.out.println("Monthly Amortization: " + "\t\t" + "$" + String.format("%.2f", amortization));
				

			} else if (paymentI.equals("4")) {
				
				System.out.println("Mode of Payment:  \t\t12 Month Installment");
				System.out.println("Item: " + "\t" + "\t\t\t" + prod1);

				System.out.println("Price: " + "\t\t\t\t" + "$" + String.format("%.2f", price1));
				double percentage = twelveinstall/100;
				finalDiscount = price1 * percentage;
				System.out.println("Discount/Interest: " + "\t\t" + "$" + String.format("%.2f", finalDiscount));
				totalAmount = price1 + finalDiscount;
				System.out.println("Total Amount: " + "\t\t\t" + "$" + String.format("%.2f", totalAmount));
				amortization = totalAmount / 12;
				System.out.println("Monthly Amortization: " + "\t\t" + "$" + String.format("%.2f", amortization));
				
			} else {
				System.out.println("Invalid Input");
			}

		} else if (item.equalsIgnoreCase("S")) {

			System.out.println("\nYour Item is " + prod2);
			System.out.println("Price: " + "\t\t" + "$" + String.format("%.2f", price2));

			System.out.println("\nSelect Mode of Payment");

			System.out.println("\nPress 1: Cash" + "\t\t\t" + discount + "%" + " Discount");
			System.out.println("Press 2: 3 Months Installment" + "\t" + threeinstall + "%" + " Discount");
			System.out.println("Press 3: 6 Months Installment" + "\t" + sixinstall + "%" + " Discount");
			System.out.println("Press 4: 12 Months Installment" + "\t" + twelveinstall + "%" + " Discount");
			System.out.print("Enter Mode of Payment: " + "\t\t");
			String paymentS = input.nextLine();

			System.out.println("\n========================================================================");

			if (paymentS.equals("1")) {
				
				System.out.println("Mode of Payment:  \tCash Discount");
				System.out.println("Item: " + "\t" + "\t\t" + prod2);
				System.out.println("Item: " + "\t" + "\t\t" + "$" + String.format("%.2f", price2));
				double percentage = discount/100;
				finalDiscount = price2 * percentage;
				totalAmount = price2 - finalDiscount;
				System.out.println("Discount/Interest: " + "\t" + "$" + String.format("%.2f", finalDiscount));
				System.out.println("Total Amount: " + "\t" + "\t" + "$" + String.format("%.2f", totalAmount));

			} else if (paymentS.equals("2")) {

				System.out.println("Mode of Payment:  \t\t3 Month Installment");
				System.out.println("Item: " + "\t" + "\t\t\t" + prod2);

				System.out.println("Price: " + "\t\t\t\t" + "$" + String.format("%.2f", price2));
				double percentage = threeinstall/100;
				finalDiscount = price2 * percentage;
				System.out.println("Discount/Interest: " + "\t\t" + "$" + String.format("%.2f", finalDiscount));
				totalAmount = price2 + finalDiscount;
				System.out.println("Total Amount: " + "\t\t\t" + "$" + String.format("%.2f", totalAmount));
				amortization = totalAmount / 3;
				System.out.println("Monthly Amortization: " + "\t\t" + "$" + String.format("%.2f", amortization));
				
			} else if (paymentS.equals("3")) {

				System.out.println("Mode of Payment:  \t\t6 Month Installment");
				System.out.println("Item: " + "\t" + "\t\t\t" + prod2);

				System.out.println("Price: " + "\t\t\t\t" + "$" + String.format("%.2f", price2));
				double percentage = sixinstall/100;
				finalDiscount = price2 * percentage;
				System.out.println("Discount/Interest: " + "\t\t" + "$" + String.format("%.2f", finalDiscount));
				totalAmount = price2 + finalDiscount;
				System.out.println("Total Amount: " + "\t\t\t" + "$" + String.format("%.2f", totalAmount));
				amortization = totalAmount / 6;
				System.out.println("Monthly Amortization: " + "\t\t" + "$" + String.format("%.2f", amortization));
				
			} else if (paymentS.equals("4")) {

				System.out.println("Mode of Payment:  \t\t12 Month Installment");
				System.out.println("Item: " + "\t" + "\t\t\t" + prod2);

				System.out.println("Price: " + "\t\t\t\t" + "$" + String.format("%.2f", price2));
				double percentage = twelveinstall/100;
				finalDiscount = price2 * percentage;
				System.out.println("Discount/Interest: " + "\t\t" + "$" + String.format("%.2f", finalDiscount));
				totalAmount = price2 + finalDiscount;
				System.out.println("Total Amount: " + "\t\t\t" + "$" + String.format("%.2f", totalAmount));
				amortization = totalAmount / 12;
				System.out.println("Monthly Amortization: " + "\t\t" + "$" + String.format("%.2f", amortization));
				
			} else {
				System.out.println("Invalid Input");
			}

		} else if (item.equalsIgnoreCase("X")) {
			
			System.out.println("\nYour Item is " + prod3);
			System.out.println("Price: " + "\t\t" + "$" + String.format("%.2f", price3));

			System.out.println("\nSelect Mode of Payment");

			System.out.println("\nPress 1: Cash" + "\t\t\t" + discount + "%" + " Discount");
			System.out.println("Press 2: 3 Months Installment" + "\t" + threeinstall + "%" + " Discount");
			System.out.println("Press 3: 6 Months Installment" + "\t" + sixinstall + "%" + " Discount");
			System.out.println("Press 4: 12 Months Installment" + "\t" + twelveinstall + "%" + " Discount");
			System.out.print("Enter Mode of Payment: " + "\t\t");
			String paymentX = input.nextLine();
			
			System.out.println("\n========================================================================");

			if (paymentX.equals("1")) {
				
				System.out.println("Mode of Payment:  \tCash Discount");
				System.out.println("Item: " + "\t" + "\t\t" + prod3);
				System.out.println("Item: " + "\t" + "\t\t" + "$" + String.format("%.2f", price3));
				double percentage = discount/100;
				finalDiscount = price3 * percentage;
				totalAmount = price3 - finalDiscount;
				System.out.println("Discount/Interest: " + "\t" + "$" + String.format("%.2f", finalDiscount));
				System.out.println("Total Amount: " + "\t" + "\t" + "$" + String.format("%.2f", totalAmount));

			} else if (paymentX.equals("2")) {
				
				System.out.println("Mode of Payment:  \t\t3 Month Installment");
				System.out.println("Item: " + "\t" + "\t\t\t" + prod3);

				System.out.println("Price: " + "\t\t\t\t" + "$" + String.format("%.2f", price3));
				double percentage = threeinstall/100;
				finalDiscount = price3 * percentage;
				System.out.println("Discount/Interest: " + "\t\t" + "$" + String.format("%.2f", finalDiscount));
				totalAmount = price3 + finalDiscount;
				System.out.println("Total Amount: " + "\t\t\t" + "$" + String.format("%.2f", totalAmount));
				amortization = totalAmount / 3;
				System.out.println("Monthly Amortization: " + "\t\t" + "$" + String.format("%.2f", amortization));
				

			} else if (paymentX.equals("3")) {
				
				System.out.println("Mode of Payment:  \t\t6 Month Installment");
				System.out.println("Item: " + "\t" + "\t\t\t" + prod3);

				System.out.println("Price: " + "\t\t\t\t" + "$" + String.format("%.2f", price3));
				double percentage = sixinstall/100;
				finalDiscount = price3 * percentage;
				System.out.println("Discount/Interest: " + "\t\t" + "$" + String.format("%.2f", finalDiscount));
				totalAmount = price3 + finalDiscount;
				System.out.println("Total Amount: " + "\t\t\t" + "$" + String.format("%.2f", totalAmount));
				amortization = totalAmount / 6;
				System.out.println("Monthly Amortization: " + "\t\t" + "$" + String.format("%.2f", amortization));
				
				
			} else if (paymentX.equals("4")) {
				
				System.out.println("Mode of Payment:  \t\t12 Month Installment");
				System.out.println("Item: " + "\t" + "\t\t\t" + prod3);

				System.out.println("Price: " + "\t\t\t\t" + "$" + String.format("%.2f", price3));
				double percentage = twelveinstall/100;
				finalDiscount = price3 * percentage;
				System.out.println("Discount/Interest: " + "\t\t" + "$" + String.format("%.2f", finalDiscount));
				totalAmount = price3 + finalDiscount;
				System.out.println("Total Amount: " + "\t\t\t" + "$" + String.format("%.2f", totalAmount));
				amortization = totalAmount / 12;
				System.out.println("Monthly Amortization: " + "\t\t" + "$" + String.format("%.2f", amortization));
				

			} else {
				System.out.println("Invalid Input");

			}

		}
	}

}

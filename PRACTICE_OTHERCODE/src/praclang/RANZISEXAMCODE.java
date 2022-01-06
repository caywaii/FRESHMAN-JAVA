package praclang;
import java.util.*;
public class RANZISEXAMCODE {


	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int options;

		do {
			System.out.print("Please select an item: \n ");
			System.out.print("[1] Pencil      20.00\n ");
			System.out.print("[2] Notebooks   40.00\n ");
			System.out.print("[3] Eraser      10.00\n ");
			System.out.print("Enter item: ");
			int choice = input.nextInt();

			if (choice == 1) {
				System.out.print("----------------------------------\n");
				System.out.print("Item Code: 1\n");
				System.out.print("Description: Pencil = 20.00\n ");
				System.out.print("Quantity: ");
				int quantity = input.nextInt();
				double total = (20 * quantity);
				System.out.print("Total Amount: " + total + "\n");
				System.out.print("Cash Tendered: ");
				double cash = input.nextInt();

				double change = cash - total;

				if (cash < total) {
					System.out.print("Insuficient funds!\n");
				}

				else if (cash > total) {
					System.out.print("Change: " + change + "\n");
				}
				System.out.print("----------------------------------\n");
			}

			else if (choice == 2) {
				System.out.print("----------------------------------\n");
				System.out.print("Item Code: 2\n");
				System.out.print("Description: Notebook = 40.00\n");
				System.out.print("Quantity: ");
				int quantity = input.nextInt();
				double total = (40 * quantity);

				System.out.print("Total Amount: " + total + "\n");
				System.out.print("Cash Tendered: ");
				double cash = input.nextInt();

				double change = cash - total;
				if (cash < total) {
					System.out.print("Insuficient funds!\n");
				}

				else if (cash > total) {
					System.out.print("Change: " + change + "\n");
				}
				System.out.print("----------------------------------\n");
			}

			if (choice == 3) {
				System.out.print("----------------------------------\n");
				System.out.print("Item Code: 3\n");
				System.out.print("Description: Pencil = 10.00\n ");
				System.out.print("Quantity: ");
				int quantity = input.nextInt();
				double total = (10 * quantity);

				System.out.print("Total Amount: " + total + "\n");
				System.out.print("Cash Tendered: ");
				double cash = input.nextInt();

				double change = cash - total;
				if (cash < total) {
					System.out.print("Insuficient funds!\n");
				}

				else if (cash > total) {
					System.out.print("Change: " + change + "\n");
				}
				System.out.print("----------------------------------\n");
			}
			System.out.print("Do you want to buy another item? 1-Yes; 2-No: ");
			options = input.nextInt();

		} while (options == 1);
	}

}

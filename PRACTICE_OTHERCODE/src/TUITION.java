import java.text.DecimalFormat;
import java.util.Scanner;

public class TUITION {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		DecimalFormat DF = new DecimalFormat("#.##");
		DF.setGroupingUsed(true);
		DF.setGroupingSize(3);

		double units, price, total, cpay, cpay2, twoinstall, twofnalstall, treinstall, trefnalstall;
		String name;

		System.out.println("---------Tuition---------");

		System.out.print("Enter name of the student: ");
		name = input.nextLine();

		System.out.print("Enter number of units enrolled: ");
		units = input.nextDouble();

		System.out.print("Enter price per unit: ");
		price = input.nextDouble();

		total = units * price;

		System.out.println("--------------------------");
		System.out.println("Computed Tuition Fee is " + DF.format(total) + " dollars");

		System.out.println("Payment Mode: ");
		System.out.println("--------------------------");
		System.out.println(name + ", you could avail the following payment mode");

		System.out.println("--------------------------");
		cpay = total * 0.10;
		cpay2 = total - cpay;
		System.out.println("Cash Payment: " + String.format("%,.2f", cpay2));

		twoinstall = total * 0.05;
		twofnalstall = total + twoinstall;
		System.out.println("2 - Installment: " + String.format("%,.2f", twofnalstall));
		
		treinstall = total * 0.10;
		trefnalstall = total + treinstall;
		System.out.println("3 - Installment: " + String.format("%,.2f", trefnalstall));
	}

}

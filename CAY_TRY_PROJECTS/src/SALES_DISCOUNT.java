
import java.text.DecimalFormat;
import java.util.*;
public class SALES_DISCOUNT {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		DecimalFormat DF = new DecimalFormat("#.##");
		DF.setGroupingUsed(true);
		DF.setGroupingSize(3);
		
		System.out.print("Please Enter the Product: ");
		String product = input.nextLine();

		System.out.print("Enter Price: ");
		double price = input.nextDouble();

		System.out.println("======================================");

		if (price <= 10000) {
			System.out.println("Price of " + product + " is " + DF.format(price));

			double discount = price * 0.05;
			System.out.println("Discount is " + DF.format(discount));

			double netprice = price - discount;
			System.out.println("Net price " + DF.format(netprice));
			
		} else if (price <= 20000) {
			System.out.println("Price of " + product + " is " + DF.format(price));

			double discount1 = price * 0.05;
			System.out.println("Discount is " + DF.format(discount1));

			double netprice1 = price - discount1;
			System.out.println("Net price " + DF.format(netprice1));
			
		}else if (price <= 50000) {
			System.out.println("Price of " + product + " is " + DF.format(price));

			double discount2 = price * 0.1;
			System.out.println("Discount is " + DF.format(discount2));

			double netprice2 = price - discount2;
			System.out.println("Net price " + DF.format(netprice2));
			
		}else if (price <= 100000) {
			System.out.println("Price of " + product + " is " + DF.format(price));

			double discount3 = price * 0.15;
			System.out.println("Discount is " + DF.format(discount3));

			double netprice3 = price - discount3;
			System.out.println("Net price " + DF.format(netprice3));
			
		}else {
			if(price >= 100000) {
				System.out.println("Price of " + product + " is " + DF.format(price));

				double discount4 = price * 0.2;
				System.out.println("Discount is " + DF.format(discount4));

				double netprice4 = price - discount4;
				System.out.println("Net price is " + DF.format(netprice4));
		}
		}

	}
}

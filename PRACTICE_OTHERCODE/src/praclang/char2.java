package praclang;

import java.util.*;

public class char2 {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		double d1, d2, d3, d4, d5, ave;

		System.out.println("Please Enter Five Decimal Numbers: ");
		System.out.print("A. ");
		d1 = input.nextDouble();
		System.out.print("B. ");
		d2 = input.nextDouble();
		System.out.print("C. ");
		d3 = input.nextDouble();
		System.out.print("D. ");
		d4 = input.nextDouble();
		System.out.print("E. ");
		d5 = input.nextDouble();

		ave = (d1 + d2 + d3 + d4 + d5) / 5;

		System.out.println("Your Average Grade is: " + String.format("%,.2f", ave));

	}

}

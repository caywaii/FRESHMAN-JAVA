import java.text.DecimalFormat;
import java.util.*;

public class AIRLINE_BOOKING {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		DecimalFormat DF = new DecimalFormat("#.##");
		DF.setGroupingUsed(true);
		DF.setGroupingSize(3);

		System.out.println("Welcome to Hello Airlines!");
		System.out.println("================================================================");
		System.out.print("Please Enter Fare: ");
		double fare = input.nextDouble();

		System.out.println(
				"\tPassenger Type: " + " O - Ordinary " + "\n\t\t\t S - Student" + "\n\t\t\t C - Senior Citizen");
		System.out.print("Please Enter Passenger Type: ");
		String passType = input.next();

		System.out.print("Travelling in Business Class? [Y/N]: ");
		String travelClass = input.next();

		System.out.println("================================================================");

		switch (passType) {
		case "O":
			System.out.println("Passenger Type: Ordinary");
			System.out.println("Discount " + DF.format(fare));

			if (travelClass.equals("Y")) {
				System.out.println("Business Class charge: 1000.00");

				double newfare = fare + 1000;
				System.out.println("New Fare: " + DF.format(newfare));
			} else if (travelClass.equals("N")) {
				

				double newfare = fare + 1000;
				System.out.println("New Fare: " + DF.format(newfare));
			}
			break;
		case "S":
			System.out.println("Passenger Type: Student");

			double discount = fare * 0.05;
			System.out.println("Discount " + DF.format(discount));

			if (travelClass.equals("Y")) {
				System.out.println("Business Class charge: 700.00");

				double charge = fare - discount;
				double newfare = charge + 700;
				System.out.println("New Fare: " + DF.format(newfare));
			} else if (travelClass.equals("N")) {
				

				double newfare = fare - discount;
				System.out.println("New Fare: " + DF.format(newfare));
			}
			break;
		case "C":
			System.out.println("Passenger Type: Senior Citizen");

			double discount1 = fare * 0.1;
			System.out.println("Discount " + DF.format(discount1));

			if (travelClass.equals("Y")) {
				System.out.println("Business Class charge: 500.00");

				double charge = fare - discount1;
				double newfare = charge + 500;
				System.out.println("New Fare: " + DF.format(newfare));
			} else if (travelClass.equals("N")) {
				

				double newfare = fare - discount1;
				System.out.println("New Fare: " + DF.format(newfare));
			}
			break;
		default:
			System.out.println(" Discount: 0" + "\n Business Class charge: 0 " + "\n New Fare: 0");
		}

	}
}

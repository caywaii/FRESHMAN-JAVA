import java.util.*;

public class QUIZ_2 {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		String Months[] = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		String Day[] = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };

		System.out.println("Enter a Number");
		System.out.print("\nMonth: ");
		int indexMonth = input.nextInt();

		if (indexMonth > Months.length) {
			System.out.println("Invalid Entry!");
		}else {
			System.out.println("Months: " + Months[indexMonth-2]);
			System.out.print("\nDays: ");
			int indexDay = input.nextInt();

			if (indexDay > Day.length) {
				System.out.println("Invalid Entry!");
			} else {
				System.out.println("Months: " + Day[indexDay-1]);
			}
		}
			
		

	}
}

import java.util.*;
public class EXERCISE_DATE {

	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		String[] month1 = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November","December"};
		
		System.out.print("Enter a date in the format mm/dd/yyyy: ");
		String date = input.nextLine();
		
		String [] dates = date.split("/");
		int monthIndex = Integer.parseInt(dates[0]);
		int day = Integer.parseInt(dates[1]);
		int year = Integer.parseInt(dates[2]);
		
		if(monthIndex > 12 || monthIndex < 1) {
			System.out.println("Invalid Input!");
			
		}else {
			System.out.println("Date is: " + month1[monthIndex] + " " + day + "," + year);
		}
		
		}
}

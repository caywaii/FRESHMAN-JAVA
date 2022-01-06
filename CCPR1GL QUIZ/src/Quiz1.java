import java.util.*;

public class Quiz1 {

	static Scanner input = new Scanner(System.in);
	
	static int grossPay; // global variable 
	
	public static void main(String[] args) {
		
	int daysWorked, ratePerDay;
	String z;
	
	System.out.println("SALARY COMPUTATION");
	
	System.out.print("Name: ");
	z = input.nextLine();
	
	System.out.print("Enter Numbers of days work: ");
	daysWorked = input.nextInt();
	
	System.out.print("Rate per day: ");
	ratePerDay = input.nextInt();
	
	multiplication(daysWorked, ratePerDay, z);
	
		
	}
	
	public static void multiplication(int x, int y, String z) {
		
	 grossPay = x * y; 
		 
		 System.out.println("Hello, " + z + " your salary is " + grossPay);
		 
		
	}
	 
	 
	
	
}

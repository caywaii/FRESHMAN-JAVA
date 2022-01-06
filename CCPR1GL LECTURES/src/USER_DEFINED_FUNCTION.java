import java.util.*;

public class USER_DEFINED_FUNCTION {

	static Scanner read = new Scanner(System.in);

	public static void main(String[] args) {
		// private static used in particular class
		// protected static provided that you will give it an authority
	    
		payroll("CAY");
		db_connect("MySQL");
	}

	public static int sum() {

		int a, b;

		System.out.println("Enter first number: ");
		a = read.nextInt();
		System.out.println("Enter Second Number");
		b = read.nextInt();

		int result = a + b;
		System.out.println("The sum is: " + result);
		return result;
	}

	public static String greeting() {
		System.out.println("Happy Halloween!");
		String x = "greeting";
		return x;
	}

	                          // parameter
	public static int payroll(String name) {
       int rate, ndw;
       
       System.out.println("Name of Employee: " + name);
       System.out.println("Rate: ");
       rate = read.nextInt();
       System.out.println("No. of days worked: ");
       ndw = read.nextInt();
       
       int gp = rate * ndw;
       System.out.println("The gross of " + name + " is " + gp);
       return gp;
       
       }

	public static void db_connect(String typeOfDb) {
		System.out.println("You are using a/an " + typeOfDb + " database!");
	}
}

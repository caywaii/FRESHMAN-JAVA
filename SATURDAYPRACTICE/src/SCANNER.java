import java.util.*;

// lesson of the integers, if else, string, static void
public class SCANNER {

	static Scanner input = new Scanner(System.in); //used to have input from user
	
	public static void main (String[] args) { //curly braces //void- does not return
		
		System.out.println("Hi I am Caryl Santiago \n"); // "\n" purpose is to break another line
		System.out.println("\t Saturday Class");         // "\t" purpose is to indent words
		
		int x = Sum();
		System.out.println("The sum is " + x);
		
		
	}
	
	public static int Sum() {
		
		int num1 = 0; int num2 = 0;  
		
		System.out.print("Enter first number: ");
		num1 = input.nextInt();
		
		System.out.print("Enter second number: ");
		num2 = input.nextInt();
		
		int result = num1 + num2;
		
		return result;
		
		
	}
	
}

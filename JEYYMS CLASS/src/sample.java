
import java.util.Scanner; //to get input from user

public class sample {
	
	
	
	// DataType VariableName = Value
	static Scanner input = new Scanner(System.in); // we need to declare this input scanner

	public static void main (String [] args) {
		
		// Get 2 INPUTS from User then ADD and DISPLAY THE SUM
		
		int x, y, sum;
		
		System.out.print("Enter first number => ");
		x = input.nextInt();
		
		System.out.print("Enter second number => ");
		y = input.nextInt();
		
		sum = x + y;
		
		System.out.println("The sum is " + sum);
		
		// Syntax Error - best example is calculator
		// Runtime Error - red line and also in output error
		// Logical Error - wherein it will run smoothly but wrong
		// CTRL + A and CTRL + I 
		
	}
}

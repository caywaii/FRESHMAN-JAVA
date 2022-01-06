import java.util.*;

public class IF_STATEMENTS {

static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
	System.out.println("Simple IF ELSE statement");
	System.out.println("--------------------------");
	System.out.println("Enter Your Age: ");
	int age = input.nextInt();
	    
	    if(age >= 75) {
	    	System.out.println("Okay Boomer!");
	    }else if(age >= 18) {
	    	System.out.println("You are an adult!");
	    }else if (age >= 13) {
	    	System.out.println("You are a teenager!");
	    }else {
	    	System.out.println("Invalid Input");
	    }
		
	}
}

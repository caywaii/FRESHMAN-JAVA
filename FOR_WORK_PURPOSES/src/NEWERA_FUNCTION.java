import java.util.*;
public class NEWERA_FUNCTION {

	static Scanner input = new Scanner(System.in);
	static int userEggs;
	public static void main(String[] args) {
		
		System.out.print("Enter the number of eggs: ");
		userEggs = input.nextInt();
		
		System.out.println("Number of dozen: " + determineDozen());
		
		System.out.println("Eggs less than a dozen: " + showLessDozen());
	}
	
	public static int determineDozen(){
		
	int dozen = userEggs / 12;
	return dozen;
		
	}
	
	public static int showLessDozen() {
	
		int less = userEggs % 12;
		
		return less;
		
	}
}

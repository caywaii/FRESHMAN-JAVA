import java.util.*;

public class FORLOOP2 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int counter;
		int num = 0;
		int result = 0;
		
		System.out.print("Enter number of loop execution: ");
		counter = read.nextInt();
		
		for(int i = 1; i <= counter; i++) {
			
			System.out.print("Enter a number: ");
			num = read.nextInt();
			
			result = result + num;
			
		}
		
		System.out.print("The sum is: " + result);
		
		
		
		
		
		
	}
		
}

import java.util.Scanner;

public class ARRAYS_3 {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
	
		int numEntry;
		int total = 0;
		
		int values[] = {45,23,43,22,12,34,89,77,90,91};
		
		System.out.println("Number of entry to calculate");
		numEntry = input.nextInt();
		if(numEntry>values.length) {
			System.out.println("Invalid Entry!");
		}else {
			for(int i = 0; i <= numEntry-1; i++) {
				System.out.println("Entry number " + (i+1) + " is " + values[i]);
				total = total + values[i];	
				System.out.println("Total based on entry is:" + total);
			}
				
		}
		
	}
}

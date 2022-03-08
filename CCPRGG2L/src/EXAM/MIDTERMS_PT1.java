package EXAM;
import java.util.*;
public class MIDTERMS_PT1 {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		boolean a = false;
		
		System.out.print("Enter a number: ");
		int enternum = input.nextInt();
		
		int ages[] = {45, 23, 32, 19, 33, 56};
		
		for(int i = 0; i < ages.length; i++) {
			if (ages[i] == enternum) {
				a = true;
			}
		}
		
		if(a) {
			System.out.println("Value is in the list");
		} else {
			System.out.println("Value is not in the list");
		}
	}
	
}

import java.util.*;
public class CONVERTING_DATA_TYPE {
  
	static Scanner read = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("What is your name?: ");
		String studName = read.nextLine();
		
		System.out.println("What grade are you now?: ");
		String grade = read.nextLine();
		char result1 = grade.charAt(11);
		int numvalue = Character.getNumericValue(result1);
		
		System.out.println("What is your name?: ");
		String studName2 = read.nextLine();
		
		System.out.println("What grade are you now?: ");
		String grade2 = read.nextLine();
		char result2 = grade2.charAt(11);
		int numvalue2 = Character.getNumericValue(result2);
		
		System.out.println("What is your name?: ");
		String studName3 = read.nextLine();
		
		System.out.println("What grade are you now?: ");
		String grade3 = read.nextLine();
		char result3 = grade2.charAt(11);
		int numvalue3 = Character.getNumericValue(result3);
		
		
	}
	
}

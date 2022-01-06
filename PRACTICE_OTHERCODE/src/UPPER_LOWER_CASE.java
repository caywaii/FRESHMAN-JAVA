import java.util.*;
public class UPPER_LOWER_CASE {

	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		boolean bl1 = Character.isUpperCase(0);
		char letters;
		
		System.out.println("UPPER AND LOWER CASE EXCERCISE");
		System.out.println("TRUE - UPPERCASE");
		System.out.println("FALSE - LOWERCASE");
		
		System.out.println("Enter a Letter: ");
	    letters = input.next().charAt(0);
	    
	    
		
		if(letters >= 'A' && letters <= 'Z') {
			System.out.println(bl1);
		}else {
			System.out.println(bl1);
		}
			
		}
		
		
		
		
		
	}


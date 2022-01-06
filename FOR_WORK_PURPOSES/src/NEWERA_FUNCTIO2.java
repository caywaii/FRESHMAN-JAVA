import java.util.*;
public class NEWERA_FUNCTIO2 {

	static Scanner input = new Scanner(System.in);
	static int userInteger, userAnotherInteger;
	
	public static void main(String[] args) {
		
		System.out.print("Enter First Integer: ");
		userInteger = input.nextInt();
		System.out.print("Enter Second Integer: ");
		userAnotherInteger = input.nextInt();
		
		isMultiple();
	}
	
	public static void isMultiple() {
		
		if(userAnotherInteger % userInteger == 0) {
			System.out.println(userAnotherInteger + " is a multiple of " + userInteger);
		}else {
			System.out.println(userAnotherInteger + " is not a multiple of " + userInteger);
		}

	}
}

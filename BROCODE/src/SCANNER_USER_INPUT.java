import java.util.Scanner;

public class SCANNER_USER_INPUT {

	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("Enter your name: ");
		String name = input.nextLine();
		System.out.println("Hello " + name);
		
		System.out.print("Age: ");
		int age = input.nextInt();
		          input.nextLine(); //To avoid that the user can't input 
		System.out.println("Your are " + age + " years old");
		
		System.out.print("What is your favorite food: ");
		String food = input.nextLine();
		System.out.println("You like " + food);
		
		
		
		
	}
	
}

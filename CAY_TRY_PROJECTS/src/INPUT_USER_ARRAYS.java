import java.util.*;
public class INPUT_USER_ARRAYS {

	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
	Compute();
		
	}
	
	public static void Compute() {
		
		int[] num = new int[2];
		
		System.out.print("Enter First Number: ");
		num[0] = input.nextInt();
		System.out.print("Enter Second Number: ");
		num[1] = input.nextInt();
		
		int sum = num[0] + num[1];
		int difference = num[0] - num[1];
		int multiply = num[0] * num[1];
		int divide = num[0] / num[1];
		
		System.out.println("==================================");
		
		System.out.println("The Sum: " + sum);
		System.out.println("The Differnce: " + difference);
		System.out.println("The Product : " + multiply);
		System.out.println("The Quotient: " + divide);
		
		
 	}
	
	
}

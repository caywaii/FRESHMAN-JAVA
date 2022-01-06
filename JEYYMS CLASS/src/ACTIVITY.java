import java.util.*;
public class ACTIVITY {

	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int num;
		int x = 1;
		System.out.println("Multiplication Table");
		
		System.out.println("Enter a Number: ");
		num = input.nextInt();
		
	      
		if(num <= 0 || num > 10) {
                 System.out.println("Sorry, Invalid Input!");
		}else {
			do{
				System.out.println(num + " * " + x + " = "+ num * x);
				 x++;
				}while(x <= 10);
		}
		
		
		
			
		

	}
}

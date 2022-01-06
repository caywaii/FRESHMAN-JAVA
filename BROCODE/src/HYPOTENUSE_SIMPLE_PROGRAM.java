import java.util.*;

public class HYPOTENUSE_SIMPLE_PROGRAM {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		double x;
		double y;
		double z;

		System.out.println("Hypotenuse Program");

		System.out.print("Enter side x: ");
		x = input.nextDouble();

		System.out.println("Enter side y: ");
		y = input.nextDouble();
 		
		z = Math.sqrt((x*x)+(y*y));
		System.out.println("===================================");
		System.out.println("The Hypotenuse is: " + z);
		
		System.out.println("Thank you!");
	}
}

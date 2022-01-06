
public class SWAPPING_VARIABLES {

	public static void main(String[] args) {
		
		String x = "water";
		String y = "Kool-Aid";
		
		x=y;
		
		System.out.println("EXAMPLE 1: HAVING THE SAME VALUE");
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		
		System.out.println("---------------------------------");
		
		String a = "water";
		String b = "Kool-Aid";
		String temp;
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("EXAMPLE 2: SWAPPING");
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		
	}
}

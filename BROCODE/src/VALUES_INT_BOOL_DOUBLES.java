// This are not true random numbers but pseudo-random numbers
import java.util.Random;

public class VALUES_INT_BOOL_DOUBLES {

	static Random input = new Random();
	
	public static void main(String[] args) {
		
		int x = input.nextInt(6)+1;
		double y = input.nextDouble();
		boolean z = input.nextBoolean();
		
		System.out.println(x);
		System.out.println("---------");
		System.out.println(y);
		System.out.println("---------");
		System.out.println(z);
	}
}

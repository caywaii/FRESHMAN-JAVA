import java.util.*;

public class FIBONACCI_ARRAY {

	static Scanner input = new Scanner(System.in);

	static int total;

	public static void main(String[] args) {
		
		System.out.print("Enter a number of recursion =");
		int user = input.nextInt();
		
	
		for (int i = 0; i <= user-1; i++) {
			int print = Summation(i);
			System.out.println(" " + print);
		}
		
	}

	public static int Summation(int n) {
		if (n == 0)
			return 0;
		else if (n == 1)
			return 1;
		else
			return Summation(n - 2) + Summation(n - 1);
	}
}

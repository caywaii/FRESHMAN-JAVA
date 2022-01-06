import java.util.Scanner;
public class xtian_bantos {

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter a number: ");
	        int x = scanner.nextInt();
	        int total = 0;

	        for (int i = 0; i < x; i++) {
	            System.out.println(fibo(i));
	            total = total + fibo(i);
	        }
	        System.out.println("Output is: " + total);
	    }

	    public static int fibo(int x) {
	        if (x <= 1) {
	            return x;
	        }

	        return fibo(x - 1) + fibo(x - 2);
	    }

	}


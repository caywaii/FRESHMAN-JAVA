
import java.util.Scanner;

public class another1extra {
	
	static Scanner input = new Scanner(System.in);
	   static int n1 = 0, n2 = 1, n3 = 0;
	   static void fibbonacci(int count) {
	      if (count > 0) {
	         n3 = n1 + n2;
	         n1 = n2;
	         n2 = n3;
	         System.out.print(" " + n3);
	         fibbonacci(count - 1);
	      }
	   }
	   public static void main(String args[]) {
		   
		   System.out.println("Number");
	        int count = input.nextInt();
	      System.out.print(n1 + " " + n2);
	      fibbonacci(count - 2);
	   }
	}


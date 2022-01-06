package praclang;
import java.util.Scanner;
public class char3 {

	public static void main(String[] args) {


		Scanner read = new Scanner(System.in);
		String empName;
		double ratePay, salary;
		int totalHours;
		int ans = 1;


		do {
			System.out.print("Enter Employee Name: ");
			empName = read.nextLine();

			System.out.println("Enter  pay rate: " );
			ratePay = read.nextDouble();

			System.out.println("Enter total of hours worked: " );
			totalHours = read.nextInt(); 

			salary = (ratePay*totalHours);
			System.out.println(" Your salary is" + salary);

		}while(ans==1);




	}

}















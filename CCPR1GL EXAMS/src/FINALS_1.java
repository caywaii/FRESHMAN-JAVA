import java.util.*;

public class FINALS_1 {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Please Enter a Number");
		int inputnumber = input.nextInt();

		if (inputnumber < 0 || inputnumber > 99) {
			System.out.println("Invalid Input");
		} else {

			int num1 = inputnumber % 10;
			int num2 = inputnumber / 10;
			int num3 = num2 % 10;

			String onetwodigits[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
					"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
					"nineteen"};
			String tens[] = { "zero", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty",
					"ninety" };
			
			if(inputnumber < 20) {
				System.out.println(onetwodigits[inputnumber]);
			}else if(inputnumber < 100) {
				System.out.println(tens[num3] + "-" + onetwodigits[num1]);
			}

		}
	}

}

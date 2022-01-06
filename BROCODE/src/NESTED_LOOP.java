import java.util.*;

public class NESTED_LOOP {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		int rows;
		int columns;
		String symbol = "";

		System.out.print("Enter number of rows: ");
		rows = input.nextInt();

		System.out.print("Enter number of columns: ");
		columns = input.nextInt();

		System.out.print("Enter symbol to use: ");
		symbol = input.next();

		System.out.println("==================");

		for (int i = 1; i <= rows; i++) {
			System.out.println();
			for (int j = 1; j <= columns; j++) {
				System.out.print(symbol);
			}
		}
	}
}

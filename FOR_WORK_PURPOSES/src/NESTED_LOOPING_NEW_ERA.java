import java.util.*;

public class NESTED_LOOPING_NEW_ERA {

	static Scanner input = new Scanner(System.in);

	public static void main(String args[]) {
		
		System.out.print("Enter number of rows: ");
		int rows = input.nextInt();
		System.out.print("Enter number of column: ");
		int columns = input.nextInt();

		int[][] datas = { 
				{ 1, 1, 2, 3 }, 
			    { 5, 8, 2, 1 },
			    { 3, 2, 0, 5 }
		};
		
		

		for(rows = 0; rows < datas.length; rows++) {
			for(columns = 0; columns < datas[rows].length; columns++) {

				System.out.print(datas[rows][columns] + " ");
			}
			System.out.println();
		}
			
		System.out.println("Position " + datas[rows] + datas[columns]);
	}
	
 
}

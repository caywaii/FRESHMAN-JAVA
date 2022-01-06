package praclang;

import java.util.Arrays;

public class ARRAYS {

	public static void main(String[] args) {

		int[][] temp = {

				{ 1, 2, 3 }, 
				{ 4, 5, 6 },
				{ 7, 8, 9 }

		};

		for (int i = 1; i < 11; i++) {
			System.out.println(i);

		}

		int[] tempo = { 1, 2, 3, 4, 5 };

		for (int num = 0; num < tempo.length; num++) {
			System.out.println(tempo[num] + " this is the value ");
		}	

		
		System.out.print(Arrays.toString(tempo));
		
		System.out.print(Arrays.deepToString(temp));
		
		
		
		
		
		
	}

}

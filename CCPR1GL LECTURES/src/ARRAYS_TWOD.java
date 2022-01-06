
public class ARRAYS_TWOD {

	public static void main(String[] args) {
		                //index (number) sub (number)
		int a[][] = {{0,1,2,3},
				     {4,5,6,7},
				     {8,9,10,11}};
		for (int i = 0; i < 4; i++) {
			System.out.println(a[2][i]);
			}
		
		System.out.println("======================");
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				System.out.println(a[i][j] + " ");
			}
		      System.out.println();
		}
    
		
		
		
		}
	}


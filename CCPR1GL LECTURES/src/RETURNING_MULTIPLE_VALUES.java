
public class RETURNING_MULTIPLE_VALUES {

	public static void main (String[] args) {
		
		diff(3,3);
		
	}
	
	public static int[] diff(int a, int b) {
		int add = a + b;
		int minus = a + b;
		
		int result[] = {add, minus};
		System.out.println(result[0]);
		System.err.println(result[1]);
		
		return result;
		
		
	}
	
}

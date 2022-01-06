
public class ARRAYS {

	public static void main(String[] args) {
	                          //  0          1           2           3           4          5          6
		String daysOfWeek[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		
		//System.out.println(daysOfWeek[1]); 
		
		for(String get: daysOfWeek) {      //advisable
			System.out.println(get);
		}
		
		for (int i = 0; i <= 6; i++) {
			System.out.println(daysOfWeek[i]);
		}
		
		
		
		
	}
}

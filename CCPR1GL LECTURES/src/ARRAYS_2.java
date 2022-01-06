
public class ARRAYS_2 {
	public static void main(String[] args) {
		// length 1-5 
		// index 0-5
		String[] cars = {"Volvo", "BMW", "Ford", "Toyota", "Honda"};
		String weeks[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		
		System.out.println("==================");
		System.out.println(cars[1]);
		
		System.out.println("==================");
		System.out.println(weeks[1]);
		
		System.out.println("==================");
		System.out.println(weeks.length);
		
		System.out.println("==================");
		for(String get: weeks) {
			System.out.println(get);
		}
		
		System.out.println("==================");
		for (int i = 0; i <weeks.length; i++) {
			System.out.println(weeks[i]);
			if(i==2) {
				break;
			}
		}
		
		System.out.println("==================");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

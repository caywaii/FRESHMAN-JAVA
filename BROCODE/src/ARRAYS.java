
public class ARRAYS {

	public static void main(String[] args) {
		
		String[] cars = {"Camaro", "Corvette" , "Tesla"};
		
		System.out.println(cars[0]);
		
		System.out.println("====================");
		
		String[] motor = new String[3];
		
		motor[0] = "Hyundai";
		motor[1] = "MIO";
		motor[2] = "EWAN";
		
		System.out.println(motor[2]);
		
		System.out.println("=====================");
		
		for(int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
	}
}

import java.util.*;
public class GRADES {

	public static void main(String[] args) {
		int ave, midGrade, finGrade;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Midterm Grade: ");
		midGrade = input.nextInt();
		System.out.print("Enter Final Grade: ");
		finGrade = input.nextInt();
		
		ave = (midGrade + finGrade)/2;
		
		System.out.println("The average is: " + ave);
		
		if (ave >= 101) {
			System.out.println("Out of bounce!");
		}else if (ave >= 95) {
			System.out.println("President's List");
		}else if (ave >= 90) {
			System.out.println("Dean's List");
		}else if (ave >= 85) {
			System.out.println("Excellent");
		}else if (ave >= 80) {
			System.out.println("Very Good");
		}else if (ave >= 75) {
			System.out.println("Good");
		}else {
			System.out.println("Failed");
		}
		
						
		
	}
	
	
}

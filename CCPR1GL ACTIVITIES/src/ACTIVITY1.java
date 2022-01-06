import java.util.*;
public class ACTIVITY1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int grading;
		int grade = 0;
		int result = 0;
		
		System.out.print("Enter your Average Semester Grades: ");
		grading = input.nextInt();
		
		System.out.println("--------------------------------------");
		
		for (int i = 1; i <= grading; i++) {
			
			System.out.print("Enter your Average Grade: ");
			grade = input.nextInt();
			
			result = result + grade;
			
		}
		
		    result = result / grading;
		
		System.out.println("-----------------------------------------");
		
		System.out.print("Final Grade: " + result);
		
	}
	
}

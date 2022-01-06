import java.util.*;
public class GRADES_WHILE_LOOP {

	public static void main(String[] args) {
		
		int ans = 1;
		String studName;
		int midGrade, finGrade, ave;
		
		Scanner read = new Scanner(System.in);
		
		
		while(ans==1) {
			System.out.print("Student Name: ");
			studName = read.next();
			System.out.print("Midterm Grade: ");
			midGrade = read.nextInt();
			System.out.print("Final Grade: ");
			finGrade = read.nextInt();
			
			
			ave = (midGrade+finGrade)/2;
			System.out.println("The average of " + studName + "is: " + ave );
			System.out.println("Do you want another transaction? 1-Yes; 2-No");
			ans = read.nextInt();
		}
		
		
		
		
	}
	
	
	
}

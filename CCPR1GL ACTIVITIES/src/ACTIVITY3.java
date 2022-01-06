import java.util.*;

public class ACTIVITY3 {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
 
		int num;
		int total = 0;
		int result = 0;
		
		
		int[]grades= {87,90,77,89,88,94,95,83,82,75};
		
		System.out.print("Enter Array Length: ");
		num = input.nextInt();
		
		System.out.println("========================");
		
		if (num > grades.length) {
			System.out.println("Invalid Input!");
		}else {
			for(int i = 0; i <= num-1; i++) {
				System.out.println("The Grade " + (i+1) + " is " + grades[i]);
				total = total + grades[i];	
			}	
			
			result = total/num;
			
			System.out.println("The Average is: " + result);
			if(result <= 77) {
				System.out.println("Remark is Failed");
			}else{
				System.out.println("Remark is Passed");
			}
		}
					
	}

}

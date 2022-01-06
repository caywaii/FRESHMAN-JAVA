package EXERCISE;

import java.util.*;

public class EXERCISE_1 {

	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("Enter a number: ");
		int enterNum = input.nextInt();
		
		printNumAsc(enterNum);
	}
	
	public static void printNumAsc(int num) {
		
		if(num == 0) {
			return;
		}else {
			printNumAsc(num - 1);
			System.out.println(num);
			
		}
		
	}
}

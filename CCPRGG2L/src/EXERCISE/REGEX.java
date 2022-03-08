package EXERCISE;

import java.util.*;
import java.util.regex.*;
public class REGEX {

	public static void main(String[] args) {
		
		//Patterns:
		// "." = any value is good/ 
		// ".." = "bilang ng character"
		// "\\d" = always use double slash. Digit from 0-9 will "true"
		// "\\D" = non digit/not numbers  character will true
		// "\\s" = whitespace character [\t \n \xOB \f \r]
		// we can also combine in patterns example = ".//s"
		// "\\S" = a non whitespace character
		// "\\w" = word character 
		// "\\W" = word character with symbols
		
		Scanner input = new Scanner(System.in);
		String str1 = "\\W";
		
		String str3 ="\"hello\"";
		
		Pattern pattern = Pattern.compile(str1);
		System.out.print("Enter a String: ");
		String str2 = input.nextLine();
		
		Matcher evaluator = pattern.matcher(str2);
		
		boolean result = evaluator.matches();
		System.out.println(result);
		System.out.println(str3);
	}
	
}

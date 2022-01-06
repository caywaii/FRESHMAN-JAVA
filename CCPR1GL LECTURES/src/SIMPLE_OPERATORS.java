import java.util.*;

//lesson number 1 and 2

public class SIMPLE_OPERATORS {
	
	public static void main(String[] args) {
		System.out.println("Hello Sir :)");
		test(); //this is how you will enter the source code in the main class
		sum();
		multiplication();
		division();
		subtraction();
		System.out.println(new Date());
		
		//String - particular variable is holding the string "its your choice of what variable to use"
	}
	
	//this part is like a source code that you can implement in the "main"
	//not: use this instead of "copy paste" 
	public static void test(){ 
		System.out.println("YEHEY");
	//"println" - breaks down the sentence
	//"print"- does not break down the sentence
		
	}
	
	public static int sum(){
		int num1, num2, result;
		num1=8;
		num2=7;
		result=num1+num2;
		System.out.println("The sum is: " + result);
		return result;
		// return result- to return the result in public static void main
		
	}
	
	public static int multiplication(){
		int num1, num2, result;
		num1=8;
		num2=7;
		result=num1*num2;
		System.out.println("The product is: " + result);
		return result; 
	}
	
	public static int division(){
		int num1, num2, result;
		num1=8;
		num2=7;
		result=num1/num2;
		System.out.println("The quotient is: " + result);
		return result; 
	}
	
	public static int subtraction(){
		int num1, num2, result;
		num1=8;
		num2=7;
		result=num1-num2;
		System.out.println("The difference is: " + result);
		return result; 
	}
	//Types of Primitive (Integer and Double)
	//"integer" is a data type that hold a numeric value
	//signed integer you can use -128 to (positive) 127
	//"unsigned integer"
	
	//Floating points - referring to remainder point
	//Float vs. Double	
	//1.Float - precise value is 12 digits (32 BIT) if it doubles it will be call doubles. Floating point does not focus on whole number hence focus on
	//1.2. floating number
	//Double - value is more than 12 digits and focus on whole number
	
	//Character is a uni code
	
	//Booleon - instead of true or false use 0 and 1

}
	
	

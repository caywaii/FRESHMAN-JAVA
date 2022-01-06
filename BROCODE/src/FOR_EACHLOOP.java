import java.util.*;
public class FOR_EACHLOOP {

	public static void main(String[] args) {
		
		
		
		String[] animals = {"cat", "dog", "rat", "bird"};
		
		ArrayList<String> food = new ArrayList<String>();	
		
		food.add("cat food");
		food.add("dog food");
		food.add("sunflower");
		food.add("rice");
		
		for(String i : animals) {
			System.out.println(i);
		}
		
		for(String j : food) {
			System.out.println(j);
		}
		
	}
}

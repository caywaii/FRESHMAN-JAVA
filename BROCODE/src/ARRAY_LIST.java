import java.util.ArrayList;
public class ARRAY_LIST {

	public static void main(String[] args) {
		
		//if primitive data type = example: ArrayList<Integer>
		
		ArrayList<String> food = new ArrayList<String>();
		
		food.add("pizza");
		food.add("hamburger");
		food.add("hotdog");
		
		//food.set(0, "sushi"); // replacing the index
		//food.remove(2); // removing certain index
		//food.clear(); // clear all the index
		
		
		for(int i = 0; i < food.size(); i++) {
			System.out.println(food.get(i));
		}
	}
	
}

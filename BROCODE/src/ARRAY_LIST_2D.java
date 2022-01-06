import java.util.*;


public class ARRAY_LIST_2D {

	public static void main(String[] args) {
		
		ArrayList<ArrayList<String>> groceryList = new ArrayList();
		
		ArrayList<String> bakeryList = new ArrayList();
		bakeryList.add("pasta");
		bakeryList.add("garlic bread");
		bakeryList.add("donuts");
		
		ArrayList<String> produceList = new ArrayList();
		bakeryList.add("tomatoes");
		bakeryList.add("zucchini");
		bakeryList.add("peppers");
		
		ArrayList<String> drinkList = new ArrayList();
		bakeryList.add("water");
		bakeryList.add("soda");
		bakeryList.add("coffee");
		
		
		groceryList.add(bakeryList);
		groceryList.add(produceList);
		groceryList.add(drinkList);
		
		System.out.println(groceryList);
		
	}
}

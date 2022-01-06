import java.util.*;
public class LOGICAL_OPERATORS {

	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Enter a temperature: ");
		int temp = input.nextInt();
		
		if (temp > 30) {
			System.out.println("It is hot outside!");
		}else if(temp >= 20 && temp <= 30) {
			System.out.println("It is warm outside");
		}else {
			System.out.println("It is cold outside");
		}
		
		System.out.println("==============================");
		try {
			System.out.println("You are playing a game! press q or Q to quit");
			String response = input.next();
			
			if(!response.equals("q") && !response.equals("Q")) {
				
				System.out.println("You are still playing");
			}else{
				System.out.println("You quit the game");
			}
		}catch(Exception e) {
			System.out.println("Just choose between q and Q");
		}
		
		
		
	}
}

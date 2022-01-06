import java.util.*;
public class BUS_TICKET_SYSTEM {
	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("***********************************************");
		System.out.println("\tWelcome to National Transit");
		System.out.println("***********************************************");
		
		System.out.print("Enter Email: ");
		String inputemail = input.nextLine();
		
		System.out.print("Enter Password: ");
		String inputpassword = input.nextLine();
		
		if(inputemail.equals("jenni@yaky.com") && inputpassword.equals("cay")) {
			
			System.out.println("***********************************************");
			System.out.println("\tBus Reservation Ticketing System");
			System.out.println("***********************************************");
			
			System.out.println("\n[1] - Bus Destination");
			System.out.println("[2] - Passengers");
			System.out.println("[3] - Billing");
			System.out.println("[4] - View");
			System.out.println("[5] - Exit");
			System.out.println("***********************************************");
			System.out.println("***********************************************");
			
			System.out.println("Enter Choice: ");
			String choice = input.nextLine();
			
			switch(choice) {
			
			case "1":
				
				System.out.println("");
				
			
				
			}
			
			
			
			
		}else {
			System.out.println("Wrong Email or Password. Please Try Again");
		}
		
		
		
		
	}		
	}

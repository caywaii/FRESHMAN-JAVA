	import java.util.*;
public class XTIANASSIGNMENT {


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        String UserTyped, Passtyped;
	        boolean loulou = false;

	        String []Users = {"one", "two", "three", "four", "five", "six"};
	        String []Pass  = {"1",    "2",    "3",    "4",    "5",    "6" };

	        System.out.print("Enter Username :>: ");
	        UserTyped = scanner.nextLine();
	        System.out.print("Enter Password :>: ");
	        Passtyped = scanner.nextLine();


	        for(int i = 0; i< Users.length; i++){
	            if(UserTyped.equals(Users[i]) && Passtyped.equals(Pass[i])){
	                System.out.println("Welcome to our system!");
	                loulou = true;
	            }


	        }
	        for(int x = 0; x < Users.length; x++) {
	            if (UserTyped.equals(Users[x]) && !Passtyped.equals(Pass[x])) {
	                System.out.println("User and Password mismatch!");
	                loulou = true;
	            }
	        }

	        if(loulou == false){
	            System.out.println("Username and password not found!");
	        }



	    }
	}


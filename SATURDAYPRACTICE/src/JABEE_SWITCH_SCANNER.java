import java.util.*;



public class JABEE_SWITCH_SCANNER {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		int ans = 1;

		System.out.println("Simple Switch Exercise ");
		System.out.println("===============================================================");

		do {
			System.out.println("===============================================================");
			System.out.println("Jollibee Chickenjoy Menu\n");

			System.out.println("\t[1] Jollibee Chickenjoy 1pc Original (85 Pesos)");
			System.out.println("\t[2] Jollibee Chickenjoy 2pc Original (120 Pesos)");
			System.out.println("\t[3] Jollibee Chickenjoy 1pc Spicy (85 Pesos)");
			System.out.println("\t[4] Jollibee Chickenjoy 2pc Spicy (120 Pesos)");
			System.out.println("\t[5] Jollibee Chickenjoy 2pc Spicy and Original (120 Pesos)\n");
			
			try {
				System.out.print("Enter Money Amount: ");
				double pay = input.nextDouble();

				System.out.print("Please enter the number listed on the menu: ");
				int numMenu = input.nextInt();

				System.out.println("===============================================================");

				switch (numMenu) {
				case 1:
					System.out.println("Jollibe Chickenjoy 1pc Original (85 pesos)");
					System.out.println("Money: " + String.format("%.2f", pay));
					double total = pay - 85;

					System.out.println("===========================================================");
					System.out.println("Remaining Money: " + String.format("%.2f", total));
					System.out.println("Add-ons");
					System.out.println("[R] - Extra Rice (20 Pesos)");
					System.out.println("[G] - Extra Gravy (30 Pesos)");
					System.out.println("[N] - No Add-ons");
					String add = input.next();
					
					if(add.equals("R")) {
						int x = (int) (total - 20);
						int y = (int) (total + 20); 
						System.out.println("Total: " + String.format("%.2f", y));
						System.out.println("Change: " + String.format("%.2f", x));
						
					}else if(add.equals("G")) {
						int x2 = (int) (total - 30);
						int y2 = (int) (total + 30);
						System.out.println("Total: " + String.format("%.2f", y2));
						System.out.println("Change: " + String.format("%.2f", x2));
					}else {
						if (pay < 85) {
							System.out.println("Insufficient Funds!");
						} else {
							System.out.println("Change: " + String.format("%.2f", total));
						}
					}
					break;

				case 2:
					System.out.println("[2] Jollibee Chickenjoy 2pc Original (120 Pesos)");
					System.out.println("Money: " + String.format("%.2f", pay));
					double total1 = pay - 120;
					
					System.out.println("===========================================================");
					System.out.println("Remaining Money: " + String.format("%.2f", total1));
					System.out.println("Add-ons");
					System.out.println("[R] - Extra Rice (20 Pesos)");
					System.out.println("[G] - Extra Gravy (30 Pesos)");
					System.out.println("[N] - No Add-ons");
					String add1 = input.next();
					
					if(add1.equals("R")) {
						int x = (int) (total1 - 20);
						int y = (int) (total1 + 20); 
						System.out.println("Total: " + String.format("%.2f", y));
						System.out.println("Change: " + String.format("%.2f", x));
						
					}else if(add1.equals("G")) {
						int x2 = (int) (total1 - 30);
						int y2 = (int) (total1 + 30);
						System.out.println("Total: " + String.format("%.2f", y2));
						System.out.println("Change: " + String.format("%.2f", x2));
					}else {
						if (pay < 120) {
							System.out.println("Insufficient Funds!");
						} else {
							System.out.println("Change: " + String.format("%.2f", total1));
						}
					}
					break;
					
				case 3:
					System.out.println("[3] Jollibee Chickenjoy 1pc Spicy (85 Pesos)");
					System.out.println("Money: " + String.format("%.2f", pay));
					double total2 = pay - 85;

					System.out.println("===========================================================");
					System.out.println("Remaining Money: " + String.format("%.2f", total2));
					System.out.println("Add-ons");
					System.out.println("[R] - Extra Rice (20 Pesos)");
					System.out.println("[G] - Extra Gravy (30 Pesos)");
					System.out.println("[N] - No Add-ons");
					String add2 = input.next();
					
					if(add2.equals("R")) {
						int x = (int) (total2 - 20);
						int y = (int) (total2 + 20); 
						System.out.println("Total: " + String.format("%.2f", y));
						System.out.println("Change: " + String.format("%.2f", x));
						
					}else if(add2.equals("G")) {
						int x2 = (int) (total2 - 30);
						int y2 = (int) (total2 + 30);
						System.out.println("Total: " + String.format("%.2f", y2));
						System.out.println("Change: " + String.format("%.2f", x2));
					}else {
						if (pay < 85) {
							System.out.println("Insufficient Funds!");
						} else {
							System.out.println("Change: " + String.format("%.2f", total2));
						}
					}
					break;
				case 4:
					System.out.println("[2] Jollibee Chickenjoy 2pc Spicy (120 Pesos)");
					System.out.println("Money: " + String.format("%.2f", pay));
					double total3 = pay - 120;

					System.out.println("===========================================================");
					System.out.println("Remaining Money: " + String.format("%.2f", total3));
					System.out.println("Add-ons");
					System.out.println("[R] - Extra Rice (20 Pesos)");
					System.out.println("[G] - Extra Gravy (30 Pesos)");
					System.out.println("[N] - No Add-ons");
					String add3 = input.next();
					
					if(add3.equals("R")) {
						int x = (int) (total3 - 20);
						int y = (int) (total3 + 20); 
						System.out.println("Total: " + String.format("%.2f", y));
						System.out.println("Change: " + String.format("%.2f", x));
						
					}else if(add3.equals("G")) {
						int x2 = (int) (total3 - 30);
						int y2 = (int) (total3 + 30);
						System.out.println("Total: " + String.format("%.2f", y2));
						System.out.println("Change: " + String.format("%.2f", x2));
					}else {
						if (pay < 120) {
							System.out.println("Insufficient Funds!");
						} else {
							System.out.println("Change: " + String.format("%.2f", total3));
						}
					}
					break;
				case 5:
					System.out.println("[2] Jollibee Chickenjoy 2pc Original and Spicy (120 Pesos)");
					System.out.println("Money: " + String.format("%.2f", pay));
					double total4 = pay - 120;
					System.out.println("===========================================================");
					System.out.println("Remaining Money: " + String.format("%.2f", total4));
					System.out.println("Add-ons");
					System.out.println("[R] - Extra Rice (20 Pesos)");
					System.out.println("[G] - Extra Gravy (30 Pesos)");
					System.out.println("[N] - No Add-ons");
					String add4 = input.next();
					
					if(add4.equals("R")) {
						int x = (int) (total4 - 20);
						int y = (int) (total4 + 20); 
						System.out.println("Total: " + String.format("%.2f", y));
						System.out.println("Change: " + String.format("%.2f", x));
						
					}else if(add4.equals("G")) {
						int x2 = (int) (total4 - 30);
						int y2 = (int) (total4 + 30);
						System.out.println("Total: " + String.format("%.2f", y2));
						System.out.println("Change: " + String.format("%.2f", x2));
					}else {
						if (pay < 85) {
							System.out.println("Insufficient Funds!");
						} else {
							System.out.println("Change: " + String.format("%.2f", total4));
						}
					}
					break;
				default:
					System.out.println("Sorry, the number you enter is not on the menu!");
				}

			} catch (Exception e) {
				System.out.println("Invalid Input!");
			}
			System.out.println("===============================================================");
			System.out.print("Order Again? [1] - Yes or [2] - No:  ");
			ans = input.nextInt();	

		} while (ans == 1);
		System.out.println("===============================================================");
		System.out.println("Thank you!");

	}
}

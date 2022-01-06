import java.text.DecimalFormat;
import java.util.*;
public class MIDTERM1 {

	static Scanner read = new Scanner(System.in);
	static DecimalFormat DF = new DecimalFormat();
	
	public static void main(String []args) {
	
		DF.setMaximumFractionDigits(2);
		
		int ans = 1;
		String chooseItems;
		
		do {
			
			System.out.println("----------------------------------");
			System.out.println("Simple Sales Transaction: Exam");
			
			System.out.println("------------------------------------");
			System.out.println("[1] Pencil (20.00)");
			System.out.println("[2] Notebook (40.00)");
			System.out.println("[3] Eraser (10.00)");
			System.out.print("Please Enter Item Code: ");
			chooseItems = read.nextLine();
			
			
			if(chooseItems.equals("1")) {
				Pencil(chooseItems);
			}else if(chooseItems.equals("2")){
				Notebook(chooseItems);
			}else if(chooseItems.equals("3")){
				Eraser(chooseItems);
			}else {
				System.out.print("INVALID INPUT!");
			}
			ans = Integer.parseInt(read.nextLine());
		}while(ans==1);
		
						
	}	
	
	public static void Pencil(String chooseItems) {
		
		int x = 20;
		double Qty,CTP;
		
		System.out.println("------------------------------------");
		
		System.out.println("Item Code: 1");
		System.out.println("Description Pencil [20.00]");
		System.out.print("Quantity: ");
		Qty = read.nextDouble();
		      read.nextLine();
		
		double penAmnt = Qty * x;
		
		System.out.println("Total Amount: " + DF.format(penAmnt));
		System.out.print("Cash Tendered: ");
		CTP = read.nextDouble();
		      read.nextLine();
		double changePen =  CTP - penAmnt;
		if(penAmnt > CTP) {
			System.out.println("Sorry, Insufficient Funds!");
		}else {
			System.out.println("Change: " + changePen);
		}
		
		System.out.println("----------------------------------");
		System.out.println("Buy Another Item? 1 - Yes; 2 - No");
		
	}
	
	public static void Notebook(String chooseItems) {
		
		int y = 40;
		double Qty2, CTP2;
		
		System.out.println("----------------------------------");
		
		System.out.println("Item Code: 2");
		System.out.println("Description Notebook [40.00]");
		System.out.print("Quantity: ");
		Qty2  = read.nextDouble();
		        read.nextLine();
		double NBAmnt = Qty2 * y;
		
		System.out.println("Total Amount: " + DF.format(NBAmnt));
		System.out.print("Cash Tendered: ");
		CTP2 = read.nextDouble();
		       read.nextLine();
		
		double changeNB =  CTP2 - NBAmnt;
		if(NBAmnt > CTP2) {
			System.out.println("Sorry, Insufficient Funds");
		}else {
			System.out.println("Change: " + changeNB);
		}
		
		System.out.println("----------------------------------");
		System.out.println("Buy Another Item? 1 - Yes; 2 - No");
		
	}
	
	public static void Eraser(String chooseItems) {
		
		int z = 10;
		double Qty3, CTP3;
		
		System.out.println("----------------------------------");
		
		System.out.println("Item Code: 3");
		System.out.println("Description Eraser [10.00]");
		System.out.print("Quantity: ");
		Qty3 = read.nextDouble();
		       read.nextLine();
		
		double EraseAmnt = Qty3 * z;
		
		System.out.println("Total Amount: " + DF.format(EraseAmnt));
		System.out.print("Cash Tendered: ");
		CTP3 = read.nextDouble();
		       read.nextLine();
		
		double changeErase =  CTP3 - EraseAmnt;
		if(EraseAmnt > CTP3) {
			System.out.println("Sorry, Insufficient Funds");
		}else {
			System.out.println("Change: " + changeErase);
		}
		
		System.out.println("----------------------------------");
		System.out.println("Buy Another Item? 1 - Yes; 2 - No");
		
	}
	
	
	
}

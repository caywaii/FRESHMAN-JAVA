package praclang;
import java.util.*;
public class char1 {	
	
	       
			public static void main(String[] args) {
			Scanner read = new Scanner(System.in); 
			    int ans = 1;
			    String code;
			    String desc;
			    double price1= 20.00;
			    double price2= 40.00;
			    double price3= 10.00;
			    
			    
			     do {
			      
			      System.out.print("Item Code: ");
			      code = read.next();
			      
			      
			      
			      if (code.equals("1")){
			      
			          
			         
			         System.out.println("Item code : 1");
			         System.out.println("Description: Pencil = 20.00" );
			         System.out.print("Qty: " );
			         int qty = read.nextInt();
			         double totalAmount = (price1*qty) ;
			         System.out.println("Total Amount:" + totalAmount);
			         System.out.print("Cash Tendered:" );
			         double cr = read.nextDouble();
			         if(totalAmount > cr) {
				    	    System.out.println("WALA KANG PERA BOBO!");
				       }else {
				    	   double change1 = (cr - totalAmount);
					       System.out.println("Change: " + change1);  
				       }
			   
			         System.out.println("Buy another item? 1 - Yes, 2 - No");
			         ans = read.nextInt();
			       
			     }
			      

			       else if (code.equals ("2")){
			         
			       System.out.println("Item code : 2");
			       System.out.println("Description: Notebook = 40.00" );
			       System.out.print("Qty: " );
			       int qty = read.nextInt();
			       double totalAmount2 = (price2*qty) ;
			       System.out.println("Total Amount:" + totalAmount2);
			       System.out.print("Cash Tendered:" );
			       double cr2 = read.nextDouble();
			       if(totalAmount2 > cr2) {
			    	    System.out.println("WALA KANG PERA BOBO!");
			       }else {
			    	   double change2 = (cr2 - totalAmount2);
				       System.out.println("Change: " + change2);  
			       }
			       
			       System.out.println("Buy another item? 1 - Yes, 2 - No");
			       ans = read.nextInt();
			       
			      }else if (code.equals ("3")){
			       System.out.println("Item code : 3");
			       System.out.println("Description: Eraser = 10.00" );
			       System.out.print("Qty: " );
			       int qty = read.nextInt();
			       double totalAmount3 = (price3*qty) ;
			       System.out.println("Total Amount:" + totalAmount3);
			       System.out.print("Cash Tendered:" );
			       double cr3 = read.nextDouble();
			       if(totalAmount3 > cr3) {
			    	    System.out.println("WALA KANG PERA BOBO!");
			       }else {
			    	   double change3 = (cr3 - totalAmount3);
				       System.out.println("Change: " + change3);  
			       }
			      
			       System.out.println("Buy another item? 1 - Yes, 2 - No");
			       ans = read.nextInt();   
			          
			      }
			    }while (ans==1);
			      
			    
				
			}
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


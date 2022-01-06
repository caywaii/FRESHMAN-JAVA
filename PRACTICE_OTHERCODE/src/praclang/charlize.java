package praclang;

import java.util.*;

public class charlize {

		public static void main(String[] args) {
		    int ans = 1;
		    String name;
		    String choice;
		    String option;
		    double bpay, ratePay, overtimePay;
		    int overTime;
		    int noHoursWorked;
		    
		    while (ans==1)  {
		      Scanner read = new Scanner(System.in); 
		      System.out.print("Enter Employee Name: ");
		      name = read.nextLine();
		      System.out.println("Choose F for Full-Time Employee, or P for Part-Time Employee ");
		      choice = read.nextLine();
		      
		      if (choice.equals("F")){
		      
		          
		         System.out.println("-----Full-Time Employee-----");
		         System.out.print("Enter Basic Payment: " );
		         double bPay = read.nextDouble();
		      
		         System.out.println("---------------------");
		         System.out.println("Employee Name: " + name);
		         name = read.nextLine();
		         System.out.println("Basic Payment: " + bPay);
		      
		         System.out.println("---------------------");
		         System.out.println("Gross Payment: " + bPay);
		      
		         System.out.println("Do you want another transaction? 1 - Yes, 2 - No");
		         ans = read.nextInt();
		       
		     }
		      

		       else if (choice.equals ("P")){
		         
		       System.out.println("-----Part-Time Employee-----");
		       System.out.println("Enter rate per hour: " );
		       double ratePay1 = read.nextDouble();
		       System.out.println("Enter no. of hours worked; " );
		       int noHoursWorked1 = read.nextInt();
		       System.out.println("Enter no. overtime: " );
		       
		       int overTime1 = read.nextInt();
		       double overtimePay1 = (ratePay1 * overTime1)*0.15;
		       System.out.println("---------------------");
		       System.out.println("Employee Name: " + name);
		      
		       double bpay1 = (ratePay1 * overTime1);
		       System.out.println("Basic Payment: " + bpay1);
		       System.out.println("Overtime Pay: " + overTime1);
		       System.out.println("---------------------");
		       //double gross = ()
		       //System.out.println("Gross Pay; " + gross);
		       
		       System.out.println("Do you want another transaction? 1 - Yes, 2 - No");
		       ans = read.nextInt();
		       
		      }else {
		          System.out.println("Error");
		      }
		    }  
		      
		    
			
		}
	}


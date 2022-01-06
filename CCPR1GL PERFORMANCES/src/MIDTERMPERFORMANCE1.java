import java.util.*;
import java.text.DecimalFormat;
public class MIDTERMPERFORMANCE1 {

	static Scanner read = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		int ans = 1;
	
		String empName;
	    String chooseOne;
		
	  do{
		   
		   System.out.println("-*-*-*-* Employee's Payroll -*-*-*-*");
			
			System.out.print("Enter your name: ");
			empName = read.nextLine();
			
			System.out.println("*************************");
			System.out.println("Enter [F] For Full-time");
			System.out.println("Enter [P] For Part-Time");
			chooseOne = read.nextLine();
			
			if(chooseOne.equals("F")) {
				FullTime(empName);
			}else if(chooseOne.equals("P"))	{
				PartTime(empName,ans);
			}else {
				System.out.print("INVALID INPUT!");
			}
   
			ans = Integer.parseInt(read.nextLine());
	   }while(ans == 1);
		
	}
	
	public static void FullTime(String name) {
		
		String Salary;
		System.out.print("Enter Basic Pay: ");
		Salary = read.nextLine();
		
		System.out.println("---------------------------------------");
		
		System.out.println("Employee Name: " + name);
		System.out.println("Basic Pay " + Salary);
		
		System.out.println("----------------------------------------");
		System.out.println("Gross Pay " + Salary);
		
		
		System.out.println("Do you want another transaction? 1 - Yes; 2 - No");
	}
	
	public static void PartTime(String name, int ans) {		
		
		DecimalFormat DF = new DecimalFormat("#.##");
		DF.setGroupingUsed(true);
		DF.setGroupingSize(3);
		System.out.println("---------PART-TIME EMPLOYEE-----------");
	
		System.out.println("Employee Name: " + name);
		
		System.out.print("Enter rate per hour: ");
		double ratePerHour = read.nextDouble();
		                     read.nextLine();
		System.out.print("Enter # of Hours Worked: ");
		double NumofHW = read.nextDouble();
		                 read.nextLine();
	    System.out.print("Enter # of Overtime: ");
		double NumofOW = read.nextDouble();
		                 read.nextLine();
		System.out.println("--------------------------------------");
		
		System.out.println("Employee Name: " + name);
		double BasicPay = ratePerHour * NumofHW;
		double OTpay = (NumofOW * (ratePerHour * 0.15));
		
		System.out.println("Basic Pay: " + DF.format(BasicPay));
		System.out.println("Overtime Pay: " + DF.format(OTpay));
		
		System.out.println("--------------------------------------");
		double GrossPay = BasicPay + OTpay;
		
		System.out.println("Gross Pay: " + GrossPay);
	
		
		System.out.println("Do you want another transaction? 1 - Yes; 2 - No");
		
	}
	
	
		
}

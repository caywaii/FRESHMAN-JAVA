import java.util.*;

public class SYSTEM_STUDENTS {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		int ans = 1;

		int GPA;
		String Name;
		String Address;
		String birthDate;
		String Gender;
		String degree;
		String phoneNum;
		String Weight;
		String Height;
		String schoolYear;
		String studID;

		System.out.print("Enter your name: ");
		Name = read.nextLine();
		System.out.print("Address: ");
		Address = read.nextLine();
		System.out.print("Birthday: ");
		birthDate = read.nextLine();
		System.out.print("Phone number: ");
		phoneNum = read.nextLine();
		System.out.print("Gender: ");
		Gender = read.nextLine();
		System.out.print("Weight: ");
		Weight = read.nextLine();
		System.out.print("Height: ");
		Height = read.nextLine();
		System.out.print("School Year: ");
		schoolYear = read.nextLine();
		System.out.print("GPA: ");
		GPA = read.nextInt();

		System.out.print("1- With or 2- Without Scholarship: ");
		ans = read.nextInt();

		System.out.print("Student ID: ");
		studID = read.nextLine();

		int x = studID.length();

		if (x != 8) {
			System.out.print("Invalid Input!");
		} else {
			System.out.print("Valid Student ID!");
		}

	}

}
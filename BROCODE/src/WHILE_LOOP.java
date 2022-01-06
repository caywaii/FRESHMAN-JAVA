import java.util.*;

public class WHILE_LOOP {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		String name = "";

		do {
			System.out.println("Enter your name: ");
			name = input.nextLine();
		} while (name.isBlank());

		System.out.println("Hello " + name);

	}
}

//do while - always execute a block of code.
// while loop - always check the condition first.
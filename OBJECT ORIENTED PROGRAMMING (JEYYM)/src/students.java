
public class students {
	
	private String name;
	private int age;
	
	students(String x){ //constructor
		name = x;
	}
	
	students(String x, int y){
		name = x;
		age = y;
	}
	
	public void Introduce() {
		System.out.println("Hello, I am " + name);
		System.out.println("My age is " + age);
		System.out.println();
	}
}

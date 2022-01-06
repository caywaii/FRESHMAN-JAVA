
public class SIMPLE_MATH {

	public static void main(String[] args) {

		double x = 3.14;
		double y = -10;
		
		double z = Math.max(x, y); //highest number
		double a = Math.min(x, y); // lowest number
		double b = Math.abs(y); // absolute value
		double c = Math.sqrt(x); // square root
		double d = Math.round(x); // rounding number
		double e = Math.ceil(x); // round up
		double f = Math.floor(x); // round down

		System.out.println(z);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		
	}
}

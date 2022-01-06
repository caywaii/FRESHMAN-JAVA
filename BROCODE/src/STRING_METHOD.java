

public class STRING_METHOD {

	public static void main(String[] args) {
		
		String name = "Bro";
		
		boolean result = name.equalsIgnoreCase("bro");
		int result2 = name.length();
		char result3 = name.charAt(0);
		int result4 = name.indexOf("B");
		boolean result5 = name.isEmpty();
		String result6 = name.toUpperCase();
		String result7 = name.toLowerCase();
		//String result = name.trim();		
		String result8 = name.replace("o", "a");
		
		
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		System.out.println(result6);
		System.out.println(result7);
		System.out.println(result8);
		
	}
}

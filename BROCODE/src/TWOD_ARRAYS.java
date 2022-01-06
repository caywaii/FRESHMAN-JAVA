
public class TWOD_ARRAYS {

	public static void main(String[] args) {
		
		String[][] cars = new String[3][3];
		
		cars[0][0] = "Camaro";
		cars[0][1] = "Silverado";
		cars[0][2] = "Hyundai";
		cars[1][0] = "Mustang";
		cars[1][1] = "Ferrari";
		cars[1][2] = "F-150";
		cars[2][0] = "Lambo";
		cars[2][1] = "Tesla";
		cars[2][2] = "Ranger";
		for(int i = 0; i < cars.length; i++) {
			System.out.println();
			for(int j = 0; j < cars[i].length; j++) {
				System.out.println(cars[i][j] + " ");
			}
		}
		
		
	}
}

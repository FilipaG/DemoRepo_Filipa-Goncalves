
public class Quiz04p3 {

	public static void main(String[] args) {                 // linha 1
			int i = 12;                                      // linha 2
			float f = 17.8F;                                 // linha 3
			boolean b = true;                                 // linha 4
			boolean result = i >= 12 && f < 4.567 || b == true;
			boolean result1 = (i >= 12 && f < 4.567) || b == true;
			boolean result2 = i >= 12 && (f < 4.567 || b == false);
			System.out.println(result);                         // linha 6
			System.out.println(result1);
			System.out.println(result2);
			}                                                   // linha 7

}

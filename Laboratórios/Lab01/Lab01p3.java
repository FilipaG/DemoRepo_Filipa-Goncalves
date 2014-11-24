
public class Lab01p3 {

	public static void main(String[] args) {
        int a = 1026;
        int b = 0;
		int c;
		int d;
		d = (a % 10) * 1000;    // 1026 % 10 = 6      6 * 1000 = 6000 = d
		b += d;                 // b = 6000
		a = a / 10;             // a = 102
		c = 50;                 
		d *= 2;                  // d = 12000
		
		a = a / 10;              // a = 10
		d = a % 10;              // d = 0
		a = a / 10;              // a = 1
		b = b + 4 * c + a;
		System.out.println("b: " + b);
	         
	}

}

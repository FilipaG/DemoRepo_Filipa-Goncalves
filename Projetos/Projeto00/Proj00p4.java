import java.util.Scanner;


public class Proj00p4 {

	public static void main(String[] args) {
		System.out.println ("Fun��o Quadr�tica: ax^2 + bx + c ");
		
		System.out.println ("Digite a: ");
		Scanner in = new Scanner(System.in);      // scan do a
		int a = in.nextInt();
		
		System.out.println ("Digite b: ");
		Scanner in1 = new Scanner(System.in);      // scan do b
		int b = in.nextInt();
		
		System.out.println ("Digite c: ");
		Scanner in2 = new Scanner(System.in);      // scan do c
		int c = in.nextInt();
	    
		// determinar delta = b^2 - 4ac
		int delta = b * b - 4 * a * c;
		double x1, x2;
		
		if (delta == 0)      // determinar raizes da f�rmula resolvente
		{                    // indicar o n�mero de raizes reais
			System.out.println("A equa��o quadr�tica " + a + "x^2 + " + b + "x + " + c + "= 0 , tem uma ra�z.");
			x1 = (-b + Math.sqrt(delta))/(2 * a); 
			System.out.println("Zeros : " + x1);
		}
		else if (delta > 0)
		{
			System.out.println("A equa��o quadr�tica " + a + "x^2 + " + b + "x + " + c + "= 0 , tem duas ra�zes.");
			x1 = (-b + Math.sqrt(delta))/(2 * a);
			x2 = (-b - Math.sqrt(delta))/(2 * a);
			System.out.println("Zeros : " + x1 + " e " + x2);
		}
		else
			System.out.println("A equa��o quadr�tica " + a + "x^2 + " + b + "x + " + c + "= 0 , n�o tem ra�zes reais.");	
	
	}

}

import java.util.Scanner;


public class Proj00p1 {

	public static void main(String[] args) {
		
		
		System.out.println ("Digite um n�mero: ");
		Scanner in = new Scanner(System.in);      // scan do n�mero//
		int number = in.nextInt();
		
		// primeiro m�todo (%)
		if (number % 2 == 0)
		{
			System.out.println (number + " � par");	
		}
		else
			System.out.println (number + " � impar");  
		
			
		// segundo m�todo  (/)
	   /* if (number / 2 == 0)
		{
			System.out.println (number + " � par");	
		}
		else
			System.out.println (number + " � impar");   
		
	    
		// terceiro m�todo  (*)
		    int number1 = number / 2;
		
			if (number == number1 * 2)
			{
				System.out.println (number + " � par");	
			}
			else
				System.out.println (number + " � impar");   */
		
		
	}

}

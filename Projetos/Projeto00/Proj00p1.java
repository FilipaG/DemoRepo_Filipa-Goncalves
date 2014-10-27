import java.util.Scanner;


public class Proj00p1 {

	public static void main(String[] args) {
		
		
		System.out.println ("Digite um número: ");
		Scanner in = new Scanner(System.in);      // scan do número//
		int number = in.nextInt();
		
		// primeiro método (%)
		if (number % 2 == 0)
		{
			System.out.println (number + " é par");	
		}
		else
			System.out.println (number + " é impar");  
		
			
		// segundo método  (/)
	   /* if (number / 2 == 0)
		{
			System.out.println (number + " é par");	
		}
		else
			System.out.println (number + " é impar");   
		
	    
		// terceiro método  (*)
		    int number1 = number / 2;
		
			if (number == number1 * 2)
			{
				System.out.println (number + " é par");	
			}
			else
				System.out.println (number + " é impar");   */
		
		
	}

}

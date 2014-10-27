import java.util.Scanner;


public class Proj00p2 {
/* Verificar se um determinado n�mero introduzido pelo utilizador pertence 
	aos intervalos 0 - 9, a - z e A - Z */
	
	public static void main(String[] args) 
	{
		System.out.println ("Digite um n�mero inteiro : ");
		Scanner in = new Scanner(System.in);      // scan do n�mero
		int originalValue = in.nextInt();
	   	
		char asciiValue = (char) (originalValue);
		
			
		if (asciiValue > 47 && asciiValue < 58 ) // testar se est� entre 0 e 9
		{
			System.out.println ("O n�mero digitado est� no intervalo 0 e 9 : ");
		}
		
		else if (asciiValue > 96 && asciiValue < 123 ) // testar se est� entre a e z
		{
			System.out.println ("O n�mero digitado est� no intervalo a e z : ");
		}
		
		else if (asciiValue > 64 && asciiValue < 91 ) // testar se est� entre A e Z
		{
			System.out.println ("O n�mero digitado est� no intervalo A e Z : ");
		}
		else //em qualquer outro caso...
		    System.out.println ("O n�mero digitado n�o est� nos intervalos 0 - 9, a - z e A - Z ");
		
		System.out.println ("O n�mero digitado corresponde a : " +asciiValue);
	}

}

import java.util.Scanner;


public class Proj00p2 {
/* Verificar se um determinado número introduzido pelo utilizador pertence 
	aos intervalos 0 - 9, a - z e A - Z */
	
	public static void main(String[] args) 
	{
		System.out.println ("Digite um número inteiro : ");
		Scanner in = new Scanner(System.in);      // scan do número
		int originalValue = in.nextInt();
	   	
		char asciiValue = (char) (originalValue);
		
			
		if (asciiValue > 47 && asciiValue < 58 ) // testar se está entre 0 e 9
		{
			System.out.println ("O número digitado está no intervalo 0 e 9 : ");
		}
		
		else if (asciiValue > 96 && asciiValue < 123 ) // testar se está entre a e z
		{
			System.out.println ("O número digitado está no intervalo a e z : ");
		}
		
		else if (asciiValue > 64 && asciiValue < 91 ) // testar se está entre A e Z
		{
			System.out.println ("O número digitado está no intervalo A e Z : ");
		}
		else //em qualquer outro caso...
		    System.out.println ("O número digitado não está nos intervalos 0 - 9, a - z e A - Z ");
		
		System.out.println ("O número digitado corresponde a : " +asciiValue);
	}

}

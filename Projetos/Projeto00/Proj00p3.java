import java.util.Scanner;


public class Proj00p3 {
	/* determinar o inverso de um caracter introduzido pelo utilizador pertencente ao intervalo a - z */
	
	public static void main(String[] args) {
		
		System.out.println ("Digite um caracter entre a e z : ");
		Scanner in = new Scanner(System.in);      // scan do caracter
		String s = in.next();                     // armazenamento do caracter numa string
	   	char caracter = s.charAt(0);              // extração do primeiro caracter da string (index inicia em 0)

	   	char asciiValue = (char) (caracter);
				
		if (asciiValue > 96 && asciiValue < 123 ) // testar se está entre a e z
		{
			char inv = (char) (122 - (asciiValue - 97));
			System.out.println ("O inverso de " + caracter + " é " + inv);
		}
		
		else //em qualquer outro caso...
		    System.out.println ("O caracter digitado não está entre a e z ");
		
	}

}

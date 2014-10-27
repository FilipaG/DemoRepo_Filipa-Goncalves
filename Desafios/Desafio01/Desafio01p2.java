import java.util.Scanner;


public class Desafio01p2 {
	/*recebe um n�mero inteiro positivo do input da consola e que retorna 10 n�meros inteiros pares
	 * consecutivos que sejam inferiores a todos os n�meros pares no intervalo entre 0 e o n�mero 
	 * inserido.
	 */
	public static void main(String[] args) {
		System.out.print ("Insert a positive integer number: ");
		Scanner in = new Scanner(System.in);      // scan do n�mero
		int originalValue = in.nextInt();
	   	int count;
	   	
		while (originalValue <= 0){ //testar se o valor inserido � positivo
			System.out.println("The number is invalid");	
			System.out.print ("Please, insert a positive integer number: ");
			int originalNumber1 = in.nextInt();
			originalValue = originalNumber1;
		}
		for (int i = 0; i <= originalValue; i++)
		{
			count = 0;
			if (i % 2 == 0){  //s� imprime caso para o caso de i ser par
				System.out.print("\nThe ten integer numbers below " + i + " are:" );
				for (int j = 10; j > 0; j--){   //gerar os 10 n�meros pares inferiores a i
					int num = i - 2 * j;      
					System.out.print((count == 0) ? (num) : (", " + num)); // diferencia a primeira impress�o das restantes
					count ++;
				}
			}
		}
	}
}

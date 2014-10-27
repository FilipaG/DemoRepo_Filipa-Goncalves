import java.util.Scanner;


public class Proj06p3 {
/*Dado um array com inteiros, verifica se é possível distribuir os valores do array de modo que, 
 * se o array for percorrido do início para o fim ou do fim para o início apresentará a mesma sequência 
 * de elementos. (Capicua)  
 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Será possível formar uma Capicua?!");
		System.out.print("Qual o tamanho do array? ");
		int arrayDim  = input.nextInt();    // quantidade de elementos que serão inseridos: Dimensão do array
		int numbers[] = new int[arrayDim];
				
				
		System.out.println("Introduza os números aleatoriamente:");
		
		// Receber os números da consola
		for (int idx = 0; idx < arrayDim; idx++) 
		{
            System.out.print("Digite o " + (idx + 1) + "º número: ");
            numbers[idx] = input.nextInt();
        }
		
		// Imprimir o array original		
		System.out.print("Array: [ ");
		for (int i = 0; i < numbers.length; i++)
		   System.out.print((i == numbers.length-1)? (numbers[i] + " ]"):(numbers [i] + ", "));
		System.out.println("");
		
	
		//Verificação da existência de repetições
		int countodd = 0;
		for (int i = 0; i < numbers.length; i++)
		{
			int count = 1;    //count volta a zero em todas iterações
			int countBackward=0;
			for (int j = i+1; j < numbers.length; j++)
			{
				if (numbers[i]==numbers[j])    
				{
					count++;      // se, comparando um determinado elemento do array com todos houver repetição, incrementa o count
				}
			}
			for (int j = 0; j < i; j++) 
			{
				if (numbers[i]==numbers[j])  // contar os que se repetiram anteriormente e que por isso já foram contabilizados  
				{                             
					countBackward++;      
				}
			}
			if ((count%2!=0)&&(countBackward==0))
			{
				countodd++;      //verificar quantos elementos se repetem um número impar de vezes.
			}                  // para ser possivel construir uma capicua, tem de haver no máximo um elemento que se repete um número impar de vezes
		}
		System.out.print((countodd > 1)?("Result: False"):("Result: True"));  
	}
}

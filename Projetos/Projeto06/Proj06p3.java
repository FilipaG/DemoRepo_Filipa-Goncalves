import java.util.Scanner;


public class Proj06p3 {
/*Dado um array com inteiros, verifica se � poss�vel distribuir os valores do array de modo que, 
 * se o array for percorrido do in�cio para o fim ou do fim para o in�cio apresentar� a mesma sequ�ncia 
 * de elementos. (Capicua)  
 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Ser� poss�vel formar uma Capicua?!");
		System.out.print("Qual o tamanho do array? ");
		int arrayDim  = input.nextInt();    // quantidade de elementos que ser�o inseridos: Dimens�o do array
		int numbers[] = new int[arrayDim];
				
				
		System.out.println("Introduza os n�meros aleatoriamente:");
		
		// Receber os n�meros da consola
		for (int idx = 0; idx < arrayDim; idx++) 
		{
            System.out.print("Digite o " + (idx + 1) + "� n�mero: ");
            numbers[idx] = input.nextInt();
        }
		
		// Imprimir o array original		
		System.out.print("Array: [ ");
		for (int i = 0; i < numbers.length; i++)
		   System.out.print((i == numbers.length-1)? (numbers[i] + " ]"):(numbers [i] + ", "));
		System.out.println("");
		
	
		//Verifica��o da exist�ncia de repeti��es
		int countodd = 0;
		for (int i = 0; i < numbers.length; i++)
		{
			int count = 1;    //count volta a zero em todas itera��es
			int countBackward=0;
			for (int j = i+1; j < numbers.length; j++)
			{
				if (numbers[i]==numbers[j])    
				{
					count++;      // se, comparando um determinado elemento do array com todos houver repeti��o, incrementa o count
				}
			}
			for (int j = 0; j < i; j++) 
			{
				if (numbers[i]==numbers[j])  // contar os que se repetiram anteriormente e que por isso j� foram contabilizados  
				{                             
					countBackward++;      
				}
			}
			if ((count%2!=0)&&(countBackward==0))
			{
				countodd++;      //verificar quantos elementos se repetem um n�mero impar de vezes.
			}                  // para ser possivel construir uma capicua, tem de haver no m�ximo um elemento que se repete um n�mero impar de vezes
		}
		System.out.print((countodd > 1)?("Result: False"):("Result: True"));  
	}
}

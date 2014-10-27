import java.util.Scanner;
/**Dado um array com inteiros, esta aplica��o mostra a contagem do n�mero de ocorr�ncias de cada valor 
 * nesse array.
 */
 
public class Proj06p2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("A contagem do n�mero de ocorr�ncias de cada valor nesse array");
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
		
		System.out.print ("Result: [ ");
		//Verifica��o da exist�ncia de repeti��es
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
			System.out.print((countBackward==0)?(count + " "):("")); //imprime apenas a contagem dos que ainda n�o foram contabilizados anteriormente
		}
		System.out.println ("]");
	}
}


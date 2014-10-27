import java.util.Scanner;
/**Dado um array com inteiros,esta aplicação mostra todos os valores que ocorrem uma única vez 
 * nesse array.
 */
 
public class Proj06p1Rep 
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Esta aplicação mostra todos os elementos que ocorrem apenas uma vez no array");
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
		
		System.out.print ("Result: [ ");
		//Verificação da existência de repetições
		for (int i = 0; i < numbers.length; i++)
		{
			int count = 0;    //count volta a zero em todas iterações
			for (int j = 0; j < numbers.length; j++)
			{
				if (numbers[i]==numbers[j])    
				{
					count++;      // se, comparando um determinado elemento do array com todos houver repetição, incrementa o count
				}
			}
			System.out.print((count==1)?(numbers[i] + " "):("")); //verificar
		}
		System.out.println ("]");
	}
}

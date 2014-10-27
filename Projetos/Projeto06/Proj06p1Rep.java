import java.util.Scanner;
/**Dado um array com inteiros,esta aplica��o mostra todos os valores que ocorrem uma �nica vez 
 * nesse array.
 */
 
public class Proj06p1Rep 
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Esta aplica��o mostra todos os elementos que ocorrem apenas uma vez no array");
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
			int count = 0;    //count volta a zero em todas itera��es
			for (int j = 0; j < numbers.length; j++)
			{
				if (numbers[i]==numbers[j])    
				{
					count++;      // se, comparando um determinado elemento do array com todos houver repeti��o, incrementa o count
				}
			}
			System.out.print((count==1)?(numbers[i] + " "):("")); //verificar
		}
		System.out.println ("]");
	}
}

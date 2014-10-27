import java.util.Scanner;


public class Proj07p3 {

	
	private static int[] getNumbers() // Obter os n�meros por Input
	{
		int[] inputNum = new int[50];   // cria��o de um array suficientemente grande ou ent�o pergunta-se ao utilizador quantos n�meros vai inserir
		int idx = 0;
		Scanner in = new Scanner(System.in);
		
		while (true)
		{
			System.out.print("Valor " + (idx + 1) + ": ");
			int input = in.nextInt();
			
			if (input >= 0)
				inputNum[idx] = input;   // se o n�mero em input for >=0 insere no array, caso contr�rio interrompe o ciclo
			else
				break;
			
			idx++;
		}
		
		int[] numList = new int[idx];   // para que n�o haja espa�o vazio no array, transfere-se os n�meros do input para um array de dimens�o idx.
		                                //caso tivesse perguntado ao utilizador quantos valores iria inserir, este passo seria desnecess�rio
		for (int i = 0; i < idx; i++)
			numList[i] = inputNum[i];
		
		return numList;
	}
	
	private static int[] countNumbers(int[] numList) {  // contagem dos digitos de 0 a 9 de cada n�mero inserido
		int[] count = new int[10];   // array em que cada elemento corresponde a um n�mero de 0 a 9
		
		for (int i = 0; i < numList.length; i++)
		{
			int numberInput = numList[i];
			
			do
			{
				int lastDigit = numberInput % 10;  //a divis�o d�-nos o digito das unidades do n�mero em input
				count[lastDigit]++;    //o digito � analisado e � incrementado o valor do elemento do array count correspondente
				numberInput /= 10;
			} while (numberInput > 0);
		}
		return count;
	}

	
private static void printGraph(int[] count) {   // impress�o do gr�fico
		
		int maxCount = count[0]; 
		for (int i : count)         //determina qual o digito que mais se repetiu
			if (i > maxCount)
				maxCount = i;
		
		for (int i = maxCount; i > 0; i--) 
		{
			for (int j = 0; j < 10; j++)
			{
				if (i > count[j])
					System.out.print("  ");
				else
					System.out.print("* ");
				
			}
			System.out.println();
		}
		
		for (int i = 0; i < 10; i++)   // impress�o dos n�meros de 0 a 9
			System.out.print(i + " ");
	}

	
	
	
	public static void main(String[] args) {
System.out.println("Introduza os valores na consola: ");
		
		int[] inputNum = getNumbers(); //array dos n�meros obtidos por input
		int[] count = countNumbers(inputNum); //array com a contagem de cada d�gito
		printGraph(count);
	}
}


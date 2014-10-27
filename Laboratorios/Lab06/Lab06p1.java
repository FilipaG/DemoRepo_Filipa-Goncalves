package sess�o07_10;

public class Lab06p1 {
/* Implementa��o do Insertion Sort*/
	public static void main(String[] args) {
		int[] numbers = {3,1,2,0,7,5,8,9, -1};
				
		for (int i = 1; i < numbers.length; i++)
		{
			int key = numbers[i];   // valor que ser� testado ao longo das itera��es
			int j = i - 1;
			while((j>= 0)&&(key < numbers[j]))  // condi��o para ser feita a troca: o elemento key ser menor que o anterior 
			{
				numbers[j+1] = numbers[j]; //copia-se o valor que est� no elemento do �ndice j para o de �ndice j+1
				j--;   //desincrementa-se para poder comparar os elementos de �ndice inferior com a chave
			}
			numbers[j + 1] = key;
			
			for (int idx = 0; idx < numbers.length; ++idx) // este bloco � opcional e serve para vermos as altera��es ocorridas em cada itera��o
			{
				System.out.print(numbers[idx] + " ");
			}
			System.out.println();
		}
		
		for (int i = 0; i <numbers.length; i++) //impress�o do array j� ordenado 
		{
			System.out.print(numbers[i] + " ");
        }

	}

}

package sessão07_10;

public class Lab06p1 {
/* Implementação do Insertion Sort*/
	public static void main(String[] args) {
		int[] numbers = {3,1,2,0,7,5,8,9, -1};
				
		for (int i = 1; i < numbers.length; i++)
		{
			int key = numbers[i];   // valor que será testado ao longo das iterações
			int j = i - 1;
			while((j>= 0)&&(key < numbers[j]))  // condição para ser feita a troca: o elemento key ser menor que o anterior 
			{
				numbers[j+1] = numbers[j]; //copia-se o valor que está no elemento do índice j para o de índice j+1
				j--;   //desincrementa-se para poder comparar os elementos de índice inferior com a chave
			}
			numbers[j + 1] = key;
			
			for (int idx = 0; idx < numbers.length; ++idx) // este bloco é opcional e serve para vermos as alterações ocorridas em cada iteração
			{
				System.out.print(numbers[idx] + " ");
			}
			System.out.println();
		}
		
		for (int i = 0; i <numbers.length; i++) //impressão do array já ordenado 
		{
			System.out.print(numbers[i] + " ");
        }

	}

}

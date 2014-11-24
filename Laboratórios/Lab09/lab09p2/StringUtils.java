package lab09p2;

import java.util.Scanner;

//exerc�cio lab09 p2
public class StringUtils {
/**
* Counts the number of times that a char occurs in the original
string
* @param original The original sentence
* @param c The char to find in the sentence
* @return The number of times the char c occurs in the sentence
*/
	public int countLetters(String original, char c) { 
		int count =0 ;
		int size = original.length();
		for (int i = 0; i < size; i++)
		{
			if(original.charAt(i)== c )     // verifica a igualdade entre os caracteres da string e o 'c'
				count++;    // se for igual incrementa a contagem
		}	
		return count;
			}
	
	/**
	* Indicates if the original sentence contains another sentence
	* @param original The original sentence
	* @param toFind The sentence to find
	* @return A string with the result
	*/
	public String exists(String original, String toFind) 
	{
		int size = original.length();   // tamanho da String Original
		int toFindSize = toFind.length();   // tamanho da string toFind
		String message = "";
		String auxString = "";
		
		if (size<toFindSize) //verificar se o tamanho da string a encontrar, � menor que o tamanho da string original
		{
			message = toFind + " does not exist in " + original;
		}
		else{
			for (int i=0; i<size-toFindSize+1; i++)  //n�o � necess�rio verificar a string original toda
			{
				if (original.charAt(i) == toFind.charAt(0)) // o
				{
					auxString = original.substring(i, i+toFindSize); //gerar uma substring da string original a partir do carater encontrado, com o tamanho da string toFind 
										
					if (auxString.equals(toFind)) // verificar se a string que obtivemos � igual � string toFind
					{
						message = toFind + " exists in " + original;
						break;
					}
				}
			}
			if (message==""){  //se n�o houver qualquer correspond�ncia escreve a seguinte mensagem
				message = toFind + " does not exist in " + original;	
			}
		}
		return message;		
	}
	
	
	/**
	* Sorts the chars in a the original sentence
	* @param original The original sentence
	* @return The string sorted      
	*/
	public String sort(String original) {   //retorna a sequ�ncia ordenada
		int size = original.length();
		char[] originalArray = new char[size];
		
		for (int i = 0; i < size; i++)
		{
			originalArray[i] = original.charAt(i); //coloca��o dos caracteres da string num array
		}
		
		//m�todo BubbleSort
		for(int i = 0; i < size; i++) // i representa o n�mero de elementos j� ordenados
		{
			for(int j = 1; j < size - i; j++)  // j �ndice do elemento que est� a ser comparado  
			{ //trocas at� size - i porque a cada itera��o, eu tenhos os i elementos maiores j� ordenados
				if(originalArray[j] < originalArray[j - 1])
				{
					char exchangeAux = originalArray [j-1];    //colocar na vari�vel de apoio o valor da vari�vel que est� a ser testada
					originalArray [j-1] = originalArray[j];   //colocar no �ndice da vari�vel que est� a ser testada o valor do �ndice que � mais baixo
					originalArray[j] = exchangeAux;  
				}
			}	
		}
				
		String orderedMessage = "";
		
		for (int i = 0; i < size; i++)
		{
			orderedMessage += (char)originalArray[i];  //coloca��o dos elementos j� ordenados do array numa String
		}
		return orderedMessage;   
	}
	
	
	/**
	* Returns a String that is a substring of the original sentence
	* @param original The original sentence
	* @param start The index that starts the cut
	* @param end The index that ends the cut
	* @return The substring of the original sentence, from start to
	end
	*/
	public String cutFrom(String original, int start, int end) {
	
		return original.substring(start, end);
	}

	
	/*public static void main(String[] args)        ALTERNATIVO
	{
		Scanner input = new Scanner (System.in);
		System.out.println("Insira o texto a analisar");
		String original = input.nextLine();
		System.out.println("Que letra pretende contar");
		char c = input.next().charAt(0);   // da String recolhe apenas o caracter da primeira posi��o
		System.out.println("Qual a palavra que pretende pesquisar");
		input.nextLine();     //Limpar o nextLine
		String toFind = input.nextLine();
		System.out.println("string: start");
		int start  = input.nextInt();  
		System.out.println("string: end");
		int end  = input.nextInt();
		
		StringUtils su = new StringUtils();
		System.out.println(su.countLetters(original,c));
		System.out.println(su.exists(original, toFind));
		System.out.println(su.sort(original));
		System.out.println(su.cutFrom(original, start, end));   */
		

	}

}
	




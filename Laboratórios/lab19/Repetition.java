package lab19;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Repetition {

	/**
	 * This method will receive two collections of integers and returns a new collection whose 
	 * elements are repeated elements in both collections received
	 * @param col1
	 * @param col2
	 * @return collection whose elements are repeated elements in both collections received
	 */
	public static Collection<Integer> returnRepetitions(Collection<Integer> col1, Collection<Integer> col2)
	{
		Collection <Integer> repetitions = new LinkedList<>();
		
//		1� Verificar o tamanho das duas cole��es e qual a mais pequena
//		2� transformar a mais pequena num array
//		3� fazer ciclo para verificar se a outra cole��o contem os elementos do array e caso afirmativo armazena-los numa linkedList.
//		4� retornar a linkedList,
//		5� fazer m�todo Main

		
// verificar qual das cole��es � mais pequena, para optimizar o processo	
		if (col1.size()<=col2.size())  
		{
			Object[] col1Array = col1.toArray();  
// transformar a cole��o num array para que possam ser comparados todos os elementos de col1 com os de col2
			
			for (int idx =0; idx < col1Array.length; idx++)
			{
				if (col2.contains(col1Array[idx]))
					repetitions.add((Integer)(col1Array[idx]));   
				// se a col2 tiver o elemento em an�lise o mesmo � adicionado � LinkedList, mas tem de ser feito um cast para Integer
			}
		}
		else   
		{
			Object[] col2Array = col2.toArray();  
			
			for (int idx =0; idx < col2Array.length; idx++)
			{
				if (col1.contains(col2Array[idx]))
					repetitions.add((Integer)(col2Array[idx]));   
			}
		}		
		return repetitions;
	}
	
	public static void main(String[] args) {
		List<Integer> col1 = new ArrayList<>();
		List<Integer> col2 = new ArrayList<>();
		col1.add(1);
		col1.add(2);
		col1.add(3);
		col1.add(4);
		col1.add(5);
		col1.add(6);
		col1.add(7);   // as duas cole��es t�m em comum os elementos 1, 2, 3, 4
		col1.add(8);
		col1.add(9);
		col2.add(1);
		col2.add(2);
		col2.add(3);
		col2.add(4);
		System.out.println("Repetitions");
		System.out.println(returnRepetitions(col1,col2));   //resultado esperado: [1, 2, 3, 4]

	}

}

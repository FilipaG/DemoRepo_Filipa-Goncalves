package quiz24;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Quiz24p4 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(); 		// Linha 1  -> defini��o e afeta��o de uma List de Integer a um ArrayList
		list.add(1); 									// Linha 2
		list.add(2); 									// Linha 3 -> adiciona os elementos � lista list
		list.add(3); 									// Linha 4
		list.add(2,3); 									// Linha 5 -> (n�o � um dado do tipo Integer, � lida a sua parte decimal)
		Iterator<Integer> elements = list.iterator(); 	// Linha 6 -> O iterador tem de ser do tipo da List, neste caso ambos Integer
		while(elements.hasNext()) 						// Linha 7 -> Enquanto houver elementos em elements
		System.out.println(elements.next()); 			// Linha 8 -> Impress�o de todos os elementos do iterador
		}
}

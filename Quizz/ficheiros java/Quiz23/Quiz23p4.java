package sessão24_10;

import java.util.ArrayList;
import java.util.List;

public class Quiz23p4 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(); 			// Linha 1
		list.add("Gato");								 // Linha 2
		list.add("Rato"); 								// Linha 3
		list.add("Pato"); 								// Linha 4
		System.out.println(list.contains(new String("Gato"))); // Linha 5  -> True  (o ArrayList já tem a string "Gato")
		System.out.println(list.get(1)); 				// Linha 6		-> Rato  (o primeiro indíce é o 0.)
		System.out.println(list.indexOf("Rato")); 		// Linha 7		-> 1     (segundo elemento da lista)
		System.out.println(list.isEmpty()); 			// Linha 8		-> false  
		System.out.println(list.size()); 				// Linha 9		-> 3    (porque tem 3 elementos)
		list.clear(); 									// Linha 10 - limpa todos os elementos da lista
		System.out.println(list.size()); 				// Linha 11		-> 0
		}
}

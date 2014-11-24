package sessão24_10;

import java.util.ArrayList;
import java.util.List;

public class Quiz23p5 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Sapo");
		list.add("Peixe");
		list.add("Lagostim");
		
		System.out.println(list.indexOf("Peixe"));   
// dá-nos o índice da String "Peixe" // dá-nos o índice da String "Peixe", se procurarmos algum 
//elemento que não está na lista, o método retorna -1.
		
		System.out.println(list.contains("Peixe"));  
	// verifica se algum dos elementos da list é a string "Gato"
	}
}

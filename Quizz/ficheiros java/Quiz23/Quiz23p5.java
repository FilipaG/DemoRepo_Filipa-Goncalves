package sess�o24_10;

import java.util.ArrayList;
import java.util.List;

public class Quiz23p5 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Sapo");
		list.add("Peixe");
		list.add("Lagostim");
		
		System.out.println(list.indexOf("Peixe"));   
// d�-nos o �ndice da String "Peixe" // d�-nos o �ndice da String "Peixe", se procurarmos algum 
//elemento que n�o est� na lista, o m�todo retorna -1.
		
		System.out.println(list.contains("Peixe"));  
	// verifica se algum dos elementos da list � a string "Gato"
	}
}

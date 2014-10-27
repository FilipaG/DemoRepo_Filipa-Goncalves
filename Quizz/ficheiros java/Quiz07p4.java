package sessao03_10;

public class Quiz07p4 {

	public static void main(String[] args) {
		for (int i = 6; i < 8; i++) {
			for (int j = 4; j < 6; j++) {   // como j < 6 e inicia com j =4, só vai testar para j=4 e j=5
			    if (j == 5) continue;      // não executa a instrução caso j = 5;
			    System.out.println("i: " + i + " j: " + j);
			}
	    }
	}
}

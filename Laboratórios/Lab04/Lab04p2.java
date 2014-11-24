package sessao03_10;

import java.util.Scanner;

public class Lab04p2 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("introduza um numero: ");
		int number = kb.nextInt(); //variável à qual é atribuído o valor do input feito pelo utilizador
		System.out.println("\nresultado: " + number * 2);  // deixa uma linha em branco (/n) e imprime o dobro do valor colocado em input
	}

}

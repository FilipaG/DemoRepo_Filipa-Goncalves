package sessao03_10;

import java.util.Scanner;

public class Lab04p3 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		while(true)
		{
		System.out.print("Introduza o valor (0 para sair): ");
		int value = kb.nextInt();
		int mult;
		if (value == 0){ //condição de paragem do programa (caso seja inserido o número 0)
			break;
		}
		System.out.println("Múltiplos de " + value + ":");
		System.out.print("[" + 0);     // inicio da sequência de múltiplos, sendo o primeiro elemento, 0, que é múltiplo de todos os números
		for (int i = 1; i < 10; i++)  //sendo os 10 primeiros múltiplos e como inicia em 0, o ciclo for é utilizado até i = 9.
		{
		mult = i * value;     // determinar múltiplos do número inserido
		System.out.print(" " + mult);  // imprimir cada múltiplo (todos na mesma linha)
		}
		System.out.println("]"); //imprime ] para finalizar sequência e muda de linha
		}

	}

}

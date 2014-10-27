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
		if (value == 0){ //condi��o de paragem do programa (caso seja inserido o n�mero 0)
			break;
		}
		System.out.println("M�ltiplos de " + value + ":");
		System.out.print("[" + 0);     // inicio da sequ�ncia de m�ltiplos, sendo o primeiro elemento, 0, que � m�ltiplo de todos os n�meros
		for (int i = 1; i < 10; i++)  //sendo os 10 primeiros m�ltiplos e como inicia em 0, o ciclo for � utilizado at� i = 9.
		{
		mult = i * value;     // determinar m�ltiplos do n�mero inserido
		System.out.print(" " + mult);  // imprimir cada m�ltiplo (todos na mesma linha)
		}
		System.out.println("]"); //imprime ] para finalizar sequ�ncia e muda de linha
		}

	}

}

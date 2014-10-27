import java.util.Random;
import java.util.Scanner;

public class Proj03p4 {

	public static void main(String[] args) {
		Random random = new Random();
		int num = random.nextInt(101);   //limitei o valor aos números de 0 a 100 para que o jogo tivesse uma solução útil
		int count = 0;     // contagem das tentativas necessárias para encontrar a resposta correta
		int test;         // definição da variável que guardará os valores inseridos pelo utilizador 
		do 
		{   //este ciclo será executado enquanto o valor inserido for diferente do valor gerado pelo computador
			System.out.print ("Insira um número de 0 a 100: ");
			Scanner in = new Scanner(System.in);      // scan do número
			test = in.nextInt();
			if ((test < 0)||(test > 100)) {   // verifica se o número inserido satisfaz a condição de estar entre 0 e 100
				System.out.println ("o número que inseriu não está entre 0 a 100: ");	
			}
			if (test < num) {     // verificação se o valor introduzido é maior ou menor que o valor gerado pelo computador
				System.out.println ("O valor é maior que " + test);	
			}
			else if (test > num) {
				System.out.println ("O valor é menor que " + test);	
			}
			count++;  // incremento da contagem das tentativas necessárias para encontrar a resposta correta
		}			
		 while (test != num);
		System.out.print ("Acertou! Número de tentativas: " + count);
		}

}


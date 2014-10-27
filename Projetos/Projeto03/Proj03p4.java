import java.util.Random;
import java.util.Scanner;

public class Proj03p4 {

	public static void main(String[] args) {
		Random random = new Random();
		int num = random.nextInt(101);   //limitei o valor aos n�meros de 0 a 100 para que o jogo tivesse uma solu��o �til
		int count = 0;     // contagem das tentativas necess�rias para encontrar a resposta correta
		int test;         // defini��o da vari�vel que guardar� os valores inseridos pelo utilizador 
		do 
		{   //este ciclo ser� executado enquanto o valor inserido for diferente do valor gerado pelo computador
			System.out.print ("Insira um n�mero de 0 a 100: ");
			Scanner in = new Scanner(System.in);      // scan do n�mero
			test = in.nextInt();
			if ((test < 0)||(test > 100)) {   // verifica se o n�mero inserido satisfaz a condi��o de estar entre 0 e 100
				System.out.println ("o n�mero que inseriu n�o est� entre 0 a 100: ");	
			}
			if (test < num) {     // verifica��o se o valor introduzido � maior ou menor que o valor gerado pelo computador
				System.out.println ("O valor � maior que " + test);	
			}
			else if (test > num) {
				System.out.println ("O valor � menor que " + test);	
			}
			count++;  // incremento da contagem das tentativas necess�rias para encontrar a resposta correta
		}			
		 while (test != num);
		System.out.print ("Acertou! N�mero de tentativas: " + count);
		}

}


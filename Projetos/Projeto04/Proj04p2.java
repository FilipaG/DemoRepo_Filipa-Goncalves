import java.util.Random;
import java.util.Scanner;


public class Proj04p2 {

	public static void main(String[] args) {
		System.out.print ("Aposta no cavalo: ");
		Scanner in = new Scanner(System.in);      // scan do número
		int originalValue = in.nextInt();
	   	
		while ((originalValue <= 0)||(originalValue > 10)){ //testar se o valor inserido é de 1 a 10
			System.out.println("Nenhum cavalo tem esse número! Insira um número de 1 a 10");	
			System.out.print ("Aposta no cavalo: ");
			int originalNumber1 = in.nextInt();
			originalValue = originalNumber1;
		}
		int max = 100;
		int count= 0;
		int num;
		int value;
		int horse = 0;
		do {
			for (int i = 1; i<= 10; i++)  //criação aleatória dos valores referentes aos 10 cavalos
			{
				do
				{
					Random random = new Random();
					value = random.nextInt(101);  //criação de um número aleatório de 0 a 100
				}
				while (value == 0);
				System.out.println("cavalo ("+  i + "): " + value);  // atribuição do valor gerado a um determinado cavalo 
				if (value == max)   // se o número gerado for 100, é guardado o número do cavalo correspondente e adiciona-se o valor do count
				{
					count++;
					horse = i;    
				}
			}
		}
		while (count ==0);	// repete o ciclo enquanto não tiver sido gerado o número 100
		
		System.out.println("Terminou a corrida");
		if (horse == originalValue)   //verificação se o cavalo que ganhou corresponde ao cavalo em que se apostou
		{
			System.out.println("O cavalo " + horse + " venceu, parabéns!");
		}
		else {
			System.out.println("O cavalo " + horse + " venceu, perdeu a aposta.");
		}
	}
}

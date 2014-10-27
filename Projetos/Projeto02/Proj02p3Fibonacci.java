import java.util.Scanner;
//este programa apresenta os primeiros n elementos da sequência de Fibonacci

public class Proj02p3Fibonacci {

	public static void main(String[] args) {
		int f1 = 0;
		int f2 = 1;
		int fn = 1;
		int count = 1;
		Scanner input = new Scanner(System.in);      // scan do número de elementos da sequência de Fibonacci
		System.out.print ("Insira o número de elementos da sequência de Fibonacci que pretende: ");
		int originalNumber = input.nextInt();
		int elem = originalNumber;
		
		while (elem <= 0){ //não se calcula o fatorial de números negativos
			System.out.println("O número que inseriu não é um inteiro positivo");	
			Scanner input1 = new Scanner(System.in);      // scan do novo número
			System.out.print ("Insira um número inteiro positivo: ");
			int originalNumber1 = input1.nextInt();
			elem = originalNumber1;
			}
		
		while (count <= elem ){       // executa-se o ciclo enquanto o número de elementos impressos for menor ou igual que o número inserido pelo utilizador
		System.out.print(fn + " ");
		fn = f1 + f2;             
		f1 = f2;
		f2 = fn;// cada número da sequência é obtido somando os dois termos anteriores, sendo os dois primeiros termos 1 e 1
		count++; 
		}              // 1 , 1 , 2 (1+1), 3 (1 + 2), 5 (2 + 3), ...
	}
}

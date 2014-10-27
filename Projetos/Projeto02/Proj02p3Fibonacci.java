import java.util.Scanner;
//este programa apresenta os primeiros n elementos da sequ�ncia de Fibonacci

public class Proj02p3Fibonacci {

	public static void main(String[] args) {
		int f1 = 0;
		int f2 = 1;
		int fn = 1;
		int count = 1;
		Scanner input = new Scanner(System.in);      // scan do n�mero de elementos da sequ�ncia de Fibonacci
		System.out.print ("Insira o n�mero de elementos da sequ�ncia de Fibonacci que pretende: ");
		int originalNumber = input.nextInt();
		int elem = originalNumber;
		
		while (elem <= 0){ //n�o se calcula o fatorial de n�meros negativos
			System.out.println("O n�mero que inseriu n�o � um inteiro positivo");	
			Scanner input1 = new Scanner(System.in);      // scan do novo n�mero
			System.out.print ("Insira um n�mero inteiro positivo: ");
			int originalNumber1 = input1.nextInt();
			elem = originalNumber1;
			}
		
		while (count <= elem ){       // executa-se o ciclo enquanto o n�mero de elementos impressos for menor ou igual que o n�mero inserido pelo utilizador
		System.out.print(fn + " ");
		fn = f1 + f2;             
		f1 = f2;
		f2 = fn;// cada n�mero da sequ�ncia � obtido somando os dois termos anteriores, sendo os dois primeiros termos 1 e 1
		count++; 
		}              // 1 , 1 , 2 (1+1), 3 (1 + 2), 5 (2 + 3), ...
	}
}

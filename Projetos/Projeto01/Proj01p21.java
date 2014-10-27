import java.util.Scanner;


public class Proj01p21 {

	/* Inseridos dois valores pelo utilizador (m e n), o programa determina o somatório dos dois valores*/
	public static void main(String[] args) {
        System.out.println ("Somatório de n ");
		
		System.out.print ("Insira um número: ");
		Scanner in = new Scanner(System.in);      // scan do número
		int n1 = in.nextInt();
		
		System.out.print ("Insira outro número: ");
		Scanner in1 = new Scanner(System.in);      // scan do b
		int n2 = in.nextInt();
		
		int sum = n1 + n2; // inicia-se a variável somatório  e calcula a soma dos valores inseridos 
		System.out.println ("O somatório de n é: " + sum);
	}
}

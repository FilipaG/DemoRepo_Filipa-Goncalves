import java.util.Scanner;


public class Proj01p21 {

	/* Inseridos dois valores pelo utilizador (m e n), o programa determina o somat�rio dos dois valores*/
	public static void main(String[] args) {
        System.out.println ("Somat�rio de n ");
		
		System.out.print ("Insira um n�mero: ");
		Scanner in = new Scanner(System.in);      // scan do n�mero
		int n1 = in.nextInt();
		
		System.out.print ("Insira outro n�mero: ");
		Scanner in1 = new Scanner(System.in);      // scan do b
		int n2 = in.nextInt();
		
		int sum = n1 + n2; // inicia-se a vari�vel somat�rio  e calcula a soma dos valores inseridos 
		System.out.println ("O somat�rio de n �: " + sum);
	}
}

import java.util.Scanner;

public class Proj01p2 {
/* Inseridos dois valores pelo utilizador (m e n), o programa determina o somatório dos números de m a n (inclusivé)*/
	public static void main(String[] args) {
    	
		System.out.print ("Insira um número: ");
		Scanner in = new Scanner(System.in);      // scan do número m
		int n1 = in.nextInt();
		
		System.out.print ("Insira outro número: ");
		Scanner in1 = new Scanner(System.in);      // scan do número n
		int n2 = in.nextInt();
		
		int sum = 0; // inicia-se a variável somatório a 0  
		
		if (n1 <= n2)       // verificação de qual o valor mais pequeno inserido porque o utilizador pode não inserir o número menor primeiro
		  {
		     for (int i = n1; i <= n2; i++) {   // para i=0 até i = n, 
              sum += i;                  // soma-se o valor armazenado na variável sum com i
	          }
		  }
		else {
			for (int i = n2; i <= n1; i++) {   // para i=0 até i = n, 
	              sum += i;                  // soma-se o valor armazenado na variável sum com i
		    }
		}
		if (n1 <= n2)  
		{
		     System.out.println ("O somatório de " + n1 + " a " + n2 + " é: " + sum);
		}
		else {
			System.out.println ("O somatório de " + n2 + " a " + n1 + " é: " + sum);
		}
	}

}

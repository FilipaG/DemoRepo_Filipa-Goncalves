import java.util.Scanner;

public class Proj01p2 {
/* Inseridos dois valores pelo utilizador (m e n), o programa determina o somat�rio dos n�meros de m a n (inclusiv�)*/
	public static void main(String[] args) {
    	
		System.out.print ("Insira um n�mero: ");
		Scanner in = new Scanner(System.in);      // scan do n�mero m
		int n1 = in.nextInt();
		
		System.out.print ("Insira outro n�mero: ");
		Scanner in1 = new Scanner(System.in);      // scan do n�mero n
		int n2 = in.nextInt();
		
		int sum = 0; // inicia-se a vari�vel somat�rio a 0  
		
		if (n1 <= n2)       // verifica��o de qual o valor mais pequeno inserido porque o utilizador pode n�o inserir o n�mero menor primeiro
		  {
		     for (int i = n1; i <= n2; i++) {   // para i=0 at� i = n, 
              sum += i;                  // soma-se o valor armazenado na vari�vel sum com i
	          }
		  }
		else {
			for (int i = n2; i <= n1; i++) {   // para i=0 at� i = n, 
	              sum += i;                  // soma-se o valor armazenado na vari�vel sum com i
		    }
		}
		if (n1 <= n2)  
		{
		     System.out.println ("O somat�rio de " + n1 + " a " + n2 + " �: " + sum);
		}
		else {
			System.out.println ("O somat�rio de " + n2 + " a " + n1 + " �: " + sum);
		}
	}

}

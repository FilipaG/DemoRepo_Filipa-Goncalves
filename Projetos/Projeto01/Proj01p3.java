import java.util.Scanner;

public class Proj01p3 {
/* este programa determina a soma dos n�meros multiplos de k, entre os valores m e n (inclusiv�)*/
	public static void main(String[] args) {
		System.out.print ("Insira um n�mero: ");
		Scanner in = new Scanner(System.in);      // scan do n�mero m
		int n1 = in.nextInt();
		
		System.out.print ("Insira outro n�mero: ");
		Scanner in1 = new Scanner(System.in);      // scan do n�mero n
		int n2 = in.nextInt();
		
		System.out.print ("Insira o m�ltiplo: ");
		Scanner in2 = new Scanner(System.in);      // scan do n�mero k
		int n3 = in.nextInt();
		
		int sum = 0; // inicia-se a vari�vel somat�rio a 0  
        int min, max;
		
		if (n1 <= n2)    // verifica��o de qual o valor mais pequeno inserido
			{
			min = n1;     // definir minimo e m�ximo do intervalo
		    max = n2;
			}
		else {
			min = n2;
		    max = n1;
		}
		for (int i = min; i <= max; i++) {   // para i=0 at� i = n, 
            if (i % n3 == 0)            //s� executa a soma se o n�mero for m�ltiplo de k
	    	     sum += i; 
		}
		System.out.println ("O somat�rio dos n�meros de " + min + " a " + max + ", m�ltiplos de " + n3 + " �: " + sum);
	}
}

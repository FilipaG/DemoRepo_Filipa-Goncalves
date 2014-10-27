import java.util.Scanner;

public class Proj01p4 {
/* este programa verifica se determinado n�mero � multiplo de todos os valores entre dois valores inseridos pelo utilizador*/
	public static void main(String[] args) 
	{
		System.out.print ("Insira o poss�vel m�ltiplo n�mero: ");
		Scanner in = new Scanner(System.in);      // scan do n�mero m
		int n1 = in.nextInt();
		
		System.out.print ("Insira um n�mero: ");
		Scanner in1 = new Scanner(System.in);      // scan do n�mero n (limite do intervalo)
		int n2 = in.nextInt();
		
		System.out.print ("Insira outro n�mero: ");
		Scanner in2 = new Scanner(System.in);      // scan do n�mero k  (limite do intervalo)
		int n3 = in.nextInt();
		
		int count = 0; // contagem dos n�meros divisores do valor inserido  
		int min, max;
		
		if (n2 <= n3)      // verifica��o de qual o valor mais pequeno inserido
			{
			min = n2;      // definir minimo e m�ximo do intervalo
			max = n3;
			}
		else {
			min = n3;
		    max = n2;
		}
		if (n1 < max) {  // se o valor do poss�vel m�ltiplo for inferior a pelo menos um dos outros valores introduzidos, n�o � multiplo de todos os valores do intervalo.
			System.out.println ("O n�mero " + n1 + "n�o � m�ltiplo de todos os valores de " + min + " a " + max);
		}	
		
		for (int i = min; i <= max; i++) {   // para i=0 at� i = n, 
            if (n1 % i == 0)         //s� executa a soma se o n�mero for m�ltiplo do valor testado
	    	     count ++;
		 }
		if (count == Math.abs(n2 - n3)+1)
		{
		     System.out.println ("O n�mero " + n1 + " � m�ltiplo de todos os valores de " + min + " a " + max);
		}
		else {
			System.out.println ("O n�mero " + n1 + " n�o � m�ltiplo de todos os valores de " + min + " a " + max);
		}
	}
}

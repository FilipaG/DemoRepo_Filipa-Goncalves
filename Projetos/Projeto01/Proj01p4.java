import java.util.Scanner;

public class Proj01p4 {
/* este programa verifica se determinado número é multiplo de todos os valores entre dois valores inseridos pelo utilizador*/
	public static void main(String[] args) 
	{
		System.out.print ("Insira o possível múltiplo número: ");
		Scanner in = new Scanner(System.in);      // scan do número m
		int n1 = in.nextInt();
		
		System.out.print ("Insira um número: ");
		Scanner in1 = new Scanner(System.in);      // scan do número n (limite do intervalo)
		int n2 = in.nextInt();
		
		System.out.print ("Insira outro número: ");
		Scanner in2 = new Scanner(System.in);      // scan do número k  (limite do intervalo)
		int n3 = in.nextInt();
		
		int count = 0; // contagem dos números divisores do valor inserido  
		int min, max;
		
		if (n2 <= n3)      // verificação de qual o valor mais pequeno inserido
			{
			min = n2;      // definir minimo e máximo do intervalo
			max = n3;
			}
		else {
			min = n3;
		    max = n2;
		}
		if (n1 < max) {  // se o valor do possível múltiplo for inferior a pelo menos um dos outros valores introduzidos, não é multiplo de todos os valores do intervalo.
			System.out.println ("O número " + n1 + "não é múltiplo de todos os valores de " + min + " a " + max);
		}	
		
		for (int i = min; i <= max; i++) {   // para i=0 até i = n, 
            if (n1 % i == 0)         //só executa a soma se o número for múltiplo do valor testado
	    	     count ++;
		 }
		if (count == Math.abs(n2 - n3)+1)
		{
		     System.out.println ("O número " + n1 + " é múltiplo de todos os valores de " + min + " a " + max);
		}
		else {
			System.out.println ("O número " + n1 + " não é múltiplo de todos os valores de " + min + " a " + max);
		}
	}
}

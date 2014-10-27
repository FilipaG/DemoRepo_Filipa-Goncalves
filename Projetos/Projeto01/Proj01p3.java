import java.util.Scanner;

public class Proj01p3 {
/* este programa determina a soma dos números multiplos de k, entre os valores m e n (inclusivé)*/
	public static void main(String[] args) {
		System.out.print ("Insira um número: ");
		Scanner in = new Scanner(System.in);      // scan do número m
		int n1 = in.nextInt();
		
		System.out.print ("Insira outro número: ");
		Scanner in1 = new Scanner(System.in);      // scan do número n
		int n2 = in.nextInt();
		
		System.out.print ("Insira o múltiplo: ");
		Scanner in2 = new Scanner(System.in);      // scan do número k
		int n3 = in.nextInt();
		
		int sum = 0; // inicia-se a variável somatório a 0  
        int min, max;
		
		if (n1 <= n2)    // verificação de qual o valor mais pequeno inserido
			{
			min = n1;     // definir minimo e máximo do intervalo
		    max = n2;
			}
		else {
			min = n2;
		    max = n1;
		}
		for (int i = min; i <= max; i++) {   // para i=0 até i = n, 
            if (i % n3 == 0)            //só executa a soma se o número for múltiplo de k
	    	     sum += i; 
		}
		System.out.println ("O somatório dos números de " + min + " a " + max + ", múltiplos de " + n3 + " é: " + sum);
	}
}

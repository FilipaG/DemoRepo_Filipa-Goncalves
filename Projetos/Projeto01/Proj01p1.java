import java.util.Scanner;

public class Proj01p1 {

	public static void main(String[] args) {
        System.out.println ("Somatório de 1 a n ");
		
		System.out.print ("Insira um número: ");
		Scanner in = new Scanner(System.in);      // scan do número
		int n = in.nextInt();     
		int sum = 0;                // inicia-se a variável somatório a 0           
		for (int i = 0; i <= n; i++) {   // para i=0 até i = n, 
              sum += i;                  // soma-se o valor armazenado na variável sum com i
	     }
		System.out.println ("O somatório de 1 a n é: " + sum);
	}
}

import java.util.Scanner;

public class Proj01p1 {

	public static void main(String[] args) {
        System.out.println ("Somat�rio de 1 a n ");
		
		System.out.print ("Insira um n�mero: ");
		Scanner in = new Scanner(System.in);      // scan do n�mero
		int n = in.nextInt();     
		int sum = 0;                // inicia-se a vari�vel somat�rio a 0           
		for (int i = 0; i <= n; i++) {   // para i=0 at� i = n, 
              sum += i;                  // soma-se o valor armazenado na vari�vel sum com i
	     }
		System.out.println ("O somat�rio de 1 a n �: " + sum);
	}
}

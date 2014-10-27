import java.util.Scanner;

public class Proj03p2 {
/* este programa soma os digitos de um número inserido pelo utilizador*/
	public static void main(String[] args) {
		int sum = 0;
		
		System.out.print ("Insira um número: ");
		Scanner in = new Scanner(System.in);      // scan do número
		int number = in.nextInt();       
		int value = number;       // definição de uma variável com o valor do número introduzido pelo utilizador
		while (value > 0)	// testar enquanto o valor da variável for maior que 0
	     {                  // neste ciclo decompõe-se o número nos seus algarismos para depois os ir somando
		   sum += (value % 10);    // soma o valor obtido anteriormente com o resto da divisão do número por 10
		   value /= 10;	    //divide o número por 10, eliminando assim o algarismo das unidades, e recomeça o ciclo.  
	    }
        System.out.print("A soma dos algarismos de " + number + " é: " + sum );
	}

}

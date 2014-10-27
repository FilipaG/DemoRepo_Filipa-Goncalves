import java.util.Scanner;

public class Proj03p2 {
/* este programa soma os digitos de um n�mero inserido pelo utilizador*/
	public static void main(String[] args) {
		int sum = 0;
		
		System.out.print ("Insira um n�mero: ");
		Scanner in = new Scanner(System.in);      // scan do n�mero
		int number = in.nextInt();       
		int value = number;       // defini��o de uma vari�vel com o valor do n�mero introduzido pelo utilizador
		while (value > 0)	// testar enquanto o valor da vari�vel for maior que 0
	     {                  // neste ciclo decomp�e-se o n�mero nos seus algarismos para depois os ir somando
		   sum += (value % 10);    // soma o valor obtido anteriormente com o resto da divis�o do n�mero por 10
		   value /= 10;	    //divide o n�mero por 10, eliminando assim o algarismo das unidades, e recome�a o ciclo.  
	    }
        System.out.print("A soma dos algarismos de " + number + " �: " + sum );
	}

}

import java.util.Scanner;
//Este programa determina o fatorial do n�mero inserido pelo utilizador

public class Proj02p2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);      // scan do n�mero
		System.out.print ("Insira um n�mero inteiro n�o negativo: ");
		int originalNumber = input.nextInt();
		int number = originalNumber; //afeta��o para n�o destruir o valor inserido pelo utilizador
		int fact = 1;   // a vari�vel fact n�o pode iniciar a 0, sen�o o resultado seria 0 (elemento absorvente da multiplica��o)
                        // a vari�vel tem de ser iniciada a 1 (elemento neutro da multiplica��o)
		while (number < 0){ //n�o se calcula o fatorial de n�meros negativos
		System.out.println("O n�mero que inseriu n�o � um inteiro n�o negativo");	
		Scanner input1 = new Scanner(System.in);      // scan do novo n�mero
		System.out.print ("Insira um n�mero inteiro n�o negativo: ");
		int originalNumber1 = input1.nextInt();
		number = originalNumber1;
		}
        switch (number) {
        case 0:        // por conven��o 0! = 1
        	System.out.println(number + "! = 1");
        	break;
        default:
        	for (int i = number; i > 0 ; i--)  // determina o fatorial em todos os outros casos
    		{
    			fact *=  i;	//multiplica, sucessivamente, todos os n�meros, do n�mero introduzido at� 1.
    		}
    		System.out.println(originalNumber + "! = " + fact);
        }
		
	}

}

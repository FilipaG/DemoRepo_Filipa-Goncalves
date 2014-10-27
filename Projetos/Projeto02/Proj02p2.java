import java.util.Scanner;
//Este programa determina o fatorial do número inserido pelo utilizador

public class Proj02p2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);      // scan do número
		System.out.print ("Insira um número inteiro não negativo: ");
		int originalNumber = input.nextInt();
		int number = originalNumber; //afetação para não destruir o valor inserido pelo utilizador
		int fact = 1;   // a variável fact não pode iniciar a 0, senão o resultado seria 0 (elemento absorvente da multiplicação)
                        // a variável tem de ser iniciada a 1 (elemento neutro da multiplicação)
		while (number < 0){ //não se calcula o fatorial de números negativos
		System.out.println("O número que inseriu não é um inteiro não negativo");	
		Scanner input1 = new Scanner(System.in);      // scan do novo número
		System.out.print ("Insira um número inteiro não negativo: ");
		int originalNumber1 = input1.nextInt();
		number = originalNumber1;
		}
        switch (number) {
        case 0:        // por convenção 0! = 1
        	System.out.println(number + "! = 1");
        	break;
        default:
        	for (int i = number; i > 0 ; i--)  // determina o fatorial em todos os outros casos
    		{
    			fact *=  i;	//multiplica, sucessivamente, todos os números, do número introduzido até 1.
    		}
    		System.out.println(originalNumber + "! = " + fact);
        }
		
	}

}

import java.util.Scanner;


public class Proj04p3 {

	public static void main(String[] args) {
		System.out.println ("Username: ");
		System.out.print ("Player 1: ");       
		Scanner in = new Scanner(System.in);      // scan do n�mero
		String player1 = in.next();          // vari�vel que guardar� a identifica��o do player1
		String temp1 = "";   //string que guarda o nome do player vencedor
		String temp2 = "";   //string que guarda o nome do player vencido
		
		System.out.print ("Player 2: ");
		String player2 = in.next();          // vari�vel que guardar� a identifica��o do player2
		
		System.out.println ("The game will start1! ");
		
		int currentValue = 0;
		
		do
		{
			System.out.println ("\n The current value is " + currentValue);
			System.out.print ("The player " + player1 + " will add:");
			int player1Value = in.nextInt();
			currentValue += player1Value;
			if (currentValue < 31)   // se o n�mero gerado for 100, � guardado o n�mero do cavalo correspondente e adiciona-se o valor do count
			{
				temp1 = player1;
				temp2 = player2;
			}
			else 
			{
				break;
			}
			System.out.println ("\n The current value is " + currentValue);
			System.out.print ("The player " + player2 + " will add:");
			int player2Value = in.nextInt();
			currentValue += player2Value;
			if (currentValue < 31)   // se o n�mero gerado for 100, � guardado o n�mero do cavalo correspondente e adiciona-se o valor do count
			{
				temp2 = player1;
				temp1 = player2; 
			}
		}
	    while (currentValue < 31);
		System.out.println ("\nThe player " + temp2 + " reached " + currentValue);
		System.out.println ("The player " + temp1 + " has won. Congratulation !");
	}

}

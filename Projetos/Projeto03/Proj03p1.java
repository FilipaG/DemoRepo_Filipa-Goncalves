import java.util.Scanner;
/*este programa verifica se um n�mero � primo*/

public class Proj03p1 {

	public static void main(String[] args) 
	{    
		int i = 2;
		int result = 0;
		
		System.out.print ("Insira um n�mero: ");
		Scanner in = new Scanner(System.in);      // scan do n�mero
		int number = in.nextInt();
			 
		while (i <= number / 2)   // s� precisamos de testar para divisores at� metade do n�mero pois a divis�o por dois � a menor divis�o inteira que podemos fazer.
			  {
			      if (number % i == 0)    // se o resto da divis�o pelo n�mero � diferente de zero significa qie este � divisor do n�mero inserido.
			      {
			         result = 1;
			      }
			      i++;
			  }
			  if (result == 1)    // se existiu pelo menos um n�mero cuja divis�o desse resto zero, significa que esse n�mero � divisor
			  {                   // logo o n�mero n�o � primo
			      System.out.println("O n�mero " + number + " n�o � primo.");
			  }
			  else
			  {
			      System.out.println("O n�mero " + number + " � primo. ");
			  }
		
		}
	}

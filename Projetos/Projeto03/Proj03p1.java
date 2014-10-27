import java.util.Scanner;
/*este programa verifica se um número é primo*/

public class Proj03p1 {

	public static void main(String[] args) 
	{    
		int i = 2;
		int result = 0;
		
		System.out.print ("Insira um número: ");
		Scanner in = new Scanner(System.in);      // scan do número
		int number = in.nextInt();
			 
		while (i <= number / 2)   // só precisamos de testar para divisores até metade do número pois a divisão por dois é a menor divisão inteira que podemos fazer.
			  {
			      if (number % i == 0)    // se o resto da divisão pelo número é diferente de zero significa qie este é divisor do número inserido.
			      {
			         result = 1;
			      }
			      i++;
			  }
			  if (result == 1)    // se existiu pelo menos um número cuja divisão desse resto zero, significa que esse número é divisor
			  {                   // logo o número não é primo
			      System.out.println("O número " + number + " não é primo.");
			  }
			  else
			  {
			      System.out.println("O número " + number + " é primo. ");
			  }
		
		}
	}

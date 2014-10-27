import java.util.Scanner;


public class Proj04p1 {
/*este programa recebe um valor inteiro positivo "x" e mostra de x em x os caracteres de a - z*/
	public static void main(String[] args) {
			System.out.print ("Digite um número inteiro positivo : ");
			Scanner in = new Scanner(System.in);      // scan do número
			int originalValue = in.nextInt();
			int count = 0;
		   	
			while (originalValue <= 0){ //testar se o valor inserido é inteiro positivo
				System.out.println("O número que inseriu não é um inteiro positivo");	
				System.out.print ("Insira um número inteiro positivo: ");
				int originalNumber1 = in.nextInt();
				originalValue = originalNumber1;
				}
			int i = 1;
			char asciiValue = 96;		
			while (asciiValue <= 122)
			{
				asciiValue = (char) ( 96 + originalValue * i );
				if (asciiValue <= 122)  //só imprime o caracter se este estiver entre 'a' e 'z'
				{
					System.out.print((count == 0) ? ((char)asciiValue) : (" - " + (char)asciiValue));
					count ++;
				}
				i++;
			}
	}
}

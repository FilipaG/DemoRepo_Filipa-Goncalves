import java.util.Scanner;


public class Proj02p4InvNum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);      // scan do número
		System.out.println ("Insira o número que pretende inverter:");
		int originalNumber = in.nextInt();
		int number = originalNumber;
		int invNumber = 0;  // inicialização da variável que guardará o número invertido
		
		while (number != 0) {
			invNumber = invNumber * 10 + (number % 10); // multiplicação sucessiva do resto da divisão do número por 10
			number /= 10;    // obtenção de um novo número obtido a partir do number mas sem o algarismo das unidades
		} 
        System.out.println(invNumber);
	}
}

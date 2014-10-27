import java.util.Scanner;


public class Proj02p4InvNum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);      // scan do n�mero
		System.out.println ("Insira o n�mero que pretende inverter:");
		int originalNumber = in.nextInt();
		int number = originalNumber;
		int invNumber = 0;  // inicializa��o da vari�vel que guardar� o n�mero invertido
		
		while (number != 0) {
			invNumber = invNumber * 10 + (number % 10); // multiplica��o sucessiva do resto da divis�o do n�mero por 10
			number /= 10;    // obten��o de um novo n�mero obtido a partir do number mas sem o algarismo das unidades
		} 
        System.out.println(invNumber);
	}
}

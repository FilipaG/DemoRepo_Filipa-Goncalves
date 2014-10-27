
public class Quiz05p3 {

	public static void main(String[] args) {
		int numero = 3;
		switch (numero) {
		 case 1:
		 case 2:
			System.out.print("um ");
			break;
		 case 3:                         // como o número é 3 passa logo para o case 3
			System.out.print("dois ");   // o programa continua a correr até aparecer o break
		 case 4:
			System.out.print("três ");
			break;
			default:
			System.out.print("quatro ");
			}
			}

	}


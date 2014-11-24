package sessao03_10;

public class Quiz06p3 {

	public static void main(String[] args) {
		int i=2;
		do
			while (i <= 8) {
				i *= 30 % 4;      // 30 % 4 = 2, logo estamos a multiplicar o valor de i por 2
			}                     // este ciclo ocorre até i = 8, devolvendo o valor após a instrução de i = 16
        while (i > 16);           // como a condição não é verificada, o programa imprime o último valor em memória (16) e obtido no ciclo While
		System.out.println(i);
	}

}

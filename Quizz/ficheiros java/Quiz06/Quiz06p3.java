package sessao03_10;

public class Quiz06p3 {

	public static void main(String[] args) {
		int i=2;
		do
			while (i <= 8) {
				i *= 30 % 4;      // 30 % 4 = 2, logo estamos a multiplicar o valor de i por 2
			}                     // este ciclo ocorre at� i = 8, devolvendo o valor ap�s a instru��o de i = 16
        while (i > 16);           // como a condi��o n�o � verificada, o programa imprime o �ltimo valor em mem�ria (16) e obtido no ciclo While
		System.out.println(i);
	}

}

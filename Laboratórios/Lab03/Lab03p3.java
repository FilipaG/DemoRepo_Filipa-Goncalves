package sessao03_10;

public class Lab03p3 {

	public static void main(String[] args) {
		int max = 37;
		int countEven = 0;
		int countOdd = 0;
		for(int i = max; i > 0 ; i--){  //i > 0 ; i-- (como i inicia com o valor 37, tem de ir diminuindo até chegar a zero)
	       if (i % 2 == 0) {     // se o resto da divisão por 2 é zero, então o valor é par
	    	   countEven += 1;    // incremento no countEven (conta os pares)
	       }
	       else {
	    	   countOdd += 1;      // incremento no countOdd (conta os impares)
	       }
	    }
		System.out.println("Number of Even: " + countEven);  // impressão do nº de valores pares
		System.out.println("Number of Odd: " + countOdd);    // impressão do nº de valores impares
	}
}

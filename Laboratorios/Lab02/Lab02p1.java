
public class Lab02p1 {

	public static void main(String[] args) {
		int a = 3;
		int b = 2;
		int c = a + b;    //c = 5
		if (a > b) {       // se 3 > 2   Verdadeiro
		  a--;               // a = 2
		  if (a < 0)        // se 2 < 0  Falso
		  b++;
		  else
		  a++;               // a = 3
		}
		else if (c < a) {     // não é testada porque a primeira condição do if era verdadeira
		  c++;
		}
		else {                // não é testada porque a primeira condição do if era verdadeira
		  a--;
		}
		System.out.println ("a: " + a);
		System.out.println ("b: " + b);
		System.out.println ("c: " + c);

	}

}


public class Lab01p1 {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		a = 1;
		b = a + 1;    // b=2
		c = b * 2;    //c=4
		b = a;        //b=1
		a = c % 2;    //a=4%2=0 (resto da divisão de 4 por 2)
		c = b;        // c=1
		System.out.println ("a: " + a); //(a=0) é atribuido a cada variável o último valor encontrado
		System.out.println ("b: " + b);  //(b=1)
		System.out.println ("c: " + c);  //(c=1)

	}

}

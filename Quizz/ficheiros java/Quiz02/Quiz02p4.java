
public class Quiz02p4 {

	public static void main(String[] args) {
		int i = 1;
		long j = 2;
		short k = 3;
		System.out.println(++i + j++ * k); //++i incrementa antes da opera��o, usamos i=2
		System.out.println(++i + j++ * k);  //j++ incrementa depois da opera��o, ou seja,
		                                    // se voltassemos a usar o j ele j� teria o valor 3
		}

}

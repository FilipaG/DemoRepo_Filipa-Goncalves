package sessao03_10;

public class Lab03p1 {

	public static void main(String[] args) {   // Fibonacci
		int f1 = 0;
		int f2 = 1;
		int fn = 1;
		
		while (fn <= 55 ){       // executa-se o ciclo enquanto fn for menor ou igual a 55
		System.out.print(fn + ", ");
		fn = f1 + f2;             
		f1 = f2;
		f2 = fn;       // cada número da sequência é obtido somando os dois termos anteriores, sendo os dois primeiros termos 1 e 1
		}              // 1 , 1 , 2 (1+1), 3 (1 + 2), 5 (2 + 3), ...

	}

}

package sessao03_10;

public class Quiz07p3 {
	public static void main(String[] args) {
		int i = 0;
		for (; i < 10; i=i+2) {
			if (i < 6) continue;   // o comando continue faz com que o ciclo seja novamente executado e n�o � executada a impress�o do i.
			System.out.print(i + " ");  // para valores < 6 esta instru��o n�o � executada por causa do continue
			}
		System.out.print(i);  // imprime os valores 6 8 10  porque a cada execu��o ao i � somado 2.
	}
}


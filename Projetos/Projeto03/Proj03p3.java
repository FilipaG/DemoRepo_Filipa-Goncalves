import java.util.Scanner;

public class Proj03p3 {

	public static void main(String[] args) {
		System.out.print ("Insira um n�mero: ");
		Scanner in = new Scanner(System.in);      // scan do n�mero
		int originalNum = in.nextInt();
		int num = originalNum;       // atribui o valor inserido pelo utilizador � variavel num que ser� manipulada ao longo do programa
		
		for (int i = 1; i <= originalNum; i++) {   //define o n�mero de linhas que ser�o escritas
			num--;  // define o n�mero de vezes que o algarismo 0 vai ser introduzido
			int printNum = 0;
            for (int j = 1; j <= originalNum; j++)   //define o n�mero de colunas que ser�o escritas
            {
            	if (j == num + 1) {    
            		printNum = originalNum - num;	// n�mero impresso ap�s os zeros
            	}
            	System.out.print( printNum + " ");  //impress�o dos digitos por linha
            }
            System.out.println(" ");		 //mudan�a de linha
        }
	}

}

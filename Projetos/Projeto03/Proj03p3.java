import java.util.Scanner;

public class Proj03p3 {

	public static void main(String[] args) {
		System.out.print ("Insira um número: ");
		Scanner in = new Scanner(System.in);      // scan do número
		int originalNum = in.nextInt();
		int num = originalNum;       // atribui o valor inserido pelo utilizador à variavel num que será manipulada ao longo do programa
		
		for (int i = 1; i <= originalNum; i++) {   //define o número de linhas que serão escritas
			num--;  // define o número de vezes que o algarismo 0 vai ser introduzido
			int printNum = 0;
            for (int j = 1; j <= originalNum; j++)   //define o número de colunas que serão escritas
            {
            	if (j == num + 1) {    
            		printNum = originalNum - num;	// número impresso após os zeros
            	}
            	System.out.print( printNum + " ");  //impressão dos digitos por linha
            }
            System.out.println(" ");		 //mudança de linha
        }
	}

}

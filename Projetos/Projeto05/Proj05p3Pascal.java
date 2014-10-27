import java.util.Random;
import java.util.Scanner;


public class Proj05p3Pascal {
/* Esta aplicação apresenta os elementos das n linhas do triângulo de Pascal, sendo o número de 
 * linhas apresentadas indicado pelo utilizador. 
 */
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("Triangle´s height: ");
		int rowNum  = kb.nextInt();    // quantidade de linhas do Triângulo de Pascal
		int pascal [][]= new int [rowNum][rowNum];
		
		pascal[0][0] = 1;
		for(int row = 1; row<rowNum; row++)  //linhas do triângulo de Pascal
		{
			for(int idx = 0; idx<=row; idx++)  // determinar elementos de cada linha do triângulo de Pascal
			{
				pascal [row][idx] = (idx==0)?(pascal [row][idx] = 1):(pascal [row-1][idx-1] + pascal [row-1][idx]);
			}
		}
		
		for(int row = 0; row<rowNum; row++)  //imprimir triângulo
		{
			for(int idx = 0; idx<=row; idx++)  
			{
				System.out.print(pascal[row][idx] + " "); 
			}
			System.out.println("");
		}
	}
}

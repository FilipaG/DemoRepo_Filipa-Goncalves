
public class Proj07p1 
{

	public static void main(String[] args) 
	{
		int x = 4;    //n�mero de colunas
		int y = 5;   // n�mero de linhas
	    String [][]points = getPoints(x, y);  // cria��o de um array bidimensional
		printPoints(points);
	}
	
	public static String[][] getPoints(int x, int y) // colocar s�mbolos nos �ndices indicados
	{
		String[][] pointsArray = new String[y][x];
		for (int i = 0; i < y; i++) // linhas
		{
			for (int j = 0; j < x; j++) // colunas
			{	
				pointsArray[i][j]= ((i == 0 || i == y - 1 || j == 0 || j == x - 1)?("*"):(" ")); 
			}
		}
		return pointsArray;
	}
		
	public static void printPoints(String[][] points) 
	{
		int y = points.length;   
		int x = points[0].length;
		for (int i = 0; i <y; i++)
		{
			for(int j = 0; j <x; j++)
			{
				System.out.print(points[i][j]);
			}
			System.out.println();
		}
	}
}

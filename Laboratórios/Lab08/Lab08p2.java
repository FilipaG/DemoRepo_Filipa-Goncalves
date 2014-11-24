package sessão09_10;

public class Lab08p2 {
	public static void main(String[] args) 
	{
		int array[] = { 84, 69, 76, 34, 86, 94, 91 };
		sortArray(array);
		printArray(array);
	}
		
	public static void printArray(int[] array) 
	{
		System.out.print("[ ");
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
		System.out.print("]");
	}
		
	public static void sortArray(int[] num) 
	{
		int n = num.length;
		for (int i = 0; i < n; i++) 
		{
			for (int j = 1; j < (n - i); j++) 
			{
				if (num[j - 1] > num[j]) //comparação entre elementos sucessivos do array
				{                   // se o elemento j-1 for superior ao elemento j => trocar
					swap(num, j);
				}
			}
		}
	}
		
	public static void swap(int[] num, int idx)  // troca dos elementos do array colocando-os por ordem decrescente
	{
		int temp = 0;
		temp = num[idx - 1];
		num[idx - 1] = num[idx];
		num[idx] = temp;
	}
}

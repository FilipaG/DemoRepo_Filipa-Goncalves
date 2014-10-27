
public class Proj07p2 {

	public static void main(String[] args) {
		int[] num = new int[] {2,2};             // 22 em base 10
		int base = 10;
		int convBase = 3;
		int[] result = convertTo(num, base, convBase);
		// result = [2,1,1] = 211 base 3
	}

	private static int[] convertTo(int[] num, int base, int convBase) 
	{
		int count=0;
		int numConvBase = 0;
		int decimalNum = 0;                //convers�o da base inicial para n�mero decimal
		for (int i=0; i< num.length; i++)
		{
			decimalNum = (int) (decimalNum + num[i] * Math.pow(base, i));
		}
		while (decimalNum != 0)   // convers�o do valor decimal para a nova base de convers�o
		{
			numConvBase= numConvBase * 10 + (decimalNum%convBase);   // apresenta��o do n�mero na nova base 
			decimalNum/=convBase;                                   // o n�mero aparece invertido
			count ++;                       
		}
		int[] result = new int[count];
		for (int i=0; i < count; i++) // coloca��o do n�mero num array para posteriormente ser imprimido
		{                                // invers�o do n�mero obtido anteriormente
			result[i] = numConvBase % 10;
			numConvBase =  numConvBase /10;
		}	
			
		System.out.print("result = [");     //impress�o do array resultado
		for (int i=0; i< count; i++)
		{
			System.out.print((i==count-1)?(result[i] + " ]"):(result[i] + ", "));
		}
		System.out.print(" em base " + convBase); 
		return null;
	}

}

package sessao03_10;

public class Lab03p4 {

	public static void main(String[] args) {
		int value = 12342153;
		String result = ""; // string que vai conter o n�mero final j� com os pontos
		String point = ".";
		int count = 0;
		int res;     // vari�vel que contem o resultado das divis�es sucessivas do value por 1000
		
		while(value > 0) 
		{
		     res = value % 1000;    //resto da divis�o do value por 1000
		     value = value / 1000;    ////divis�o do value por 1000
		     result = (count == 0) ? (res + ""  ): (res + "." ) + result; //na primeira itera��o (count = 0) armazena apenas o res, nas restantes armazena o res seguido de um ponto (.)
		   	 count++;     // incremento no count   	 
		   	}
		System.out.println(result);

	}

}

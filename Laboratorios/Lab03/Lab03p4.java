package sessao03_10;

public class Lab03p4 {

	public static void main(String[] args) {
		int value = 12342153;
		String result = ""; // string que vai conter o número final já com os pontos
		String point = ".";
		int count = 0;
		int res;     // variável que contem o resultado das divisões sucessivas do value por 1000
		
		while(value > 0) 
		{
		     res = value % 1000;    //resto da divisão do value por 1000
		     value = value / 1000;    ////divisão do value por 1000
		     result = (count == 0) ? (res + ""  ): (res + "." ) + result; //na primeira iteração (count = 0) armazena apenas o res, nas restantes armazena o res seguido de um ponto (.)
		   	 count++;     // incremento no count   	 
		   	}
		System.out.println(result);

	}

}

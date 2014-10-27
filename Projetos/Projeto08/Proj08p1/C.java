package Proj08p1;

public class C {
	public int target;

	public void verify(B b) {   //construtor
		this.target = b.getValue();	
	}

	/**
	 * @return highest digit of the number 
	 */
	public int getHighestDigit() {
		int number = this.target;
		int highest = number % 10;    //resto da divisão por 10 para comparar dígito a dígito
		
		do{
			number /= 10;
			int res = number % 10;
			if (res > highest)
				highest = res;
			
		} while (number >0);
		return highest;
	}

	/**
	 * verify if the number is pair or not
	 * @return  true if it's a pair number or false if it's a odd number
	 */
	public boolean isPair() {
		return (target%2==0)?(true):(false);
	}

}

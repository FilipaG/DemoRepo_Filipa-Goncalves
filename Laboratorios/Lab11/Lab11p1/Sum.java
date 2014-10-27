package Lab11p1;

public class Sum {
	private int _total;
	
	public Sum(int initialValue){  //Construtor
	_total = initialValue;   //inicializa a variável total com o valor do primeiro número
	}
	/**
	* Adds an integer to this object's sum
	* @param number
	*/
	public void add(int number) {
	_total += number;           //adiciona o valor do segundo número inserido
	}
	/**
	* Returns the sum of all the integers added so far
	*/
	public int getTotal() {
	return _total;
	}
}

package Quiz21;

public class AppEmployee {
	public static void main(String[] args) {
		Employee emp = new Manager();
		Manager man = new Manager();     //o instanceof verifica se um objeto(j� instanciado) pertence a uma classe
		boolean a = (emp instanceof Manager);
		boolean b = (man instanceof Object);
		boolean c = (emp instanceof man);      //emp n�o � uma classe mas im um objecto
		boolean d = (man instanceof emp);     //emp n�o � uma classe mas im um objecto
		boolean e = (Manager instanceof Employee); //Manager n�o � um objeto mas sim uma classe derivada 
		emp.calcBonus(); // Linha 2
		}
	
}

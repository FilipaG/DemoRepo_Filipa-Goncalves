package lab13;

public class AppAnimal {

	public static void main(String[] args) {
	//	Animal cat = new Animal("Cat", "Fusca", true);   //cria��o de um objeto do tipo Animal, associado � vari�vel cat, cujo type � Cat, nome � Fusca e � um Pet
	//	Animal bear = new Animal("Bear", "Teddy", false);  //cria��o de um objeto do tipo Animal, associado � vari�vel bear, cujo Type � Bear, nome � Teddy e n�o � um Pet
		
		Animal cat = new HouseAnimal("Cat", "Fusca", true);  
		Animal bear = new WildlifeAnimal("Bear", "Teddy", false);  
/*
 * 	Para n�o alterar os par�metros fornecidos na Main, temos de associar o par�metro isPet a uma das classes derivadas. Apesar do urso
 *  n�o ser na realidade um HouseAnimal, mas sim um WildlifeAnimal, uma vez que n�o temos o DangerousLevel do urso, temos de associar 
 *  a vari�vel �bear� a um objeto do tipo HouseAnimal e alterar apenas esta classe derivada ou ent�o criamos outro construtor na Classe
 *   WildlifeAnimal que aceite objetos com estes par�metros. 	
 */
				
		WildlifeAnimal lion = new WildlifeAnimal("Lion", "Simba", 4); //cria��o de um objeto do tipo WildlifeAnimal, associado � vari�vel lion, cujo Type � Lion, nome � Simba e dangerLevel 4
		Tiger tiger = new Tiger("Raja");    //cria��o de um objeto do tipo Tiger, associado � vari�vel tiger, cujo nome � Raja
		Chinchilla chin = new Chinchilla("Spooky");    //cria��o de um objeto do tipo Chinchilla, associado � vari�vel chin, cujo nome � Spooky
			
		System.out.println(cat.print());   //cat � um objeto da classe Animal, logo � o m�todo print da classe Animal que ser� utilizado
		System.out.println(bear.print());   //bear � um objeto da classe Animal, logo � o m�todo print da classe Animal que ser� utilizado
		System.out.println(lion.print());    //lion � um objeto da classe WildlifeAnimal, logo � o m�todo print da classe derivada WildlifeAnimal que ser� utilizado
		System.out.println(tiger.print());   //tiger � um objeto da classe Tiger que � derivada da classe WildlifeAnimal, logo � o m�todo print da classe derivada WildlifeAnimal que ser� utilizado uma vez que fez Override do m�todo da super classe Animal
		System.out.println(chin.print());    //chin � um objeto da classe Chinchilla que � derivada da classe HouseAnimal, logo � o m�todo print da classe derivada HouseAnimal que ser� utilizado  uma vez que fez Override do m�todo da super classe Animal
	
		EndangeredAnimal panda = new EndangeredAnimal("Panda", "Su Lin", 268);
		System.out.println(panda.print());
		SnowLeopard snowLeopard = new SnowLeopard("Snow Leopard", "snowball", 6000);
		System.out.println(snowLeopard.print());
		
	}
}

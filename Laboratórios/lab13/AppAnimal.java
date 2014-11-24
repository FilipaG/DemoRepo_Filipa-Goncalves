package lab13;

public class AppAnimal {

	public static void main(String[] args) {
	//	Animal cat = new Animal("Cat", "Fusca", true);   //criação de um objeto do tipo Animal, associado à variável cat, cujo type é Cat, nome é Fusca e é um Pet
	//	Animal bear = new Animal("Bear", "Teddy", false);  //criação de um objeto do tipo Animal, associado à variável bear, cujo Type é Bear, nome é Teddy e não é um Pet
		
		Animal cat = new HouseAnimal("Cat", "Fusca", true);  
		Animal bear = new WildlifeAnimal("Bear", "Teddy", false);  
/*
 * 	Para não alterar os parâmetros fornecidos na Main, temos de associar o parâmetro isPet a uma das classes derivadas. Apesar do urso
 *  não ser na realidade um HouseAnimal, mas sim um WildlifeAnimal, uma vez que não temos o DangerousLevel do urso, temos de associar 
 *  a variável “bear” a um objeto do tipo HouseAnimal e alterar apenas esta classe derivada ou então criamos outro construtor na Classe
 *   WildlifeAnimal que aceite objetos com estes parâmetros. 	
 */
				
		WildlifeAnimal lion = new WildlifeAnimal("Lion", "Simba", 4); //criação de um objeto do tipo WildlifeAnimal, associado à variável lion, cujo Type é Lion, nome é Simba e dangerLevel 4
		Tiger tiger = new Tiger("Raja");    //criação de um objeto do tipo Tiger, associado à variável tiger, cujo nome é Raja
		Chinchilla chin = new Chinchilla("Spooky");    //criação de um objeto do tipo Chinchilla, associado à variável chin, cujo nome é Spooky
			
		System.out.println(cat.print());   //cat é um objeto da classe Animal, logo é o método print da classe Animal que será utilizado
		System.out.println(bear.print());   //bear é um objeto da classe Animal, logo é o método print da classe Animal que será utilizado
		System.out.println(lion.print());    //lion é um objeto da classe WildlifeAnimal, logo é o método print da classe derivada WildlifeAnimal que será utilizado
		System.out.println(tiger.print());   //tiger é um objeto da classe Tiger que é derivada da classe WildlifeAnimal, logo é o método print da classe derivada WildlifeAnimal que será utilizado uma vez que fez Override do método da super classe Animal
		System.out.println(chin.print());    //chin é um objeto da classe Chinchilla que é derivada da classe HouseAnimal, logo é o método print da classe derivada HouseAnimal que será utilizado  uma vez que fez Override do método da super classe Animal
	
		EndangeredAnimal panda = new EndangeredAnimal("Panda", "Su Lin", 268);
		System.out.println(panda.print());
		SnowLeopard snowLeopard = new SnowLeopard("Snow Leopard", "snowball", 6000);
		System.out.println(snowLeopard.print());
		
	}
}

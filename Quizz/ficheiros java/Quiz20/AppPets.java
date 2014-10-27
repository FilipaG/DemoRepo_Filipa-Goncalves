package Quiz20;

public class AppPets {
	public static void main(String[] args) {
		Pet pet = new Pet();
		Dog dog = new Dog(); /*INSIRA CODIGO AQUI*/
		pet.show();
		dog.show();
	  
		      if( dog instanceof Pet )  
		      System.out.println( "dog" );  
		  
		      else if( pet instanceof Dog )  
		      System.out.println( "Tree" );  
		 	  
		      else System.out.println( "Oops" );  
		   }  
	 
	
	
}

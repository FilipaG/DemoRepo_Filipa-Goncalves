package lab09p1;


//exercício lab09 p1
public class Applab09 {
		public static void main(String [] args){
		Shirt s = new Shirt("blue", "M");   //um novo objeto, s, shirt com as caracteristicas "blue", "M"
		Shirt s1 = new Shirt("yellow", "L");  //um novo objeto, s1, shirt com as caracteristicas "yellow", "L"
		s1.setSize("XL");   // modificar tamanho do objeto referenciado por s1 para XL
		s1 = s;    // o apontador s1 é agora referência para o mesmo objecto que s, ou seja, "blue", "M"
		s.setColor("red");   // modificar a cor do objeto referenciado por s e s1 para red
		s1.setSize("S");    // modificar o tamanho do objeto referenciado por s1 e s para s
		System.out.println(s.print());   // imprime red S
		System.out.println(s1.print());   // imprime red S   porque s e s1 apontam para o mesmo objeto
		}
	}

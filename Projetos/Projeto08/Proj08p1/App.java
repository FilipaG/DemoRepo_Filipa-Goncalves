package Proj08p1;

public class App {

	public static void main(String[] args) {
		A a = new A();
		a.value = 24;
		
		B b = new B(a.value);
		System.out.println(b.getValue());
		
		C c = new C();
		c.verify(b);
		System.out.println(c.target);
		System.out.println(c.isPair());
		System.out.println(c.getHighestDigit());
		
		A a2 = new A(a);
		A a3 = new A(9);
		System.out.println(a2.equals(a));  
		System.out.println(a3.equals(a));
		System.out.println(a3.value);
		}
	}

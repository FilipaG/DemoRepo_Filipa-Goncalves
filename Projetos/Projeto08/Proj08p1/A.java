package Proj08p1;

public class A {
	public int value;
	
	public A() {   //construtor
		this.value = 0;
	}
 
	public A(int val1) {   // construtor
		this.value=val1;
	}

	public A(A a) {   // construtor
		this.value= getValue(a);
	}

	public int getValue(A a) {
		return a.value;
	}

	/**
	 * Verify if the numbers have the same value
	 * @param a
	 * @return
	 */
	public boolean equals(A a){
		return (this.value == a.value)?(true):(false);		
	}	
}

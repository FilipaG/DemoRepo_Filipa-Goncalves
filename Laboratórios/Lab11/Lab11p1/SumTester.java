package Lab11p1;

import static org.junit.Assert.*;
import org.junit.Test;

public class SumTester {
	@Test
	/**
	* Verifies positive numbers additions.
	*/
	public void testPositiveNumbers() {
	Sum s = new Sum(0);
	s.add(103);
	s.add(201);
	s.add(123);
	assertEquals(427, s.getTotal());
	}
	@Test
	/**
	* Verifies negative numbers additions
	*/
	public void testNegativeNumbers() {
	Sum s = new Sum(0);
	s.add(-10);
	s.add(-20);                           //substitui: s.add((int)Math.pow(-10,2));
	s.add(-(int)Math.pow(-10,2));        // pow(-10 , 2)=100 =>-30 + 100 = 70 != -130
	assertEquals(-130, s.getTotal());    
	}
	@Test
	/**
	* Verifies if the total is zero
	*/
	public void testZeros() {
	Sum s = new Sum(0);
	s.add(40/2);
	s.add(-20);
	assertEquals(0, s.getTotal());
	}
}

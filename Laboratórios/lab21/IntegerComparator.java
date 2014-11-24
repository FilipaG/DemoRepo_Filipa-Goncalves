package lab21;

import java.util.Comparator;

public class IntegerComparator implements Comparator<Integer>{
	
	/**
	 * Compares its two arguments for order. Returns a negative integer, zero, or a positive integer 
	 * as the first argument is less than, equal to, or greater than the second.
	 * @return one of -1, 0, or 1 according to whether the value of expression is negative, zero or
	 * positive.
	 */
	@Override
	public int compare(Integer i1, Integer i2) {
	return (i1 < i2) ? -1 : (i1==i2) ? 0 : 1;
	}
	
}

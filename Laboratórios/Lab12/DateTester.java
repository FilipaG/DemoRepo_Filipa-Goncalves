package Lab12;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class DateTester {
	Date d;
	@Before
	public void CreateDate()
	{
		d = new Date (20,10,2014);		
	}
	
	/**
	 * Unit test for an illegal argument in the parameter " year "
	 */
	@Test(expected = IllegalArgumentException.class)   //indica ao compilador a excepção esperada
    public void Dates_withNegativeYear_producesException()
    {
		new Date (10,5,-250);     // ano incorreto
		
    }
	
	/**
	 * Unit test for an illegal argument in the parameter " month "
	 */
	@Test(expected = IllegalArgumentException.class)   //indica ao compilador a excepção esperada
    public void Dates_withMonthOutOfBounds_producesException()
    {
		new Date (10,15,2014);    //mês incorreto
		
    }
	
	/**
	 * Unit test for an illegal argument in the parameter " day "
	 */
	@Test(expected = IllegalArgumentException.class)   //indica ao compilador a excepção esperada
    public void Dates_withDayOutOfBounds_producesException()
    {
		new Date (35,5,2014);       // dia incorreto
		
    }
	/**
	 * Unit test to GetDay
	 */
	@Test
	public void GetDayTest() {
		Assert.assertTrue(20== d.getDay());
	}
	
	/**
	 * Unit test to GetMonth
	 */
	@Test
	public void GetMonthTest() {
		Assert.assertTrue(10== d.getMonth());
	}
	
	/**
	 * Unit test to GetYear
	 */
	@Test
	public void GetYearTest() {
		Assert.assertTrue(2014== d.getYear());
	}

	/**
	 * Unit test to ToString
	 */
	public void ToStringTest ()
	{
		Assert.assertEquals("20-10-2014", d.toString());
	}
	
	/**
	 * Unit test to compare two dates
	 * Should return -1 , 0 or 1 if the claimed date is respectively less than , equal to or greater than the date
	 */
	public void CompareToTest()
	{
		Assert.assertTrue(-1 == d.compareTo(new Date(25,10,2014)));
		Assert.assertTrue(0 == d.compareTo(new Date(20,10,2014)));
		Assert.assertTrue(1 == d.compareTo(new Date(15,10,2014)));
	}
	
	/**
	 * Unit test to add days to a date and return the new date
	 * The examples test the change of the day, month and year
	 */
	public void AddDaysTest()
	{
		Assert.assertTrue(new Date(25,10,2014)==d.addDays(5));
		Assert.assertTrue(new Date(9,11,2014)==d.addDays(20));
		Assert.assertTrue(new Date(3,1,2015)==d.addDays(75));
	}
	

	/**
	 * Unit test for an illegal argument in the parameter " nDays " (negative)
	 */
	@Test(expected = IllegalArgumentException.class)   //indica ao compilador a excepção esperada
    public void Negative_NDays_producesException()
    {
		d.addDays(-5);
		
    }
	
	/**
	 * Unit test to the difference of days between to dates
	 */
	@Test
	public void diffDaysTest ()
	{
		Assert.assertTrue(5==d.diffDays(new Date(15,10,2014)));
		Assert.assertTrue(31==d.diffDays(new Date(20,9,2014)));
		Assert.assertTrue(20==d.diffDays(new Date(9,11,2014)));
		Assert.assertTrue(76==d.diffDays(new Date(3,1,2015)));
	}
	
	
	
}

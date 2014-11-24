package Lab12;
import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BookTester {

 	Book book;
	String publisher = "editora";
	String title = "título livro";
	
	@Before
	public void createBook(){ //antes de cada teste cria-se um objecto Book
		book = new Book (title, publisher);
	}

	/**
	 * Unit Test for GetTitle 
	 */
	@Test
	public void GetTitleTest()
	{
		Assert.assertTrue(title.equals(book.getTitle()));
	}
	
	/**
	 * Unit Test for GetPublisher 
	 */
	@Test
	public void GetPublisherTest()
	{
		Assert.assertTrue(publisher.equals(book.getPublisher()));
	}
	
	/**
	 * Unit Test for Requisition's Date
	 */
	@Test
	public void GetDateTest()
	{
		Date d1 = new Date(20,8,1999);
		book.requestIt(d1);
		Assert.assertTrue(d1.toString().equals(book.getLastRequestDate().toString())); //transforma as duas datas em strings e compara-as
	}
	
	/**
	 * Unit Test for RequestIt and ReturnIt Date
	 */
	@Test
	public void GetReturnDateTest()
	{
		Assert.assertTrue(book.requestIt(new Date (5,3,2014))); 
		Assert.assertTrue(!book.requestIt(new Date (5,8,2014))); 
		Assert.assertTrue(book.returnIt());
	}
	
	/**
	 * Unit test for number of requisition
	 */
	@Test
	public void GetNumberRequestTest()
	{		
		for (int i = 1; i <= 12; i++)
		{
			book.requestIt(new Date(20,i,2014));
			book.returnIt();
			int x = book.getTotalRequests();
			Assert.assertTrue(book.getTotalRequests() == i);
		}
	}
	
}

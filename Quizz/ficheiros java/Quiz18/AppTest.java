package Quiz18;

import junit.framework.Assert;

import org.junit.BeforeClass;
import org.junit.Test;

public class AppTest {
	private Person _person; 
		@BeforeClass 
		public void init() { 
		_person = new Person("Manuel Martins", 8); 
		} 
		@Test 
		public void methodOne() { 
		Assert.assertNotNull(_person); 
		} 
		@Test 
		public void methodTwo() { 
		Assert.assertTrue(_person.getId() == 8); 
		Assert.assertTrue(_person.getName().equals("Manuel Martins")); 
		} 
		} 

}

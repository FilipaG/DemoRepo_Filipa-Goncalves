package Quiz18;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AppTest3 {
		private int _value = 0; 
		@Before 
		public void init() { 
		_value++; 
		} 
		@Test 
		public void methodOne() { 
		Assert.assertTrue(_value == 1); 
		} 
		@Test 
		public void methodTwo() { 
		Assert.assertTrue(_value == 2); 
		} 
		@Test 
		public void methodThree() { 
		Assert.assertTrue(_value == 3); 
		} 
		@After 
		public void last() { 
		_value++; 
		} 
	} 

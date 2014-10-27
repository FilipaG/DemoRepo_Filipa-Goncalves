package Quiz18;

import org.junit.Assert;
import org.junit.Test;

public class AppTest1 {
		@Test 
		public void methodOne() { 
		Assert.assertSame("Two", Util.sum(1, 2.0)); // Linha 1 
		Assert.assertSame("Three", Util.sum(1.0, 2.0)); // Linha 2 
		Assert.assertSame("One", Util.sum(1, 2)); // Linha 3 
		} 
	} 

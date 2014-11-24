package lab16;

import org.junit.Assert;
import org.junit.Test;

public class TransformTest {

	@Test
	public void testTransformations() {
		// Arrange
		SerieTransform u = new SerieTransform("My Transformation", 3);
		u.addTransformation(new AscendingSort()); //[1,1,4,5,5,6,6,7,8]
		u.addTransformation(new Unique());    // [1,4,5,6,7,8]
		u.addTransformation(new Inverse());    // [8,7,6,5,4,1]
		int []a = {1,5,6,7,6,8,4,1,5};
		
		// Act & Assert
		Assert.assertEquals("My Transformation: [1, 5, 6, 7, 6, 8, 4, 1, 5] -> [8, 7, 6, 5, 4, 1]", u.executePrint(a));
	}
	
}


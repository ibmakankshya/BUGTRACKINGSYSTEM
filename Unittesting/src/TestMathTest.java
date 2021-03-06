import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import junit.framework.Assert;

class TestMathTest {

	@Test
void testadd() {
		Math math = new Math();
		int result = math.add(2, 2, 2);
		Assert.assertEquals(6, result);
	}
	@Test
	void testmultiply()
	{
	Math math = new Math();
			int result = math.multiply(1, 5, 3);
			Assert.assertEquals(15, result);
			
	 }
	@Test
	void testaddneag() {
		Math math = new Math();
		int result = math.add( 2, -2);
		Assert.assertEquals(0, result);
	}
	@Test
	void testmultiply1()
	{
	Math math = new Math();
			int result = math.multiply(1, -5, -3);
			Assert.assertEquals(15, result);
			
	 }
	@Test
	void testException() {
		Math math = new Math();
		Exception exception = assertThrows(IllegalArgumentException.class,()->{
			math.multiply(12, 6);
		});
	}//junit 5
	
}
 
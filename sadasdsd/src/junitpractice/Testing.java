/**
 * 
 */
package junitpractice;

import static org.junit.Assert.assertEquals;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @author Divya Deverapally
 *
 *
 */
class Testing {

	/**
	 * Test method for {@link junitpractice.Addition#add(int, int)}.
	 */
	@Test
	void testAdd() {
		//fail("Not yet implemented");
		
		Addition addition = new Addition();
		assertEquals("10+20 must be 30",30,addition.add(10,20));
		
	}

}

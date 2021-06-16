/**
 * 
 */
package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

/**
 * @author Divya Deverapally
 *
 *
 */
public class JunitTesting {

	/**
	 * Test method for {@link main.Implementations#isDivya(java.lang.String)}.
	 */
	
	
	@Test
	public void testIsDivya() {
		//fail("Not yet implemented");
		Implementations implementations = new Implementations();
	//	Implementations implementations = new Implementations();
	assertTrue(implementations.isDivya("Divya"));
	
	}

	/**
	 * Test method for {@link main.Implementations#isSandeep(java.lang.String)}.
	 */
	@Test
	public void testIsSandeep() {
		Implementations implementations = new Implementations();
	//	fail("Not yet implemented");
		assertTrue(implementations.isSandeep("Sandeep"));
	}

	/**
	 * Test method for {@link main.Implementations#isPositive(int)}.
	 */
	@Test
	public void testIsPositive() {
	//	fail("Not yet implemented");
		Implementations implementations = new Implementations();
		assertTrue(implementations.isPositive(10));
	}

}

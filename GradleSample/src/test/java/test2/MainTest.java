/**

 * 
 */
package test2;


import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import test.Test;


/**
 * @author Divya Deverapally
 *
 *
 */
public class MainTest {
	
	 @Test
	   public void testSayHello() {
	      Test app = new Test();
	      assertNotNull("Success", app.helloWorld());
	   }

}

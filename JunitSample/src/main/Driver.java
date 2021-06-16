/**
 * 
 */
package main;
import org.junit.runner.*;
import org.junit.runner.notification.Failure;

/**
 * @author Divya Deverapally
 *
 *
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Implementations imp= new Implementations();
		
		Result result = JUnitCore.runClasses(JunitTesting.class);					
		for (Failure failure : result.getFailures()) {							
     System.out.println(failure.toString());					
  }		
  System.out.println("Result=="+result.wasSuccessful());

	}

}

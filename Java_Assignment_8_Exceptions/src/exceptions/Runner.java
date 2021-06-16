/**
 * 
 */
package exceptions;

/**
 * @author Divya Deverapally
 *
 *
 */
public class Runner {

	
	public void run() throws CustomException{
		throw new CustomException("custom exception");
		//System.out.println("Hiiiiii");
	}
}


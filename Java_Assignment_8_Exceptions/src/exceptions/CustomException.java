/**
 * 
 */
package exceptions;

/**
 * @author Divya Deverapally
 *
 *
 */
public class CustomException extends Exception {

	String message;
	public CustomException(String message)
	{
		this.message=message;
	}
}

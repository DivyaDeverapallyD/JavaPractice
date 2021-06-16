/**
 * 
 */
package exceptions;

/**
 * @author Divya Deverapally
 *
 *
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Runner runner= new Runner();
			runner.run();
			
		}
		catch(CustomException e)
		{
			System.out.println(e.getMessage());
			System.out.println(e.getStackTrace());
			e.printStackTrace();
		}

	}

}

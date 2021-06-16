/**
 * 
 */
package practiceCar;

/**
 * @author Divya Deverapally
 *
 *
 */
public class CarPart implements CarFunctions {
	int condition;
	
	public void status() {
		System.out.println("car parts condition :"+ condition);
	}

	/* (non-Javadoc)
	 * @see practiceCar.CarFunctions#function()
	 */
	@Override
	public void function() {
		// TODO Auto-generated method stub
		System.out.println("car parts functioning");
		
	}

}

/**
 * 
 */
package practiceCar;

/**
 * @author Divya Deverapally
 *
 *
 */
public class Engine  extends CarPart{
	
	int numberOfCylinders =5;
	//condition=100;
	public void numberOfCylinders() {
	
		System.out.println("Number of Cylinders in Engile : "+ numberOfCylinders);
	}

	/* (non-Javadoc)
	 * @see practiceCar.CarPart#function()
	 */
	@Override
	public void function() {
		// TODO Auto-generated method stub
		System.out.println("Number of Cylinders in Engile : "+ numberOfCylinders);
	}

	/* (non-Javadoc)
	 * @see practiceCar.CarPart#status()
	 */
	@Override
	public void status() {
		// TODO Auto-generated method stub
		//super.status();
		condition =50;
		System.out.println("Engine condition is "+ condition);
	}
	
	
	

}

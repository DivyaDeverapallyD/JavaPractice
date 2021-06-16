/**
 * 
 */
package practiceCar;

/**
 * @author Divya Deverapally
 *
 *
 */
public class Wheels  extends CarPart{

	int wearLevelInDegrees = 70;
	public void wearLevel() {
		System.out.println("Wear level in tires : "+ wearLevelInDegrees);
	}

	/* (non-Javadoc)
	 * @see practiceCar.CarPart#function()
	 */
	@Override
	public void function() {
		// TODO Auto-generated method stub
		System.out.println("Wear level in tires : "+ wearLevelInDegrees);
	}
	
	@Override
	public void status() {
		// TODO Auto-generated method stub
		
		condition =80;
		System.out.println("Wheels  condition is "+ condition);
	}
}

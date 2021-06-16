/**
 * 
 */
package practiceCar;

/**
 * @author Divya Deverapally
 *
 *
 */
public class FuelTank extends CarPart {
 boolean fullTank = true;
	
	public void isFull() {
		System.out.println("Is fuel tank in full ? :"+ fullTank);
	}

	/* (non-Javadoc)
	 * @see practiceCar.CarPart#function()
	 */
	@Override
	public void function() {
		// TODO Auto-generated method stub
		System.out.println("Is fuel tank in full ? :"+ fullTank);
	}
	
	@Override
	public void status() {
		// TODO Auto-generated method stub
		
		condition =100;
		System.out.println("Tank condition :  "+ condition);
	}
}

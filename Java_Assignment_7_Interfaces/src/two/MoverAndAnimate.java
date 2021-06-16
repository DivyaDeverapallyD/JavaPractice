/**
 * 
 */
package two;

/**
 * @author Divya Deverapally
 *
 *
 */
public class MoverAndAnimate implements Animatable {

	/* (non-Javadoc)
	 * @see one.Movable#move()
	 */
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Move in MoverAndAnimate");
		
	}

	/* (non-Javadoc)
	 * @see two.Animatable#animate()
	 */
	@Override
	public void animate() {
		// TODO Auto-generated method stub
		System.out.println("Animate in MoverAndAnimate");
	}

}

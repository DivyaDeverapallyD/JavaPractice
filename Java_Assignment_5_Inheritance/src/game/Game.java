/**
 * 
 */
package game;

/**
 * @author Divya Deverapally
 *
 *
 */
public class Game {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GameObject player = new Player();
				GameObject enemy = new Enemy();
		player.update();
		enemy.update();

	}

}

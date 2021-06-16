/**
 * 
 */
package stringsAssignment;

/**
 * @author Divya Deverapally
 *
 *
 */
public class Assignment6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "Hello My Name is Java";

		int index = str.indexOf(" ", str.indexOf(" ") + 1);
		
		System.out.println("The second space is at: " + index);
	}

}

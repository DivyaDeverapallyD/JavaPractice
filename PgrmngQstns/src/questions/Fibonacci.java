/**
 * 
 */
package questions;

/**
 * @author Divya Deverapally
 *e.g. 1 1 2 3 5 8 13 ... . up to a given number.

 *
 */
public class Fibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int first=1,second=1;
		System.out.println(first);
		System.out.println(second);
		
		
		for(int i =0; i<=10;i++)
		{
			int sum= first+second;
			System.out.println(sum);
			
			
			first=second;
			second= sum;
			
			
		}
	}

}

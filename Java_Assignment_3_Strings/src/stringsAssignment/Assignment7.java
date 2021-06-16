/**
 * 
 */
package stringsAssignment;

/**
 * @author Divya Deverapally
 *
 *
 */
public class Assignment7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str = "\"http://example.com?\r\n" + 
		"access_token=EFEc8328h29jndjd02h12$3829&ds98d\"";
System.out.println(str.substring(str.indexOf("=")+1));
	}

}

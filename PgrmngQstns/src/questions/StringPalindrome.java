/**
 * 
 */
package questions;

import java.util.Scanner;

/**
 * @author Divya Deverapally
 *
 *
 */
public class StringPalindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		String str = sc.next();

		String revString = stringReverse(str);
		String recRevString = recursiveStringReverse(str);
		System.out.println("recursive is :" +recRevString);

		if (str.equalsIgnoreCase(revString))
			System.out.println("Palindrome");
		else
			System.out.println("Nt Palindrome");
	}

	/**
	 * @param str
	 * @return
	 */
	private static String recursiveStringReverse(String str) {
		// TODO Auto-generated method stub
		
		if(str.isEmpty() || str.length()<1)
			return str;
		else
		
		return  str.charAt(str.length()-1)+recursiveStringReverse(str.substring(0, str.length()-1));
		
	//	return str.valueOf(str.charAt(str.length()-1))+recursiveStringReverse(str.substring(0, str.length()));
		
	
	}

	/**
	 * @param str
	 * @return
	 */
	private static String stringReverse(String str) {
		// TODO Auto-generated method stub
		// return null;

		char[] abc = str.toCharArray();
		// String res="";
		StringBuilder res = new StringBuilder("");
		for (int i = abc.length - 1; i >= 0; i--) {
			res.append(abc[i]);

		}

		return res.toString();
	}

}

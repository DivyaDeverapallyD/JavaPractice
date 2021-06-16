/**
 * 
 */
package leetCodeProbs;

/**
 * @author Divya Deverapally
 *
 *
 */
public class LongestPalinSubStr {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(longestSubString("abb"));
	}
	
private static String longestSubString(String s) {
		
		int max=-1;
		String str="";

		
		if(s.length() ==1 ||isPalindrome(s) )
			return s;
		
		for (int i = 0; i <= s.length(); i++) {

			for (int j = i + 1; j <= s.length(); j++) {
				
				if(isPalindrome(s.substring(i, j)) && s.substring(i, j).length() > max)
				{
					max= s.substring(i, j).length();
					str= s.substring(i, j);
					
				}

			}
		}
		return str;

	}

public static boolean isPalindrome(String s) {

	if (s.isEmpty())
		return true;

	StringBuilder input = new StringBuilder(" ");

	for (int i = 0; i < s.length(); i++) {

		if (!(Character.isWhitespace(s.charAt(i)))
				&& ((Character.isLetter(s.charAt(i))) || Character.isDigit(s.charAt(i))))

		{
			input.append(s.charAt(i));

		}

	}
	String stringInput = input.toString();

	StringBuilder res = new StringBuilder(" ");

	for (int j = stringInput.length() - 1; j >= 0; j--) {

		res.append(stringInput.charAt(j));
	}

	if (stringInput.trim().equalsIgnoreCase(res.toString().trim()))

		return true;

	else
		return false;

}

}

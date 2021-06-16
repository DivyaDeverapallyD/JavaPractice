/**
 * 
 */
package abc;

import java.util.*;

/**
 * @author Divya Deverapally
 *
 *10.	Find all palindromic substring for the given string.
 *Input: str = "abaaa"
Output:  Below are 5 palindrome sub-strings
a
aa
aaa
aba
b
 */
public class SubStringPalindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String str = "geek";
	Set<String> set = new HashSet<>();
	for(int i =0; i< str.length() ;i++) {
		set.add((""+str.charAt(i)));
		for(int j = i+1;j< str.length();j++) {
		 if(isPalindrome(str.substring(i,j+1)))	
		 {
			 set.add(str.substring(i,j+1));
		 }
			
		}
	}
	
	for( String s : set)
	{
		System.out.println(s);
	}
	
	
	

	}
	
	static boolean isPalindrome(String str)
	{
		
		char[] ch= str.toCharArray()
;
		
		String rev = "";
		
		
		for(int i = str.length()-1; i>=0; i--)
		{
		 rev= rev+ str.charAt(i);
		}
		
		if(str.equals(rev))
			return true;
		else
			return false;
	}

}

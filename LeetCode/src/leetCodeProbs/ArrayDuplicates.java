/**
 * 
 */
package leetCodeProbs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

/**
 * @author Divya Deverapally
 *
 *
 */
public class ArrayDuplicates {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {4,5};
		int val = 5;
		// int l= a.length;
		int l = removeDuplicatesOfValue(a, val);

		for (int i = 0; i <l; i++) {
			System.out.println(a[i]);
		}

		// s System.out.println(matchingParanthesis("(){}[]"));
		// System.out.println(getLastStringLength("Hello"));

		// String s= "abcabcbb";

		// System.out.println(longestSubString(s));

	}

	/**
	 * @param a
	 * @return
	 */
	private static int removeDuplicates(int[] nums) {

		int len = nums.length;

		int i = 0;
		for (int j = 1; j < len; j++) {

			if (nums[i] != nums[j]) {
				i++;
			}
			nums[i] = nums[j];

		}
		return i + 1;

		// return 0;
	}

	private static boolean matchingParanthesis(String s) {

		Map<Character, Character> map = new HashMap<>();

		map.put(')', '(');
		map.put(']', '[');
		map.put('}', '{');

		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (map.containsKey(ch)) {
				char tp = '\0';

				if (!stack.isEmpty())
					tp = stack.pop();

				if (tp != map.get(ch))
					return false;

			} else
				stack.push(ch);
		}

		/// ()[]{}
		return stack.isEmpty();

	}

	public static int getLastStringLength(String s) {

		String[] str = s.split(" ");
		int res = 0;
		if (str.length <= 1)
			return 0;
		return str[str.length - 1].length();

	}

	private static int removeDuplicatesOfValue(int[] nums, int val) {
		// TODO Auto-generated method stub
		
		if(nums.length==1  && nums[0]==val)
		{
			return 0;
		}
		
		
		int n = nums.length-1;
		if(nums[n]==val)
			return n;
		int res = 0;
		int i;
		// 0,1,2,2,3,0,4,2
		for (i = 0; i < n; i++) {
			if (nums[i] == val) {

				if(nums[n] != val)
				{
					nums[i]= nums[n];
					n--;
					
				}
				else
				{
					while(n-- > i) {
						//n--;
					if(nums[n] != nums[i])
					{
					  nums[i]= nums[n];
					  n--;
					  break;
					  
					 
					}
				//	n--;
					}
					
				}
				//n--;
			//	continue;
				//n--;
				//nums[i] = nums[i + 1];
			}

		}

		// return i;

		// }

		return n+1;
	}

	private static String longestSubString(String s) {

		int max = -1;
		String str = "";

		if (s.length() == 1)
			return s;
		for (int i = 0; i < s.length() - 1; i++) {

			for (int j = i + 1; j < s.length(); i++) {

				if (isPalindrome(s.substring(1, j)) && s.substring(1, j).length() > max) {
					max = s.substring(1, j).length();
					str = s.substring(1, j);

				}

			}
		}
		return str;

	}

	public static boolean isUnique(String s) {
		char[] c = s.toCharArray();
		Set<Character> set = new HashSet<>();

		for (char ch : c)

			set.add(ch);

		// System.out.println(set);
		// }

		// int n = Collections.max(map.values());
		if (set.size() == s.length())
			return true;
		else
			return false;
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

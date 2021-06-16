/**
 * 
 */
package leetCodeProbs;

/**
 * @author Divya Deverapally
 *
 *
 */
import java.text.CharacterIterator;

import java.text.StringCharacterIterator;
import java.util.*;

class Test {
	// Iterate over characters of a String
	public static void main(String[] args) {
		int a = 1534236469;
		// System.out.println(2147483647 > 1534236469);
		// System.out.println(reverse(a));

		// String[] strs =new String[] {"alower","dlower","dower","flower"};
		String[] strs = new String[] { "ab", "a" };
		// String[] strs =new String[] {};

		// String[] strs =new String[] {"cir","car"};
		// String[] strs =new String[] {"flower","flower","flower","flower"};
		// System.out.println(longestCommonPrefix(strs));

		/*
		 * String aa= "Divya"; aa.replaceAll("Divya", "Sandeep"); StringBuilder ss = new
		 * StringBuilder("Divya");
		 */
		// ss.replace(arg0, arg1, arg2)
		// ss.replaceAll(ss, "sandeep");
		//// ss=new StringBuilder("sandeep");
		// System.out.println(aa);

		//System.out.println(strStr("hell","ll"));
		
		int[] arr= {1,3,5,6};
		int target =7;
		System.out.println(searchInsert(arr,target));
		
	}

	public static int reverse(int x) {

		long rev = 0;

		// if(x>Math.pow(-2, 31) && x<(Math.pow(2, 31)-1)) {
		while (x != 0) {// 2147483647 // 2,147,483,647
						// 1056389759

			int rem = x % 10;

			rev = rev * 10 + rem;
			x = x / 10;
		}

		if (rev > Integer.MAX_VALUE)
			return 0;

		return (int) rev;
		// }

		// return 0;
	}

	/*
	 * public static String longestCommonPrefix(String[] strs) {
	 * 
	 * StringBuilder res = new StringBuilder("");
	 * 
	 * if (strs.length > 0) {
	 * 
	 * if(strs.length ==1) { return strs[0]; } String s = strs[0];
	 * 
	 * int k = 0; for (int i = 1; i < s.length()+1; i++) { String ss =
	 * s.substring(0, i); int c = 1;
	 * 
	 * for (int m = 1; m < strs.length; m++) {
	 * 
	 * if (strs[m].substring(0, i).length() == ss.length() &&
	 * ss.equalsIgnoreCase(strs[m].substring(0, i))) {
	 * 
	 * c++; } else return res.toString();
	 * 
	 * }
	 * 
	 * if (c == strs.length) res = new StringBuilder(s.substring(0, i)); // res.re
	 * 
	 * }
	 * 
	 * }
	 * 
	 * return res.toString(); }
	 */

	// ********************
	public static String longestCommonPrefix(String[] strs) {

		StringBuilder res = new StringBuilder("");

		if (strs.length > 0) {
			String s = strs[0];

			for (int k = 0; k < s.length(); k++) {
				int c = 1;
				for (int i = 1; i < strs.length; i++) {
					if (k < strs[i].length() && (s.charAt(k) == strs[i].charAt(k)))
						c++;

				}

				if (c == strs.length)
					res.append(s.charAt(k));
				else
					return res.toString();

			}

			return res.toString();
		}

		return "";

	}

	public static int removeDuplicates(int[] a) {

		Map<Integer, Integer> set = new HashMap<Integer, Integer>();

		for (int i = 0; i < a.length; i++) {

			set.put(a[i], i);

		}

		String abc = "Divyyaaa";
		if (!abc.contains("iv")) {

		}

		Object[] array = set.values().toArray();
		return Arrays.asList(array).toArray(new Integer[0]).length;
		// return set.values();

	}

	public static int strStr(String haystack, String needle) {

		int index = 0;
		if (needle.isEmpty())
			return 0;
		if (!haystack.contains(needle))
			return -1;

		int len = needle.length();
		for (int i = 0; i < haystack.length(); i++) {
			if (haystack.substring(i, i + len).equals(needle)) {

				index = i;
				break;

			}

		}
		return index;

	}

	
	
	
	
	
	 public static int searchInsert(int[] nums, int target) {
	        
	        
	        int index=0;
	        for(int i =0; i< nums.length; i++)
	        {
	                        
	            if(nums[i] == target)
	            {
	                index=i;
	                break;
	            }
	            
	                            
	        }
	        
	        for(int i =0; i< nums.length-1; i++)
	        {
	        	
	        	if(target > nums[i] || target<nums[i+1])
	        	
	        		index= i+1;
	        }
	      return index;  
	        
	    }
	
	
	
	
}
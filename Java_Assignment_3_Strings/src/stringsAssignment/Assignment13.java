/**
 * 
 */
package stringsAssignment;

import java.util.*;

/**
 * @author Divya Deverapally
 *
 *
 */
public class Assignment13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "ayvid";
		String b = "divya";
		boolean flag = true;
		Map<Character, Integer> map1 = new HashMap<Character, Integer>();
		Map<Character, Integer> map2 = new HashMap<Character, Integer>();

		if (a.length() == 0 && b.length() == 0) {
			System.out.println("Empty strings");
			return;
		}
		if (a.length() == 0 || b.length() == 0) {
			System.out.println("Not anagrams");
			return;
		}

		if (a.length() == b.length()) {
			for (int i = 0; i < a.length(); i++) {

				if (map1.containsKey(a.charAt(i))) {
					map1.put(a.charAt(i), map1.get(a.charAt(i)) + 1);
				} else {
					map1.put(a.charAt(i), 1);
				}

				if (map2.containsKey(b.charAt(i))) {
					map2.put(b.charAt(i), map2.get(b.charAt(i)) + 1);
				} else {
					map2.put(b.charAt(i), 1);
				}

			}

			for (int k = 0; k < a.length(); k++) {
				if (map2.containsKey(a.charAt(k))) {
					if (!(map1.get(a.charAt(k)) == map2.get(a.charAt(k)))) {
						flag = false;
						break;
					}
				}

			}

		}
		
		if (flag)
			System.out.println("Anagrams");
		else
			System.out.println("Not anagrams");

	}

}

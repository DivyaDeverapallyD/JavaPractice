/**
 * 
 */
package abc;

import java.util.*;
import java.util.Map.Entry;

/**
 * @author Divya Deverapally 1. Given an array with repeated elements, find the
 *         sum of all distinct (non-repeating) elements. Input: arr[]={2, 3, 1,
 *         2, 6, 1} Output: 9
 *
 * 
 */
public class NonRepeatSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 2, 3, 2, 6, 1 };
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int val : a) {

			if (map.containsKey(val)) {
				map.put(val, map.get(val) + 1);
			} else {
				map.put(val, 1);
			}
		}

		int sum = 0;
		for (Entry<Integer, Integer> entry : map.entrySet()) {

			if (entry.getValue() == 1)
				sum = sum + entry.getKey();
		}

		System.out.println("Result is " + sum);

	}

}

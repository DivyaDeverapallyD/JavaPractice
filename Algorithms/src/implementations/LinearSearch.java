/**
 * 
 */
package implementations;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/**
 * @author Divya Deverapally
 *
 *         Complexity O(n) avg and worst 
 *         O(1)- element found at index 0
 *
 */
public class LinearSearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = Integer.parseInt(sc.next());
		int[] array = new int[size];

		System.out.println("Enter array ");
		for (int i = 0; i < size; i++) {

			array[i] = Integer.parseInt(sc.next());
		}

		System.out.println("Enter value to be searched");
		int searchNum = Integer.parseInt(sc.next());

		System.out.println((linearSearch(array, searchNum) > -1) ? "Element Found at index : " + linearSearch(array, searchNum) : "Element not found");

	}

	/**
	 * @param array
	 * @param searchNum
	 * @return
	 */
	private static int linearSearch(int[] array, int searchNum) {
		// TODO Auto-generated method stub

		for (int i = 0; i < array.length; i++) {
			if (array[i] == searchNum)
				return i;
		}
		return -1;
	}

}

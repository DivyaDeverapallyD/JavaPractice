/**
 * 
 */
package implementations;

import java.util.Scanner;

/**
 * @author Divya Deverapally
 *Complexity - O(n^2)
 *
 */
public class SelectionSort {

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

		for (int element : selectionSort(array))
			System.out.println(element);

	}

	public static int[] selectionSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int min = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[min]) {
					min = j;
				}

				int temp = array[min];
				array[min] = array[i];
				array[i] = temp;

			}

		}

		return array;
	}

}

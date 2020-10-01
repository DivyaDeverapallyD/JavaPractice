/**
 * 
 */
package implementations;

import java.util.Scanner;

/**
 * @author Divya Deverapally Complexity - For each iteration, the array will
 *         reduce to half for K iterations the lenth become n/2^k after k
 *         iteration array length will be 1 k=n/2^k=1 1=n/2^k apply log on both
 *         sides n=2^k log n=klog2,
 *          k=log(n)
 *
 */
public class BinarySearch {

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
		System.out.println(
				(binarySearch(array, searchNum) > -1) ? "Element Found at index : " + binarySearch(array, searchNum)
						: "Element not found");

		System.out.println("*********************Resursive search****************************");

		System.out.println((binarySearch(array, 0, size - 1, searchNum) > -1)
				? "Element Found at index : " + binarySearch(array, 0, size - 1, searchNum)
				: "Element not found");

	}

	/**
	 * @param array
	 * @param i
	 * @param j
	 * @param searchNum
	 * @return
	 */
	private static int binarySearch(int[] array, int i, int j, int searchNum) {
		// TODO Auto-generated method stub

		int l = 0;
		int r = array.length - 1;
		if (r > l) {
			int m = (l + r) / 2;
			if (array[m] == searchNum)
				return m;
			if (searchNum > array[m])
				binarySearch(array, l, m - 1, searchNum);
			else
				binarySearch(array, m + 1, array.length - 1, searchNum);
		}
		return -1;
	}

	/**
	 * @param array
	 * @param i
	 * @param j
	 * @return
	 */

	public static int binarySearch(int[] array, int number) {

		int l = 0;
		int r = array.length - 1;

		while (l <= r) {
			int mid = (l + r) / 2;
			if (array[mid] == number)
				return mid;

			if (number > array[mid])
				l = mid + 1;
			else
				r = mid - 1;

		}
		return -1;
	}

}

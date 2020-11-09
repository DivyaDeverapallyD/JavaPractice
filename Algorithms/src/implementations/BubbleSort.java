/**
 * 
 */
package implementations;

import java.util.Scanner;

/**
 * @author Divya Deverapally
 *O(n^2)
 *
 */
public class BubbleSort {

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

		for (int element : bubbleSort(array))
			System.out.println(element);


	}

	/**
	 * @param array
	 * @return
	 */
	private static int[] bubbleSort(int[] array) {
		// TODO Auto-generated method stub


		for(int j=0; j< array.length ; j++)
		{

			for(int i=0; i< array.length-1-j; i++) 
			{

				if(array[i] > array[i+1])
				{
					int temp =array[i];
					array[i]=array[i+1];
					array[i+1]=temp;
				}
			}

		}

		return array;

}

}
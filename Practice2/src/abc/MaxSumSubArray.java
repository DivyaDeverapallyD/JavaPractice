/**
 * 
 */
package abc;

import java.util.*;

/**
 * @author Divya Deverapally
 *
 *
 */
public class MaxSumSubArray {
	
	
	public static void main(String[] args) {
		
		int a[] = { 2, 3, 2, 6, 1 };
		
		int sum=0;
		//Map<List,Integer> map= new HashMap<List, Integer>;
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0 ; i < a.length; i++)
		{
			 
			for(int j =i+1; j<a.length;j++)
			{ 
				int tempSum=0;
				 for(int k=i; k <= j; k++)
				 {
					tempSum+=a[k];
				 }
				 
				 if(tempSum > sum)
				 {
					 sum= tempSum;
					 list.clear();
					 for(int k=i; k <= j; k++)
					 
					 {
						 list.add(a[k]);
						 
					 }
					// map.put(list, tempSum);
					 
					 
					 
					 
				 }
				
			}
			
		}
		
		
		for(int n :list)
			System.out.println(n);
		
	
	}

}

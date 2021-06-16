/**
 * 
 */
package arrayProbs;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Divya Deverapally
 *
 *
 */
public class ArrayProbs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		/*Input: nums = [1,2,3,4]
				Output: [1,3,6,10]*/
		
		//int[][] nums= {{1,2,3},{3,2,1}};
		/*//int[] res = runningSum(nums);
		for(int val : res)
			System.out.println(val);*/
		/*int[] candies = { 2,3,5,1,3};
		int extraCandies = 3;
		  List<Boolean> candiesList= kidsWithCandies(candies,extraCandies);
		  
		  for(Boolean bool : candiesList)
			  System.out.println(bool);*/
		  
	//	System.out.println(richCustWealth(nums));
		
		
		//************
	/*int[]	nums = {0,1,2,3,4};
	int[] index= {0,1,2,2,1};
	int  n = 3;
		  
		  int[] res = createTargetArray(nums,index);
		  
		  for(int val : res)
			  System.out.println(val);*/
		//System.out.println(sumOddLengthSubarrays(arr));
		  
		
		int[] arr= {3,0,1,1,9,7};
		int a=7,b=2,c=3;
		
		System.out.println(countGoodTriplets(arr,a,b,c));
		
	
		
		
	}
	
	public static int[] runningSum(int[] nums)
		{
		int[] runningSum= new int[nums.length];
		for(int i =0 ; i < runningSum.length ; i++)
		{
			int sum=0;
			for(int k =0; k <= i; k++)
			{
				
				//int sum =
				sum=sum+nums[k];
				
				
			}
			runningSum[i]= sum;
		}
		
		return runningSum;
		
	}
	
	
	public static int richCustWealth(int[][] accounts)
	{
		
		int maxWealth=-1;
		
		
		for(int i =0; i < accounts.length ; i++)
		{
			int sum=0;
			
			for(int j=0; j< accounts[i].length ; j++)
			{
				
				sum= sum+accounts[i][j];
				
				
			}
			
			if(sum > maxWealth)
				maxWealth= sum;
		}
		return maxWealth;
	}

	
	
	  public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		  
		  int max=-1;
		  List<Boolean> candiesList= new ArrayList<Boolean>();
		  
		  for(int i =0 ; i < candies.length; i++)
		  {
			  
			  if(candies[i]> max)
				  
				  max= candies[i];
		  }
		  
		  for(int j =0 ; j< candies.length; j++)
		  {
			  if(candies[j]+ extraCandies>= max)
				  
				  candiesList.add(true);
			  else
				  candiesList.add(false);
		  }
		  
		 
		 
		return candiesList;
	        
	        
	        
	        
	        
	        
	        
	        
	    }
	  public static int[] shuffle(int[] nums, int n) 
	  {
		  
		  // [2,5,1,3,4,7]//
	
		  int[] res= new int[nums.length];
		  
		  for(int i =0; i<n ; i++)
		  {
			 res[i*2]=nums[i]; //i =0 res[0] //i=1 res[2]
			 res[i*2+1]= nums[i+n];//i=0 res[1]    res[]3
		  }
		  
		  
		  
		  
		  
		  
		return res;
		 
		  //2,3,5,4,1,7] n=3
  
	    }

	public static int[] decompressRLElist(int[] nums) {

		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < nums.length; i = i + 2) {

			int freq = nums[i];
			int val = nums[i + 1];

			for (int k = 0; k < freq; k++)
				list.add(val);

		}

		int[] res = new int[list.size()];
		for (int j = 0; j < list.size(); j++)
			res[j] = list.get(j);

		return res;

	}
	 public static int[] createTargetArray(int[] nums, int[] index) {
		 /*
		  * nums       index     target
			1            0        [1]      
			2            1        [1,2]
			3            2        [1,2,3]
			4            3        [1,2,3,4]
			0            0        [0,1,2,3,4]*/
		 
		 //0,4,1,3,2
		 int[] target = new int[nums.length];
		 
		 int j =0;                              //0
		 for(int i =0; i < index.length; i++)    //0
		 {
			 target[index[i]]= nums[index[i]]; //target[0]= taeget[0]+nums[index[0]] ;
			 j++;
		 }
		return target;
	        
	    }	  

	public static int sumOddLengthSubarrays(int[] arr) {

		int sum = 0;
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			temp = temp + arr[i];

		}
		sum = sum + temp;

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {
				int tempSum = 0;
				if ((i + j + 1) % 2 != 0) {

					for (int k = i; k <= j; k++) {
						tempSum = tempSum + arr[k];
					}
					sum += tempSum;
				}

			}

		}

		// 4,5
		return sum;

	}	  
	 public static int countGoodTriplets(int[] arr, int a, int b, int c) {
		 
		 int count=0;
		 for(int i=0; i < arr.length; i++)
		 {
			 for(int j=i+1; j < arr.length; j++)
			 {
				 for(int k=j+1; k < arr.length; k++)
				 {
					 if((arr[i] - arr[j] <= a) &&  (arr[j] - arr[k] <= b)   && (arr[i] - arr[k] <= c))
						 count++;
				 }
			 }
				
		 }
		 
		 
		 
	      return count;  
	    }
}

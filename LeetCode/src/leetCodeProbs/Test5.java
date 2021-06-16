/**
 * 
 */
package leetCodeProbs;

/**
 * @author Divya Deverapally
 *
 *
 */
public class Test5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] a = {-2,1,-3,4,-1,2,1,-5,4};
		int[] a = {-2,1};
	//	int target=2;
	//	System.out.println(searchInsert(a,target));
		System.out.println(maxSubArray(a));
		
	}
	
	
	
	public static int searchInsert(int[] nums, int target) {
		int res = -1;

		if (target > nums[nums.length - 1])
			return nums.length;
		if (target < nums[0])
			return 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target)

				res = i;

		}

		if (res > -1)
			return res;
		else {
			for (int i = 0; i < nums.length; i++) {
				if (target > nums[i]) {
					res = i + 1;
					// break;
				}

			}

		}

		return res;}

	
	
	 public  static int maxSubArray(int[] nums) {
	       // int sum=0;
	        int maxSum=-1;
	        if(nums.length==1)
	            return nums[0];
	       
	        if(nums.length==2)
	        {
	        	if(nums[0]+nums[1]> maxSum)
	        		return nums[0]+nums[1];
	        	else
	        		if(nums[0]>nums[1])
	        			return nums[0];
	        		else
	        			return nums[1];
	        					
	        	
	        	
	        	
	        }
	        for(int i =0 ; i < nums.length; i++)
	        {
	             int sum=nums[i];
	            for(int j =i+1; j < nums.length; j++)
	            {
	                
	                sum=sum+nums[j];
	                if(sum > maxSum)
	                         maxSum=sum;
	                
	            }
	            
	            
	          //  sum=0;
	            
	        }
	        
	        return maxSum;
	    }
}

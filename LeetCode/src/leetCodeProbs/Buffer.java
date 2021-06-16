/**
 * 
 */
package leetCodeProbs;
import java.util.*;

/**
 * @author Divya Deverapally
 *
 *
 */

class Test2{

	void mth(int i, int j)
	{
		i *=2;
		j/=2;
	}
}
public class Buffer
{
	public static void main(String[] args)
	{
		// System.out.println(curClaName());

		int[] a = {2,2,1};
		int target=9;
		//System.out.println(majorityElement(a));
		/*int[] res = twoSum(a,target);
		System.out.println(res[0]+"------------"+ res[1]);*/

		//	System.out.println(singleNumber(a));


		String s=	"A man, a plan, a canal: Panama";
		
		
	///	System.out.println(isPalindrome(s));
		
		int n = 00000000000000000000000000001011%10;
		System.out.println(n);
		System.out.println(00000000000000000000000010000000%10);


	}




	public static int majorityElement(int[] nums) {
		//List<Integer,Integer> num= new ArrayList<Integer,Integer>();

		Map<Integer,Integer> numberMap= new HashMap<>();
		for(int i=0; i< nums.length; i++)
		{

			if(!numberMap.containsKey(nums[i]))

				numberMap.put(nums[i],1);
			else

				numberMap.put(nums[i],numberMap.get(nums[i])+1);

		}


		int n = nums.length/2;
		int res=0;

		for(Map.Entry<Integer,Integer> entry:numberMap.entrySet())

			if(entry.getValue() > n)

				res= entry.getKey();


		return res;
	}





	public static int[] twoSum(int[] numbers, int target) {

		int[] res= new int[2];
		int len = numbers.length;
		for(int i =0; i<len-1; i++)
		{
			for( int j =i+1; j<len;j++)
			{
				if(numbers[i]+numbers[j]==target)
				{
					res[0]=i+1;
					res[1]=j+1;
				}
			}
		}


		return res;
	}



	public static int singleNumber(int[] nums) {  
		List<Integer> output= new ArrayList<>();

		if(nums.length==1)
			return nums[0];
		for(int i =0 ;i < nums.length; i++)
		{
			if(!(output.contains(nums[i])))
				output.add(nums[i]);
			else
				output.remove(nums[i]);






		}


		return output.get(0);}







	public static boolean isPalindrome(String s) {

		if (s.isEmpty())
			return true;

		StringBuilder input = new StringBuilder(" ");

		for (int i = 0; i < s.length(); i++) {

			if (!(Character.isWhitespace(s.charAt(i)))
					&& ((Character.isLetter(s.charAt(i))) || Character.isDigit(s.charAt(i))))

			{
				input.append(s.charAt(i));

			}

		}
		String stringInput = input.toString();

		StringBuilder res = new StringBuilder(" ");

		for (int j = stringInput.length() - 1; j >= 0; j--) {

			res.append(stringInput.charAt(j));
		}

		if (stringInput.trim().equalsIgnoreCase(res.toString().trim()))

			return true;

		else
			return false;

	}
}

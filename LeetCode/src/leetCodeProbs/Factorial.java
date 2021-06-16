/**
 * 
 */
package leetCodeProbs;

/**
 * @author Divya Deverapally
 *
 *
 */
public class Factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=10;
		
		int res=1;
		 //nw
		
		while(n>=1)
		{
			res=res*n;
			n=n-1;
		}
	//	System.out.println(res);
		int c=0;
		
		while(res>0)
		{
			
			if(res%10 != 0)
				break;
			else
				c++;
			
			res=res/10;
			//;
		}
		
		System.out.println(c);

	}

}

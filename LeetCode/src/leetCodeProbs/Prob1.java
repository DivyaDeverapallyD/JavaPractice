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
public class Prob1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= new int[]{1,2};
		int[] b= new int[]{3,4};
	int m = a.length,n=b.length;
		int[]  c = new int[m+n];
	int k =0;
		for(int i =0; i<m;i++)
			c[i]=a[i];
		for(int j=m;k<n;k++)
		{
			c[j]=b[k];
			j++;
		}
		
		for(int r : c)
			System.out.println(r);
		
		
		//l odd= 
		//System.out.println(m+""+n);
		
		
	}

}

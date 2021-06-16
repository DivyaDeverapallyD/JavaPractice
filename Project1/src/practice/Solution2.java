/**
 * 
 */
package practice;

/**
 * @author Divya Deverapally
 *
 *
 */
public class Solution2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(solution("011100"));
	}
	
	public static int solution(String S)
    {
        int num=1*Integer.parseInt(S.charAt(S.length()-1)+"");
        int two=1;
        for(int i=S.length()-2;i>=0;i--)
        {
            two=two*2;
            int val=(two*Integer.parseInt(S.charAt(i)+""));
            num+=val;
        }
        int count=0;
        while(num!=0)
        {
            if(num%2==0)
            num=num/2;
            else
                num-=1;
            count++;
        }
        return count;


}
}
/**
 * 
 */
package practice;

/**
 * @author Divya Deverapally
 *
 *
 */
public class Solution1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String r= solution("eedaaad");
		System.out.println(r);
		

	}
	public static String solution(String S)
    {
        String res="";
        Character temp;
         temp=S.charAt(0);
         int count=1;
         res+=temp;

        for(int i=1;i<S.length();i++)
        {
            Character c=S.charAt(i);
            if(c==temp && count<2)
            {
                count++;
                res+=c;
            }
            else if(c!=temp)
            {
                count=1;
                res+=c;
                temp=c;
            }
        }
        return res;
    }


}

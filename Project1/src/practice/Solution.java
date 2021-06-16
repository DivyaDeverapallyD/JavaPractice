/**
 * 
 */
package practice;
import java.util.*;

/**
 * @author Divya Deverapally
 *
 *
 */
class Solution {
    public String solution(String S) {
        // write your code in Java SE 8

        String res = "";
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i =0 ; i < S.length(); i++)
        {
           if(map.containsKey(S.charAt(i)))
                map.put(S.charAt(i), map.get(S.charAt(i))+1);
                else

                map.put(S.charAt(i),map.get(S.charAt(i)));

        }


        for(Map.Entry<Character,Integer>entry : map.entrySet())
        {
            if(entry.getValue() > 3)

            {
                    for(int j =0 ; j< 2 ; j++)
                    {
                        res=res+entry.getKey();
                    }

            }
            else
             for(int j =0 ; j< 2 ; j++)
                    {
                        res=res+entry.getKey();
                    }

        }
   

return res;

    }
}

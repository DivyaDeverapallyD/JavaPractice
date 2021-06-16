/**
 * 
 */
package leetCodeProbs;

import java.util.Scanner;

/**
 * @author Divya Deverapally
 *
 *
 */
public class RomanToInt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input= new Scanner(System.in);
	
		System.out.println("Enter Roman NUmber");
	String in= input.next();
	
	System.out.println("Integr is  :  " + romanToInt(in));
		
	}

	
	
	
	
	  public static  int romanToInt(String s) {
	        
	        int res=0;
	    for(int i=0; i< s.length(); i++)
	    {
	        
	        int s1= romanIntValue(s.charAt(i));
	        
	        if(i+1 < s.length())
	        {
	           int  s2=  romanIntValue(s.charAt(i+1));
	            
	            if( s1>= s2)
	            {
	                
	                res=res+s1;
	            }
	            else{
	                
	                res= res-s1;
	            }
	            
	            
	        }
	        
	        else
	        {
	            
	            res=res+s1;
	        }
	        
	    }
	        
	        return res;
	        
	    }
	    
	    
	  public static  int  romanIntValue( char s)
	    {
	        
	          if(s == 'I')
	            return 1;
	       else  if(s == 'V')
	            return 5;
	        else if(s == 'X')
	            return 10;
	      else  if(s == 'L')
	            return 50; 
	      else  if(s == 'C')
	            return 100; 
	       else if(s == 'D')
	            return 500;
	        else if(s == 'M')
	            return 1000;
	        else
	            return -1;
	    }
}

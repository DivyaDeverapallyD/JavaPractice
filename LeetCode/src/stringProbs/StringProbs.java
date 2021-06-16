/**
 * 
 */
package stringProbs;

/**
 * @author Divya Deverapally
 *
 *
 */
public class StringProbs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char c= 'A';
		char Z= 'Z';
		System.out.println("Z" + (int)Z);
		char  f= 'a';
		int a= c;
		
		System.out.println("A :    "+a);
		System.out.println("a :    "+(int)f);
		char d=(char)a;
		System.out.println(d);
		//System.out.println(interpret("G()(al)"));
	//	s.re

	}
	
public String toLowerCase(String str) {
        
        
        String res ="";
        for(int i =0 ; i < str.length(); i++)
        {
            if(str.charAt(i) >=65  &&  str.charAt(i) <= 90)
            {
                int charVal= str.charAt(i);
                int val = charVal+ 32;
                char ch= (char)val;
                res+=ch;
                
            }
            else
                res+=str.charAt(i);
            
        }
        
        return res;
        
        
    }
	

public String defangIPaddr(String address) {
	//address.charAt(0)='S';
	
	return address.replace(".", "[.]");
        
        
    }


public static String interpret(String command) {
    
    String res="";
    
    for(int i =0; i < command.length(); i++)
    {
    	
    	if(command.charAt(i)=='G')
    		res += "G";
    	else if(command.charAt(i)=='(' && command.charAt(i+1)==')')
    		res+="o";
    		else if(command.charAt(i)=='(' && command.charAt(i+1)=='a')
    			res += "al";
    		
    }
    
    //G - G, ()- O, (al) al
    
	return res;
    
    
    
}
public int countConsistentStrings(String allowed, String[] words) {
    int count=0;
    
    
    
    for(int i=0; i < words.length; i++)
    {
    	
    	
    	for(int j =0; j < words[i].length() ; j++)
    	{
    		//if(allowed.contains(words[i].charAt(j)))
    		{
    			
    		}
    		//words[i].charAt(j)
    		
    		
    		
    	}
    }
    return count;
}
public boolean halvesAreAlike(String s) {
	
	int len = s.length();
	int mid= len/2;
	int c1=0;
	int c2=0;
	
	for(int i =0 ; i <=  mid-1; i++)
	{
		if(s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U' ||  s.charAt(i)=='a' || s.charAt(i)=='e' ||
				s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') 
						c1++;
		
	}

	
	for(int i =mid ; i <= len-1; i++)
	{
		if(s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U' ||  s.charAt(i)=='a' || s.charAt(i)=='e' ||
				s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') 
						c2++;
		
	}
	
	if(c1==c2)
		return true;
	else
		
		return false;
	
	
	
	
	
	
	
	//return false;
    
    
    
    
    
}





}

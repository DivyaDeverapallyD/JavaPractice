/**
 * 
 */
package objectsCalsses;

/**
 * @author Divya Deverapally
 *
 *
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MyObject myObject= new MyObject();
		MyObject myObject1= new MyObject(22L);
		
		MyObject myObject2= new MyObject(22L);
		
		if(myObject1.equals(myObject2))
			System.out.println("Are equal");
		else
			System.out.println("Not Equal");
		
		
		//System.out.println(myObject.equals(myObject1, myObject2));
		
		
	}

}

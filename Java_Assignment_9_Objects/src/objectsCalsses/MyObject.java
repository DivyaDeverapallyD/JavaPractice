/**
 * 
 */
package objectsCalsses;

/**
 * @author Divya Deverapally
 *
 *
 */
public class MyObject {

	long id;
	
	public MyObject(long id) {
		this.id=id;
	}
	
	public boolean equals(MyObject o)
	{
	if(o instanceof MyObject && o.id == this.id)
		return true;
	
	return false;
		
	}
}

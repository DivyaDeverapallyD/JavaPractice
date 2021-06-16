/**
 * 
 */
package three;

/**
 * @author Divya Deverapally
 *
 *
 */
public class TalkablePerson {
	String name;
	int age;
	
	TalkablePerson(String name, int age)
	{
		this.name= name;
		this.age=age;
	}
	public void talk()
	{
		System.out.println("Hello my name is : "+ name);
	}

}

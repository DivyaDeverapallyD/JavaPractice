/**
 * 
 */
package model;

/**
 * @author Divya Deverapally
 *
 *
 */
public class AwesomePerson extends Person{

	public AwesomePerson(){
		
		System.out.println("AwesomePerson constructor");
	}
	
	public void talk() {
		System.out.println(name+","+ age);
	}
	
}

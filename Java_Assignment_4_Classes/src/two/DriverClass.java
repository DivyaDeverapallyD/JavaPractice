/**
 * 
 */
package two;

import one.Person;

/**
 * @author Divya Deverapally
 *
 *
 */
public class DriverClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrivatePerson person = new PrivatePerson();
		person.setAge(27);
		person.setName("Divya");
		System.out.println(person.getName()+","+person.getAge());

	}

}

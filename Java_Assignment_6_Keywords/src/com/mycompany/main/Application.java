/**
 * 
 */
package com.mycompany.main;

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
		StaticClass.sumOfFloats(10.2f, 11.2f);
		System.out.println(FinalClass.myConstant);

		ConcreteClass concreteClass = new ConcreteClass();
		concreteClass.run();

	}

}

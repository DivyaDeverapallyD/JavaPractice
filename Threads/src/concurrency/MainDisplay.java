/**
 * 
 */
package concurrency;

/**
 * @author Divya Deverapally
 *
 *
 */
public class MainDisplay {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display d= new Display();
		String name="Divya";
MyThread t1= new MyThread(d, "Divya");
MyThread t2= new MyThread(d, "Sandeep");
MyThread t3= new MyThread(d, "Sindhu");
t1.start();
t3.start();
t2.start();
	}

}

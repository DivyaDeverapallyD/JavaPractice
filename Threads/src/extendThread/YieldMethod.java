/**
 * 
 */
package extendThread;

/**
 * @author Divya Deverapally
 *
 *
 */

class myYield extends Thread{
	public void run() {
		for(int i=0 ; i <5; i++)
		{
			System.out.println("Child thread");
			Thread.yield();
//If we comment above line, then both threads will be executed simultaneously
//If we wont comment, then child thread always call yield method and main thread will get chance for more times.
			}
	}
}
public class YieldMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myYield m= new myYield();
		m.start(); 
		for(int i =0; i < 5; i++)
		{
			System.out.println("main thread");
		}

	}

}

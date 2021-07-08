/**
 * 
 */
package extendThread;

/**
 * @author Divya Deverapally
 *
 *
 */

class MyDaemonThread extends Thread{
	public void run() {		
	}
}
public class DaemonDemo {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().isDaemon()); //false
		MyDaemonThread dt= new MyDaemonThread();
		System.out.println(dt.isDaemon()); //false
		dt.setDaemon(true);
		System.out.println(dt.isDaemon());//truep
	}

}

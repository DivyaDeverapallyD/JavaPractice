/**
 * 
 */
package concurrency;

/**
 * @author Divya Deverapally
 *
 *
 */
public class TryLockDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*TryLockThread t1= new TryLockThread("thread1");
		TryLockThread t2= new TryLockThread("thread2");
		t1.start();
		t2.start();
		*/
		TryLockWithArgs t1= new TryLockWithArgs("thread1");
		TryLockWithArgs t2= new TryLockWithArgs("thread2");
		t1.start();
		t2.start();

	}

}

/**
 * 
 */
package concurrency;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Divya Deverapally
 *
 *
 */
public class TryLockThread  extends Thread{
	
	static ReentrantLock lock= new ReentrantLock();
	 public  TryLockThread(String name){		 
	 }
		public void run() {
		if(lock.tryLock())
		{
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			}
			catch(Exception e){}
		
			lock.unlock();
		}
		else {
			System.out.println("else ");
			System.out.println(Thread.currentThread().getName());
		}
		
	}

}

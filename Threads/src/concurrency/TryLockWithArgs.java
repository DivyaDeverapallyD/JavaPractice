/**
 * 
 */
package concurrency;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Divya Deverapally
 *
 *
 */
public class TryLockWithArgs extends Thread {
	
	static ReentrantLock lock= new ReentrantLock();
	 public  TryLockWithArgs(String name){		 
	 }
	
	public void run() {
		
		do {
			try {
				if(lock.tryLock(1000, TimeUnit.MILLISECONDS))
				{
					System.out.println(Thread.currentThread().getName() +"---------got lock");
					 Thread.sleep(2000);
					 lock.unlock();
					 System.out.println(Thread.currentThread().getName() +"------------releases lock" );
					 break;
					
				}
				else {
					System.out.println("In else block ------" + Thread.currentThread().getName());
					
				}
			}
			catch(Exception e) {}
		}
		while(true);
	}

}

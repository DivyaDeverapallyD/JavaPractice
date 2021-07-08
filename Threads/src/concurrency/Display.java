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
public class Display {

	ReentrantLock reentrantLock= new ReentrantLock();
	
	public /*synchronized*/ void wish(String name)
	{
		//1  if we comment line 1 and 2, then the threads will be executed simultaneously and wll get irregukar output
		//If we uncmomment them , then the thread will get one by one and we will get regular output
		reentrantLock.lock(); 
		for(int i =0 ; i <5;i++)
		{
			System.out.print("Good Morning : ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name);
		}
		reentrantLock.unlock(); //2
	}
}

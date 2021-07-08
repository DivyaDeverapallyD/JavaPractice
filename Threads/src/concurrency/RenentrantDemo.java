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
public class RenentrantDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReentrantLock l= new ReentrantLock();
		l.lock();
		System.out.println(l.isLocked()); //true
		System.out.println(l.isHeldByCurrentThread());//true
		System.out.println(l.getHoldCount());//1
		l.lock();
		System.out.println(l.getHoldCount());//2
		l.unlock();
		System.out.println(l.getHoldCount());//1
		System.out.println(l.isFair()); //false
		System.out.println(l.isLocked());//true
		l.unlock();
		System.out.println(l.isLocked());//false
		System.out.println(l.getHoldCount());//0
		
		
		

	}

}

/**
 * 
 */
package extendThread;

/**
 * @author Divya Deverapally
 *
 *
 */

class MyRunnable1 implements Runnable{

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i =0 ; i <5; i++)
		{
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {}
			System.out.println("Thread Runnable 1--------------"+ Thread.currentThread().getName());
		}
		
		
	}
	
}

class MyRunnable2 implements Runnable{

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i =0 ; i <5; i++)
		{
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {}
			System.out.println("Threaddd Runnable 2--------"+ Thread.currentThread().getName());
		}
		
	}
	
}
public class HeavyWightThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1= new Thread(new MyRunnable1(), "Divya");
		Thread t2= new Thread(new MyRunnable2(), "Sandeep");
		t1.start();
		t2.start();

	}

}

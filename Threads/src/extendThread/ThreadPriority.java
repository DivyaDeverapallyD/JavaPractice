/**
 * 
 */
package extendThread;

/**
 * @author Divya Deverapally
 *
 *
 */
class MyThread2 extends Thread{	
	public void run() {		
		for(int i =0; i <2 ; i++)		
			System.out.println("Child thread");	
	}
}
public class ThreadPriority {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread2 m= new MyThread2();
		m.start();
		m.setPriority(10);
		System.out.println(m.getPriority()); //5
		System.out.println(Thread.currentThread().getPriority()); //5
		for(int i =0; i <2; i++)		
			System.out.println("main thread");	

	}

}

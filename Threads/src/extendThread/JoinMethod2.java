/**
 * 
 */
package extendThread;

/**
 * @author Divya Deverapally
 *
 *Child thread waits for main thread to complete
 *
 */
class JoinThread1 extends Thread{
	public static Thread mt;
	public void run() {
		
			try {
				mt.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for(int i =0; i <5 ; i++)
			{
			System.out.println("child thread");
		}
	}
}
public class JoinMethod2 {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		JoinThread1.mt=Thread.currentThread();
		JoinThread1 t= new JoinThread1();
		t.start();
		t.join();
		for(int i =0; i < 5;i++)
		{
			System.out.println("main thread");
		Thread.sleep(1000);
		}
		
	}

}

/**
 * 
 */
package extendThread;

/**
 * @author Divya Deverapally
 *
 *Main thread waits for child thread to complete
 */
class JoinThread extends Thread{
	public void run() {
		for(int i =0; i <5 ; i++)
		{
			System.out.println("child thread");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class JoinMethod {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		JoinThread t= new JoinThread();
		t.start();
		// main thread executes  below line of  code  and for loop  wont get executes  untill child thread completes
		t.join(); 
		t.join(100); // main thread waits for 100milliseonds
		for(int i =0; i < 5;i++)
		{
			System.out.println("main thraed");
		}
		
		
	}

}

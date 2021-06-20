/**
 * 
 */
package extendThread;

/**
 * @author Divya Deverapally
 *
 *
 */
class InterruptThread  extends Thread{
	public void  run() {
		try {
		for(int i =0 ; i < 5; i++)
	{
		System.out.println("child thread");
		
			Thread.sleep(2000);
		} 
		}catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("Interruped exception");			
		}
	
	}
}
public class InterruptThreadDemo {

	public static void main(String[] args) {
		InterruptThread mt= new InterruptThread();
		mt.start();
		mt.interrupt(); //If we comment child thread will executes completely
		System.out.println("main Thread");
		
	}
}

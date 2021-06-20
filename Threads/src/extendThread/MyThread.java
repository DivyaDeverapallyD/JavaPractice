/**
 * 
 */
package extendThread;

/**
 * @author Divya Deverapally
 *
 *
 */
public class MyThread extends Thread {  //"This id defining thread
	
	public void run()
	{
		for(int i =0 ; i < 4; i++)
		{
			System.out.println("This is thread's job");
		}
	}
	public void run(int a)
	{
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		MyThread mt= new MyThread(); //Thread Instantiation
		mt.start(); //starting of a thread
		mt.start(); // we get runtime exception IllegalThreadStateException
		mt.run(10);
	}

}

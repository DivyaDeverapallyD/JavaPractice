/**
 * 
 */
package extendThread;

/**
 * @author Divya Deverapally
 *
 *
 */
public class OverLoadRun {

	public void run()
	{
		for(int i =0 ; i < 4; i++)
		{
			System.out.println("This is thread's job");
		}
	}
	public void run(int a)
	{
		for(int i =0 ; i < 4; i++)
		{
			System.out.println("This is thread's job");
		}
	}
	public static void main(String[] args) {
		MyThread mt= new MyThread(); //Thread Instantiation
		mt.start(); //starting of a thread
		mt.run(10);
		
	}

}

/**
 * 
 */
package extendThread;

/**
 * @author Divya Deverapally
 *
 * In below example the order of execution will be same always using synchronized keyword
 * If we removes it, it varies always
 * 
 */

class Display{
	 
	public  static synchronized  void wish(String name)
	{
		
			for(int i =0 ; i < 5; i++)
			{
				System.out.print("hello: ");
				try {
				//	System.out.println(name);
				Thread.sleep(100);
				}
				catch(InterruptedException e)
				{
				}System.out.println(name);
					//System.out.println("CATCH"+name);
				
			}
		}
		
	}

class SynchThread extends Thread{
	Display d;
	String name;
	SynchThread(Display d, String name)
	{
		this.d=d;
		this.name=name;
	}
	
	public void run() {
	//	System.out.println(name);
		d.wish(this.name);
	}
	
}

public class SynchronizationDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display d= new Display();
		Display d1= new Display();
		SynchThread st= new SynchThread(d,"Divya");
		SynchThread st1= new SynchThread(d1,"NAVYA");
		
		st1.start();
		st.start();
	}

}

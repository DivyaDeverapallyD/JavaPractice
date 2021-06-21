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

class Display1{
	 
	public void wish(String name)
	{
		System.out.println("befor sync");
		synchronized (this) {
			
		
		
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
			System.out.println("after sync");
		}
		
	}

class SynchThread1 extends Thread{
	Display1 d;
	String name;
	SynchThread1(Display1 d, String name)
	{
		this.d=d;
		this.name=name;
	}
	
	public void run() {
	//	System.out.println(name);
		d.wish(this.name);
	}
	
}

public class SyncBlockDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display1 d= new Display1();
		Display1 d1= new Display1();
		SynchThread1 st= new SynchThread1(d,"Divya");
		SynchThread1 st1= new SynchThread1(d,"NAVYA");
		
		st1.start();
		st.start();
	}

}

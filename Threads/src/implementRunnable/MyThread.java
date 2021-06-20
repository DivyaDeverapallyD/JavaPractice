/**
 * 
 */
package implementRunnable;
class MyRunnable implements Runnable{

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i =0 ; i <5; i++)
		System.out.println("child thread");		
	}	
}
public class MyThread {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRunnable mr= new MyRunnable();
		
		Thread t= new Thread(mr);
		t.start();
		t.setName("Divya");
		System.out.println(t.getName());
		Thread.currentThread().setName("hell");
		System.out.println(Thread.currentThread().getName());
	//	Thread.currentThread().setName("sindhu");
		System.out.println(Thread.currentThread().getName());
	//	mr.run();
		for(int i =0; i<5;i++)
		System.out.println("main Thread");
	}

}

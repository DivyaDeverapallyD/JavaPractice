package extendThread;

/**
 * @author Divya Deverapally
 *
 *
 */
class MyThread1 extends Thread{
	public void start()
	{
		super.start();
		System.out.println("Start method");
	}
	public void run() {
		System.out.println("Run method");
	}
}

public class OverrideStart {

	public static void main(String[] args) {
		MyThread1 mt= new MyThread1(); //Thread Instantiation
		mt.start(); //starting of a thread
		System.out.println("main method");
		
		
	}
}

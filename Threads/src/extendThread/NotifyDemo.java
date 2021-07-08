/**
 * 
 */
package extendThread;

/**
 * @author Divya Deverapally
 *
 *
 */

class MyThread3 extends Thread {

	int sum = 0;

	public void run() {
		synchronized (this) {
			System.out.println("child start"); //2
			for (int i = 0; i <= 100; i++) {
				sum += i;
			}
			// System.out.println("child"+sum);
			System.out.println("child nitifying"); //3
			this.notify();
		}
		//only below code throws exception IllegalMonitorStateException
		/*
		 * for (int i = 0; i <= 100; i++) { sum += i; } //
		 * System.out.println("child"+sum); this.notify();
		 */
	}
}

public class NotifyDemo {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		MyThread3 m1 = new MyThread3();
		m1.start();
		// Thread.sleep(1000);
		// m1.wait(); 
		synchronized (m1) {
			System.out.println("main calling wait"); //1
			m1.wait();
			System.out.println("main got notify");//4
			System.out.println(m1.sum);//5
			System.out.println("main");//6

		}
		

	}

}

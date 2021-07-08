/**
 * 
 */
package extendThread;

/**
 * @author Divya Deverapally
 *
 *in below example, if we remove synch keyword for one methd, the
 *we pgrm wont enter deadlock situtaion.
 */
class A {

	public synchronized void d1(B b) {

		System.out.println("thread 1 - executionf of b1 method");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}

		System.out.println("calling B class last method");
		b.last();

	}
	
	public synchronized void last() {
		System.out.println("In A class last method");
	}
}

class B {
	public synchronized void d2( A a) {


		System.out.println(" thread 2 - execution of d2 method");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}

		System.out.println("calling A class last method");
		a.last();

	

	}

	public synchronized void last() {
		System.out.println("In B class last method");
	}
}

class MyThread5 extends Thread {
	A a= new A();
	B b = new B();
	
	public void m1() {
		this.start();a.d1(b); // executed by main thread
	}
	
	public void run() {
		b.d2(a); //executed by  child thread
	}
}

public class DeadLockDemo {
	public static void main(String[] args) {
		
		MyThread5 t1= new MyThread5();
		t1.m1();
	}

}

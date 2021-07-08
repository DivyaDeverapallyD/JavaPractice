/**
 * 
 */
package extendThread;

/**
 * @author Divya Deverapally
 *
 *
 */
public class ThreadGroupDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getThreadGroup().getName()); //main
		System.out.println(Thread.currentThread().getThreadGroup().getParent()); //java.lang.ThreadGroup[name=system,maxpri=10]
		ThreadGroup g1= new ThreadGroup("FirstGrp");
		ThreadGroup g2= new ThreadGroup(g1, "second thread");
	
		System.out.println("name : "+ g1.getName() +" Parent : "+ g1.getParent().getName()); //name : FirstGrp Parent : main
		System.out.println("name : "+ g2.getName() +" Parent : "+ g2.getParent().getName());//name : second thread Parent : FirstGrp
		
		Thread t1= new Thread(g1, "thread1");
		t1.setPriority(5);
		t1.start();
		
		Thread t2= new Thread(g1, "thread2");		
		g1.setMaxPriority(3);
		Thread t3= new Thread(g1, "thread2");
		System.out.println(t1.getPriority());     //5   
		System.out.println(t3.getPriority());     //3
	g1.list();
	ThreadGroup tg= Thread.currentThread().getThreadGroup().getParent();
	Thread[] tArray= new Thread[tg.activeCount()];
	System.out.println("================");
	tg.enumerate(tArray);
	 for(Thread th: tArray)
		  System.out.println(th.getName());
		/*
		 * ouput -Reference Handler
			Finalizer
			Signal Dispatcher
			Attach Listener
			main
			thread1*/

	}

}

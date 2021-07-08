/**
 * 
 */
package concurrency;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Divya Deverapally
 *
 *
 */

class PoolThread implements Runnable{
	String name;
	public PoolThread(String name)
	{
		this.name=name;
	}
	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println(name + "Job started by ----"+ Thread.currentThread().getName());
		try {			
			Thread.sleep(1000);
		}
		catch(Exception e) {}
		System.out.println(name+ Thread.currentThread().getName());		}
	
}
public class ThreadPoolDemo {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PoolThread[] jobs = {new PoolThread("Divya"),new PoolThread("Sandeep"),new PoolThread("Sindhu")};
		//one thread executes all jobs //if  2  two threads
		ExecutorService service= Executors.newFixedThreadPool(2); 
		for(PoolThread job : jobs)
		{
			service.submit(job);
		}
		service.shutdown();

	}

}

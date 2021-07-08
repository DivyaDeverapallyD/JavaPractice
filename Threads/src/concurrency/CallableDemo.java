/**
 * 
 */
package concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author Divya Deverapally
 *
 *
 */
class MyCallableThread implements Callable{
	
	int num;
	public /**
	 * 
	 */
	 MyCallableThread(int num) {
		// TODO Auto-generated constructor stub
		this.num=num;
	}
	
	
	/* (non-Javadoc)
	 * @see java.util.concurrent.Callable#call()
	 */
	@Override
	public Object call() throws Exception {
		
		int sum=0;
		System.out.println( "Job started by ----"+ Thread.currentThread().getName());
		
		for(int i=0; i<= num ; i++)
		{
			sum=sum+i;
		}
		
		return sum;
		}
}
public class CallableDemo {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		MyCallableThread[] jobs = {new MyCallableThread(10),new MyCallableThread(20),new MyCallableThread(30)};
		//one thread executes all jobs //if  2  two threads
		ExecutorService service= Executors.newFixedThreadPool(2); 
		for(MyCallableThread job : jobs)
		{
			Future f=service.submit(job);
			System.out.println("Future object is"+ f.get());
		}
		service.shutdown();
	}

}

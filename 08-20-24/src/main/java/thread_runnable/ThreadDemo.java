package thread_runnable;

import java.util.Iterator;

public class ThreadDemo extends Thread{

	private Thread t ;
	private String threadName ;
	
	public ThreadDemo(String name) {

		threadName = name ;
		System.out.println("Creating "+threadName);
	}
	
	public void run() {
		
		System.out.println("Running "+threadName);
		try {
			for(int i=3 ; i>0 ; i--) {
				
				System.out.println("Thread: "+threadName+" , "+i);
			
				Thread.sleep(1000);
		    } 
		}
		catch (InterruptedException e) {
				
			System.out.println("Thread "+threadName+ " interrupted ,");
		}
		
		System.out.println("Thread "+threadName+ " exiting..");
	}
}
	
	


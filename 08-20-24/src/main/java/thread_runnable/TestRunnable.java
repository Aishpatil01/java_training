package thread_runnable;

public class TestRunnable {

	public static void main(String[] args) {
		
		RunnableDemo r1 = new RunnableDemo("Thread1");
		Thread t1 = new Thread(r1); //passing an instance of runnable to thread constructor
		t1.start();
		
		RunnableDemo r2 = new RunnableDemo("Thread2");
		Thread t2 = new Thread(r2);
		t2.start();
	}
}

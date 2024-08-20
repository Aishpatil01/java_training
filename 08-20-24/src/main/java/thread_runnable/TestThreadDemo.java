package thread_runnable;

public class TestThreadDemo {

	public static void main(String[] args) {
		
		ThreadDemo t1 = new ThreadDemo("Thread1");
		//t1.start();   //started or runnable
		t1.run();
		
		ThreadDemo t2 = new ThreadDemo("Thread2");
		t2.start();
	}
}

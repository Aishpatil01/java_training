package thread_pc;

public class Main {

	public static void main(String[] args) {
		
		// initially, there needs to be some data in order to consume the data
		Producer p = new Producer();
		Consumer c = new Consumer(p);
		
		Thread t1 = new Thread(p);
		Thread t2 = new Thread(c);
		
		t2.start();
		t1.start();
	
	}
}

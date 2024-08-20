package thread_livelock;

public class Main {

	static final Police police = new Police();
	static final Criminal criminal = new Criminal();
	
	private static Thread t1 ;
	private static Thread t2 ;
	
	public static void main(String[] args) throws InterruptedException{
		
		t1 = new Thread(() -> {
			t1.setName("Thread1");
			
			try {
				
				police.giveRansom(criminal);
			} 
			catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		});
		t1.start();
		
		t2 = new Thread(() -> {
			t2.setName("Thread2");
			
			try {
				
				criminal.releaseHostage(police);
			} 
			catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		});
		t2.start();
		
		for (int i = 0; i <= 10; i++) {
			
		      System.out.print("-----------------\n" +
		          "Name: " + t1.getName() + "\n" +
		          "State: " + t1.getState() + "\n" +
		          "-----------------\n");

		      System.out.print("-----------------\n" +
		          "Name: " + t2.getName() + "\n" +
		          "State: " + t2.getState() + "\n" +
		          "-----------------\n");
		      Thread.sleep(2000);
		    }
	}
}

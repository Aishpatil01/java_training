package thread_deadlock;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		Friend f1 = new Friend("Rohit");
		Friend f2 = new Friend("Virat");
		
		Thread t1 = new Thread(() -> {
			
			f1.bow(f2);
		});
		
        Thread t2 = new Thread(() -> {
			
			f2.bow(f1);
		});
        
        t1.start();
        t2.start();
        
        for(int i=0 ; i<=5 ; i++) {
        	
        	Thread.sleep(2000);
        	
        	System.out.println(t1.getName() + "- State:" + t1.getState() + " & IsAlive:" + t1.isAlive());
            System.out.println(t2.getName() + "- State:" + t2.getState() + " & IsAlive:" + t2.isAlive());
        }
	}
}

package thread_synchronized;

public class Main {

	int value = 0 ;
	
	public static void main(String[] args) {
		
		Main obj = new Main();
		
		Thread t1 = new Thread(() -> {
			try {
				
				obj.updateValueFiveTimesByAddingOne();
			} 
			catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
		Thread t2 = new Thread(() -> {
			try {
				
				obj.updateValueFiveTimesByAddingTwo();
			} 
			catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
		t1.start();
		t2.start();
	}
	
	//using synchronized method
	public synchronized void updateValueFiveTimesByAddingOne() throws InterruptedException {
		
		System.out.println("Print statement before addingOne loop");
		
		//using synchronized block
		/*
		synchronized (this) {
			
			for(int i=1 ; i<=5 ; i++) {
				
				System.out.println(++value);
				Thread.sleep(1000);
			}
		}
		*/
		
		for(int i=1 ; i<=5 ; i++) {
			
			System.out.println(++value);
			Thread.sleep(1000);
		}
		
		System.out.println("Print statement after addingOne loop");
	}
	
	//using synchronized method
	public synchronized void updateValueFiveTimesByAddingTwo() throws InterruptedException {
		
		System.out.println("Print statement before addingTwo loop");
		
		//using synchronized block
		/*
		synchronized (this) {
			
			for(int i=1 ; i<=5 ; i++) {
				
				value += 2 ;
				System.out.println(value);
				Thread.sleep(1000);
			}
		}
		*/
		
		for(int i=1 ; i<=5 ; i++) {
			
			value += 2 ;
			System.out.println(value);
			Thread.sleep(1000);
		}
		
		System.out.println("Print statement after addingTwo loop");
	}
}

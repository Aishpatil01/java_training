package thread_pc;

public class Producer extends Thread{

	StringBuffer buffer ;
	boolean dp = false ;
	
	Producer(){
		
		buffer = new StringBuffer(4);
	}
	
	@Override
	public void run() {
		
		synchronized (buffer) {
			
			for(int i=0 ; i<4 ; i++) {
				
				buffer.append(i);
				System.out.println("Produced " + i);
			}
			
			System.out.println("Buffer is full");
			buffer.notify();
		}
	}
}

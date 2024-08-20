package thread_pc;

public class Consumer extends Thread{

	Producer p ;
	
	Consumer(Producer temp){
		
		p = temp ;
	}
	
	@Override
	public void run() {
		
		synchronized (p.buffer) {
			
			try {
				p.buffer.wait();
			} 
			catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			for(int i=0 ; i<4 ; i++) {
				
				System.out.println(p.buffer.charAt(i)+" ");
			}
			
			System.out.println("Buffer is empty");
		}
	}
}

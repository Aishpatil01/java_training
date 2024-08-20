package thread_livelock;

public class Criminal {

	private boolean hostageReleased = false ;
	
	public synchronized void releaseHostage(Police police) throws InterruptedException {
		
		while(!police.isRansomSent()) {
			
			System.out.println("Criminal: waiting for police to give ransom");
			
			Thread.sleep(2000);
		}
		
		System.out.println("Criminal: Releasing hostage");
		this.hostageReleased = true ;
	}

	public boolean isHostageReleased() {
		
		return this.hostageReleased;
	}
}

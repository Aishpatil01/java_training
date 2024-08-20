package thread_livelock;

public class Police {

	private boolean ransomSent = false ;
	
	public synchronized void giveRansom(Criminal criminal) throws InterruptedException {
		
		while(!criminal.isHostageReleased()) {
			
			System.out.println("Police: waiting for criminal to release hostage");
			
			Thread.sleep(2000);
		}
		
		System.out.println("Police: sent ransom");
		this.ransomSent = true ;
	}

	public boolean isRansomSent() {

		return this.ransomSent;
	}
}

package thread_deadlock;

public class Friend {

	private String name;

	public Friend(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		
		return this.name ;
	}
	
	public synchronized void bow(Friend bower) {
		
		System.out.format("%s: %s"+ " has bowed to me!%n" , this.name , bower.getName());
		
		System.out.println(Thread.currentThread().getName() + " holds lock on " + this.name + " ? " 
				+ Thread.holdsLock(this)+" \n " + Thread.currentThread().getName()+" holda lock on " + bower.name +
				"?" + Thread.holdsLock(bower));
		
		bower.bowBack(bower);
	}

	public synchronized void bowBack(Friend bower) {

		System.out.format("%s: %s" + " has bowed back to me!%n",
                this.name, bower.getName());
	}
}

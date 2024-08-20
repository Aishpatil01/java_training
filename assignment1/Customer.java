package assignment1;

public class Customer {

	final int id = 101 ;
	static String name ;
	static long phone ;
	static String email ;
	static String address ;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	public Customer(String name , long phone) {

		this.name = name ;
		this.phone = phone ;
	}
	
	public Customer(String email , String address) {

		this.email = email ;
		this.address = address ;
	}
	
	public static void demo() {
		
		System.out.println("Welcome!!");
	}
	
	public static void demo(String menu) {
		
		System.out.println("I love vadapav...");
	}
	
	public static void main(String[] args) {
		
	}
}

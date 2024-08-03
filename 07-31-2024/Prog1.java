// Take values of length and breadth of a rectangle from user and check if it is square or not.

package assignment2;

import java.util.Scanner ;
public class Prog1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the length: ");
		double length = scanner.nextDouble();
		
		System.out.println("Enter the breadth: ");
		double breadth = scanner.nextDouble();
		
		check(length, breadth);
	}
	
	public static void check(double length , double breadth) {
		
		if (length == breadth) {
			
			System.out.println("It is a square...");
		} 
		else {

			System.out.println("It is not a square...");
		}
	}
}

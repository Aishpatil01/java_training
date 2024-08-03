/* 
 *  A student will not be allowed to sit in exam if his/her attendence is less than 75%.
Take following input from user
Number of classes held
Number of classes attended.
And print
percentage of class attended
Is student is allowed to sit in exam or not.
allow student to sit if he/she has medical cause. Ask user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly.
 */


package assignment2;

import java.util.Scanner ;
public class Prog3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Eneter the no of classes held: ");
		int class_held = scanner.nextInt();
		
		System.out.println("Eneter the no of classes attended: ");
		int class_attend = scanner.nextInt();
		
		System.out.println("Reason: Medical Cause");
		char cause = scanner.next().charAt(0);
		
		float attendence = ((class_held*class_attend)/100) ;
		
		if (cause == 'Y' || cause == 'y') {
			
			System.out.println("You are allowed to sit in the exam.");
		}
		else if(cause == 'N' || cause == 'n') {
			
			System.out.println(attendence);
			
			if (attendence<75) {
				
				System.out.println("You are not allowed to sit in the exam.");
			}
		}
	}
}

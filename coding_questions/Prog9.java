//Write a program to calculate the sum of the digits of a 3-digit number.

package coding_questions;

import java.util.Scanner;
public class Prog9 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a 3 digit number: ");
		int num = scanner.nextInt();
		
		System.out.println("The sum is: " + sum(num));
	}
	
	public static int sum(int num) {
		
		int sum = 0 ;
		if (num>=100 && num<=999) {
			
			while(num>0) {
				
				sum += num%10 ;
				num /= 10 ;
			}
			
		}
		else {
			
			System.out.println("Please enter 3 digit number...");
		}
		return sum ;
	}
}

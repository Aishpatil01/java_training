//Write a program to calculate the sum of the first and the second last digit of a 5 digit

package coding_questions;

import java.util.Scanner;
public class Prog8 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a 5 digit number: ");
		int num = scanner.nextInt();
		
		int firstDigit = num/10000 ;
		int secondLastDigit = (num/10)%10 ;
		
		int sum = firstDigit + secondLastDigit ;
		System.out.println("The sum is: " + sum);
	}
}

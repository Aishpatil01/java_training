package coding_questions;

import java.util.Scanner;
public class Prog10 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int num = scanner.nextInt();
		
		System.out.println("The reverse number is: " + revese(num));
	}
	
	public static int revese(int num) {
		
		int reverse = 0 ;
		while(num>0) {
			
			reverse = reverse*10 + num%10 ;
			num = num/10 ;
		}
		
		return reverse ;
	}
}

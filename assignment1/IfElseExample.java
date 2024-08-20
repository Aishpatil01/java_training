package assignment1;

import java.util.Scanner;

public class IfElseExample {

	public static void main(String[] args) {
		
		System.out.println("Please enter your age: ");
		
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		
		if(age >= 18) {
			
			System.out.println("You are eligible to vote...");
		}
		else {
			
			System.out.println("You are not eligible...");
		}
	}
}

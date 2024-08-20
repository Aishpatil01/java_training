package assignment1;

import java.util.Scanner;
public class IfElseIfExample {

	public static void main(String[] args) {
		
		System.out.println("Please enter your marks: ");
		
		Scanner scanner = new Scanner(System.in);
		double marks = scanner.nextDouble();
		
		if (marks >= 75) {
			
			System.out.println("Excellent!!");
		}
		else if (marks>=35 && marks<75) {
			
			System.out.println("Good");
		}
		else {
			
			System.out.println("Fail");
	}
}
}

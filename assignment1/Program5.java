//Write a program to search for the greatest of three numbers using Short-circuit Operators and print the result

package assignment1;

import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter first number: ");
		int num1 = scanner.nextInt();

		System.out.println("Enter second number: ");
		int num2 = scanner.nextInt();

		System.out.println("Enter third number: ");
		int num3 = scanner.nextInt();
	
		boolean isNum1Greater = (num1 >= num2) && (num1 >= num3);
		boolean isNum2Greater = (num2 > num1) && (num2 >= num3);
		boolean isNum3Greater = (num3 > num1) && (num3 > num2);

		if (isNum1Greater) {

			System.out.println("Num1 is the greatest: " + num1);
		} 
		else if (isNum2Greater) {

			System.out.println("Num2 is the greatest: " + num2);
		} 
		else if (isNum3Greater) {

			System.out.println("Num3 is the greatest: " + num3);
		}
	
}
}

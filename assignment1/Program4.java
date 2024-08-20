//Write a program to add, subtract, multiply and divide two non zero hard-coded numbers

package assignment1;

import java.util.Scanner;
public class Program4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the num1: ");
		int num1 = scanner.nextInt();
		
		System.out.println("Enter the num2: ");
		int num2 = scanner.nextInt();
		
		System.out.println("The sum is: " + add(num1, num2));
		System.out.println("The difference is: " + subtract(num1, num2));
		System.out.println("The multiplication is: " + multiply(num1, num2));
		System.out.println("The division is: " + divide(num1, num2));
		
	}
	
    public static int add(int a , int b) {
		
		return  a+b ;
	}
	
	public static int subtract(int a , int b) {
		
		return a-b ;
	}
	
	public static int multiply(int p , int q) {
		
		return p*q ;
	}
	
	public static int divide(int p , int q) {
		
		if (q != 0) {
			
			return p/q ;
		} 
		else {
			
			return (Integer) null ;
		}
	}
	
}

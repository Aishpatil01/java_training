package coding_questions;

import java.util.Scanner;
public class Prog2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter length of 1st side: ");
		float l1 = scanner.nextFloat();
		
		System.out.println("Enter length of 2nd side: ");
		float l2 = scanner.nextFloat();
		
		System.out.println("Enter length of 3rd side: ");
		float l3 = scanner.nextFloat();
		
		System.out.println("The perimeter of triangle is: " + perimeterOfTriangle(l1, l2, l3));
	}
	
	public static float perimeterOfTriangle(float a , float b , float c) {
		
		return a+b+c ;
	}
}

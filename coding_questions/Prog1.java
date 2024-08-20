//1. Write a program to calculate the area and perimeter of the rectangle. Input Length and breadth using command line arguments.

package coding_questions;
import java.util.Scanner;

public class Prog1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length: ");
		int length = scanner.nextInt();
		
		System.out.println("Enter the height: ");
		int height = scanner.nextInt();
		
		System.out.println("The area of rectangle is: "+ areaOfRectangle(length, height));
		System.out.println("The perimeter of rectangle is: " + perimeterOfRectangle(length, height));
	}
	
	public static int areaOfRectangle(int width , int height) {
		
		int area = width * height ;
		return area ;
	}
	
	public static double perimeterOfRectangle(double width , double height) {
		
		double perimeter = 2*(width + height) ;
		return perimeter ;
	}
}

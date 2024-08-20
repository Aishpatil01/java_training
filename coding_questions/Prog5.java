/*
 5. Suppose the values of variables 'a' and 'b' are 6 and 8 respectively, write two programs to swap the values of the two variables.
   A - first program by using a third variable
   B - second program without using any third variable
*/

package coding_questions;

import java.util.Scanner;
public class Prog5 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		//System.out.println("After swapping: " + swap(a, b));
	}
	
	public static void swap(int a , int b) {
		
		int temp = a ;
		a = b ;
		b = temp ;
	}
}

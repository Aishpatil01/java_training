/*  4. Input the marks of Robert in three subjects using Scanner (each out of 100 ), write a program to calculate his 
total marks and percentage marks.
*/

package coding_questions;

import java.util.Scanner;

public class Prog4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		final int marks = 100;

		System.out.println("Enter the marks of 1st subject: ");
		double s1 = scanner.nextDouble();

		System.out.println("Enter the marks of 2nd subject: ");
		double s2 = scanner.nextDouble();

		System.out.println("Enter the marks of 3rd subject: ");
		double s3 = scanner.nextDouble();

		System.out.println("Total marks are: " + totalMarks(s1, s2, s3));
		System.out.println("Percentage marks are: " + percentageMarks(s1, s2, s3));
	}

	public static double totalMarks(double s1, double s2, double s3) {

		double total = s1 + s2 + s3;
		return total;
	}

	public static double percentageMarks(double s1, double s2, double s3) {

		double percentage = ((totalMarks(s1, s2, s3) * 100)/300);
		return percentage;
	}
}

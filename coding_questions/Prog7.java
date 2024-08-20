/*
 * The total number of students in a class are 90 out of which 45 are boys. If 50% of the total students secured grade 'A' 
 * out of which 20 are boys, then write a program to calculate the total number of girls getting grade 'A'.
 */

package coding_questions;

public class Prog7 {

	public static void main(String[] args) {
	
		int totalStudents = 90 ;
		int totalBoys  = 45 ;
		
		int totalGradeAStudents = (int)(totalStudents * 0.5);
		int gradeABoys = 20 ;
		int gradeAGirls = totalGradeAStudents - gradeABoys ;
		
		System.out.println("The total number of girls having grade A is: " + gradeAGirls);
	}
	
}

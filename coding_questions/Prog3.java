/* 3. Write a program to add 8 to the number 2345 and then divide it by 3. Now, the modulus of the quotient is taken with 5 and 
then multiply the resultant value by 5. Display the final result.
*/

package coding_questions;

public class Prog3 {

	public static void main(String[] args) {
		
		System.out.println("The result is: " + modulus(8, 2345));
	}
	
	public static int modulus(int a , int b) {
		
		int res = (((a+b)/3)%5)*5 ;
		return res ;
	}
}

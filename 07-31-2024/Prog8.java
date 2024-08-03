/*
 * A three digit number is called Armstrong number if sum of cube of its digit is equal to number itself.
E.g.- 153 is an Armstrong number because (13)+(53)+(33) = 153.
Write all Armstrong numbers between 100 to 500.
 * 
 */

package assignment2;

import java.util.Scanner;
public class Prog8 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

		for (int i = 100; i < 500; i++) {
            int originalNum = i;
            int sum = 0;

            while (i > 0) {
                int digit = i % 10;
                sum += digit * digit * digit;
                i /= 10;
            }

            if (sum == originalNum) {
                System.out.println(originalNum + " is an Armstrong number.");
            }

            i = originalNum;
        }
	}
}

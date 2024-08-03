/*
 * Print the following patterns using loop :
  a.
     *
     **
     ***
     **** 
     
   b.
      1010101
       10101 
        101  
         1

 */

package assignment2;

public class Prog5 {

	public static void main(String[] args) {
		
		//for star pattern
		int n = 4 ;

		for (int i=0 ; i<n ; i++ )
		{
			for (int j=0 ; j<=i ; j++ )
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
		/*
		//for digit pattern
		for (int i = 7; i >= 1; i -= 2) {
			
            for (int j = 1; j <= i; j++) {
            	
                System.out.print("1");
            }
            System.out.println("0");
        }
        */
	}
}

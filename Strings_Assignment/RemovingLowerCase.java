package AssignMentStrings;

import java.util.Scanner;

public class RemovingLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String with Lower Case letters   : ");
		String s = sc.nextLine();
		
//		String s = "jAvA DeVeloPer";
		StringBuilder sb = new StringBuilder();
		for(int x = 0 ; x  < s.length() ; x++) {
			if((int)s.charAt(x) >=97 && (int)s.charAt(x)<=122) {
				continue;
			}
			else {
				
				sb.append(s.charAt(x)); //Here we are not removing Space because the Question output doesn't
				
			}
		}
		System.out.print("\nAfter Removing Lower case  Letters  : " + sb.toString());
		
		
		
	}

}/*
. Removing Small Letters
Write a program to remove all lowercase letters from a string.
Input: s = "jAvA DeVeloPer"
Expected Output: "ADA DVP"

*/

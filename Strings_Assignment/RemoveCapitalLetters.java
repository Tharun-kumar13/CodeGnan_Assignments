package AssignMentStrings;

import java.util.*;

public class RemoveCapitalLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String with Capitals  : ");
		String s = sc.nextLine();
		
//		String s = "jAvA DeVeloPer";
		StringBuilder sb = new StringBuilder();
		for(int x = 0 ; x  < s.length() ; x++) {
			if((int)s.charAt(x) >=65 && (int)s.charAt(x)<=90) {
				continue;
			}
			else {
				if(s.charAt(x)==' ') {
					continue;
				}
				sb.append(s.charAt(x));
				
			}
		}
		System.out.print("\nAfter Removing Capital Letters  : " + sb.toString());
		
		
		
	}

}
/*

Write a program to remove all uppercase letters from a string.
Input: s = "jAvA DeVeloPer"
Expected Output: "jveloer"



*/
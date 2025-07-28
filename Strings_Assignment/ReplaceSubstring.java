package AssignMentStrings;

import java.util.*;

public class ReplaceSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String s = sc.nextLine();
		System.out.print("String You Entered  : " + s);
		s=s.toLowerCase();
		System.out.print("\nEnter the String to be replaced  : ");
		String s2 =sc.nextLine().toLowerCase();
		System.out.print("\nEnter the String to replace : ");
		String r = sc.nextLine().toLowerCase();
		
		String[] words  = s.split(" ");
		StringBuffer sb = new StringBuffer();
		for(String x : words) {
			if(x.equals(s2)) {
				sb.append(" " + r);
			}
			else {
				sb.append(" " + x);
			}
		}
		System.out.print("\nAfter word Replacment  : " + sb.toString().trim());

	}

}
/*

Replacing Substrings
Write a program to replace "java" with "core java" in the given string.
Input: s = "java development"
Expected Output: "core java development"


*/
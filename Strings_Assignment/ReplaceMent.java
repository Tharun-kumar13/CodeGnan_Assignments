package AssignMentStrings;

import java.util.*;

public class ReplaceMent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String  s = sc.nextLine();
		
		System.out.print("Enter the  char you want to replace  :  ");
		char ch  = sc.nextLine().trim().charAt(0);
		
		System.out.print("Enter the replacement char  :  ");
		char ch1  = sc.nextLine().trim().charAt(0);
		
		s=s.replace(ch, ch1);
		System.out.print("After Replacement : "  + s);
		

	}

}
/*

Replacing Characters in a String
Write a program to replace all occurrences of 'e' with 'a' in the given string.
Input: s = "java development"
Expected Output: "java davalopmant

*/
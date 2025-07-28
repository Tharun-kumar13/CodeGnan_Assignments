package AssignMentStrings;

import java.util.*;

//Most Optimal Way with best Space complexity

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String to check for Palindrome : ");
		String s = sc.nextLine().toLowerCase();
		int  n = s.length();
		int j=n-1;
		for(int x = 0 ; x < n/2 ; x++) {
			System.out.print("\ncomparing  : " + s.charAt(j) + " " + s.charAt(x) + " ");

			if(s.charAt(x)==s.charAt(j)) {
				j--;
			}
			else {
				System.out.print("\n" + s + " is Not Palindrome ....");
				return;
			}
		}
		System.out.print("\n" + s + "  Is Palindrome");

	}

	
}
/*

4. Checking for Palindrome
Write a program to check whether a given string is a palindrome.
Input:
a. "madam"
b. "Mom"


*/
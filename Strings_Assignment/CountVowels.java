package AssignMentStrings;

import java.util.*;

public class CountVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String s= sc.nextLine();
		
		String vowels ="aeiou";
		int count =0;
		for(int x = 0 ; x < s.length() ; x++) {
			if(vowels.contains(String.valueOf(s.charAt(x)))){
				System.out.print(s.charAt(x) + " ");
				count++;
				
			}
		}
		System.out.print("\nCount of Vowels : " + count);


	}

}
/*
Write a program to find lowercase vowels from the given string and display both the vowels
and their count.
Input: s = "javadev"
Expected Output:
● Vowels: a, a, e
● Count: 3

*/
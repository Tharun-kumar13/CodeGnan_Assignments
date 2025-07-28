package AssignMentStrings;

import java.util.Scanner;

import java.util.*;
public class RemovingVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //String s = "ja123vaDEveloper";
		 //Expected Output: "j123vDvlpr"
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String with Vowels   : ");
		String s = sc.nextLine();
		
		 String vowels = "aeiouAEIOU";
		 StringBuilder sb=  new StringBuilder();
		 for(int x = 0 ; x <s.length(); x++) {
			 if(vowels.contains(s.subSequence(x, x+1))) {
				 //s.replace(s.subSequence(x, x+1) ,""); I thought it will replace that vowel with nothing but it does'nt word ufff
				 continue;
			 }else {
				 sb.append(s.charAt(x));
			 }
		 }
		 System.out.print("String Afte removing VOWELS   :  " + sb.toString());
		 
		
		
	}

}
/*
 * 13. Removing Vowels
Write a program to remove all vowels from a string.
 Input: s = "ja123vaDEveloper"
 Expected Output: "j123vDvlpr"
 */

package AssignMentStrings;

import java.util.Arrays;
import java.util.*;
public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter String 1 : ");
		String s = sc.nextLine().toLowerCase();
		System.out.print("Enter String 2 : ");
		String s2 = sc.nextLine().toLowerCase();
		//String s = "mug";
		//String s2="gum";
		
		
		if(s.length()!=s2.length()) {
			System.out.print("\n" + s + " and " + s2 + " are Not Anagrams");
			return;
		}
		
		String[] words1 = s.split("");
		Arrays.sort(words1);
		String[] words2  =s2.split("");
		Arrays.sort(words2);
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		
		for(String x : words1) {
			sb1.append(x);
		}
		for(String x : words2) {
			sb2.append(x);
		}
		if(sb1.toString().equals(sb2.toString())) {
			System.out.print("\n" + s + " and " + s2 + " are Anagrams");
		}
		else {
			System.out.print("\n" + s + " and " + s2 + " are Not Anagrams");

			
		}
	
		/*
		 * 
		 * YOU can use Easy  In built Array Method like 
		 * if (Arrays.equals(words1, words2)) {
			System.out.print("\n" + s + " and " + s2 + " are Anagrams");
            } else {
			System.out.print("\n" + s + " and " + s2 + " are Not Anagrams");
            }
		 * 
		 * 
		 */
		

	}

}

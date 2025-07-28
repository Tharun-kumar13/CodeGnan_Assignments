package AssignMentStrings;

import java.util.*;

public class FrequncyOfword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String str1 = "we work to live and live to be happy live live"; 
		//String word1 = "live";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String  : ");
		String  str1 = sc.nextLine();
		System.out.print("Enter the word : ");
		String word1 = sc.nextLine().trim();
		
		String[] words = str1.trim().split(" ");
		int count = 0;
		for(String x : words) {
			if(x.equals(word1)) {
				count++;
			}
		}
		System.out.print("frequency of the Words given  ' " + word1  + " '  is : " + count);


	}

}

/*
Write a program to count the frequency of a given substring in a string.
 Input:
String str1 = "we work to live and live to be happy live";  
String word1 = "live";

*/
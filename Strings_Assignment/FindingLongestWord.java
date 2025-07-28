package AssignMentStrings;

import java.util.*;

public class FindingLongestWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String s = "I am a javadeveloper";
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the String : ");
		String s = sc.nextLine();
		
		String[] words= s.split(" ");
		for(String x : words ) {
			
		}
		String s2 ="";
		int max=0;
		for(String x : words) {
			StringBuffer sb = new StringBuffer(x);
			if(sb.toString().length() > max){
				max = sb.toString().length();
				s2=sb.toString();

			}
			
		}
		System.out.print("Max Length Word  : " + s2  + "  with lenth " + s2.length());


	}

}


/*
Finding the Longest Word
Write a program to find the longest word in a string.
 Input: s = "I am a java developer"
 Expected Output: "developer
*/
package AssignMentStrings;

import java.util.Scanner;
import java.util.*;


public class UniqueCharecters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter the Sentence : ");
		String s  = sc.nextLine().toLowerCase();
		
		String s2="";
		
		for(int x = 0 ; x < s.length() ; x++) {
			char ch = s.charAt(x);
			if(s2.indexOf(ch)==-1) { // -1 means indicates that the element was not present in it.
				s2+=ch;
				
			}
			
		
		}
		System.out.print("String : " + s2);
		
		
		/*
		 * FOR BETTER  SPACE COMPLEXITY USE StringBuffer 
		 * 
		 * StringBuffer sb = new StringBuffer();
		  for(int x= 0 ;x <s.length() ; x++) {
				char ch = s.charAt(x);
				if(sb.indexOf(String.valueOf(ch))==-1) {
					sb.append(ch);
				}
			  
		  }
			System.out.print("\nString using StringBuffer: " + sb.toString());
		 * 
		 * This version is more efficient because StringBuffer avoids 
		 * creating new string objects on each character append.
		 */
		

	}

}

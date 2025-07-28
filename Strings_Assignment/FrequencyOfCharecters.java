package AssignMentStrings;

import java.util.*;

public class FrequencyOfCharecters {

	public static void main(String[] args) {
		/*
		 * Write a program to count the frequency of each character in a given string.
 Input: s = "javadev"
		 */
		
		Scanner sc   = new Scanner(System.in);
		//String s = "javadev";
		System.out.print("Enter a String to calculate frequency : ");
		String s = sc.nextLine();
		s=s.toUpperCase();
		for(int x ='A' ; x <='Z' ; x++) {
			int c=0;
			for(int y = 0 ; y < s.length() ; y++) {
				if(x==s.charAt(y)) {
					c++;
				}
			}
			if(c>=1) {
				System.out.print("Frequency  of : " + ((char)x) + "  "+c  + "\n");

			}
		}
		
	
		/*
		 * 
		 * Not accurate ...thinked tooo much heheheheheh....
		 * 
		 * String[] words = s.split("");

		 * for(String x : words) {
			int c=0;
			for(int y= 0 ; y<s.length()  ;y++) {
				if(x.equals(s.subSequence(y, y+1))) {
					c+=1;
				}
			}
			System.out.print("Count of : " + x + " "+c  + "\n");
			
			
		}
		*/
		
		
	}
	
}

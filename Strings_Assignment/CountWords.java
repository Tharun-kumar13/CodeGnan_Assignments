package AssignMentStrings;

import java.util.*;
public class CountWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter the Sentence : ");
		String s  = sc.nextLine();
		
		String[] words  = s.split(" ");
		int c=0;
		for(String w : words) {
			c++;
		}
		System.out.print("\nWords In The String : " + c);

	}

}

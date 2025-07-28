package AssignMentStrings;

import java.util.*;

public class ReverseStringWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//String s = " i love Java";
		System.out.print("Enter the String : ");
		String s = sc.nextLine();
		
		String[] words  = s.trim().split(" ");
		System.out.print("Reverse of the given String : ");
		for(int x = words.length -1 ;x>=0 ; x--) {
			System.out.print(words[x] + " ");
		}

	}

}

package AssignMentStrings;

import java.util.*;

public class ReversingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter String : ");
		String s = sc.nextLine();
		StringBuffer sb = new StringBuffer(s);//Using StringBuffer makes it more efficient and Gives Best Space complexity
		int i=0;
		int j = s.length()-1;
		
		for(int x = 0 ; x < s.length()/2 ; x++) {
			char chx = sb.charAt(x); 
			char chy = sb.charAt(j);
			sb.setCharAt(x, chy);
			sb.setCharAt(j, chx);
			j--;
		}
		System.out.print("Reversed of that String : " + sb);
		

	}

}

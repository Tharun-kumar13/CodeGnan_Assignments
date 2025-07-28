package AssignMentStrings;


import java.util.*;

public class RemovingDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String With Digits : ");
		String s = sc.nextLine();
		//Expected Output: "javaDEveloper"
		String num = "1234567890";
		StringBuilder sb= new StringBuilder();
		for(int x = 0 ; x < s.length() ; x++) {
			if(num.indexOf(s.charAt(x))==-1) {
			sb.append(s.charAt(x));
			}
		}
		System.out.print("\nString After Removing Digits : " + sb.toString());

	}

}
/*
Write a program to remove all digits from a string.
Input: s = "ja123vaDEveloper"
Expected Output: "javaDEveloper"


*/
package AssignMentStrings;
import java.util.*;

public class ReverseWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter the String we want to reverse : ");
		String s = sc.nextLine();
		String[] words = s.trim().split(" ");
		String res="";
		for(String x : words) {
			StringBuffer sb = new StringBuffer(x);
			res+= sb.reverse().toString() + " ";
			
		}
		System.out.print("Reversed words in String  :  " + res);

	}

}

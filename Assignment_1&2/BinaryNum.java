package AssignMents;


import java.util.*;

public class BinaryNum {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = sc.nextInt();
		int n2 =n ;
		String s ="";
		while(n > 0) {
			int r = n%2;
			s=r+s;
			n/=2;
		}
		//StringBuffer sb  = new StringBuffer(s); if we use s+=r we need to use StringBuffer
		//System.out.println("BInary Number for " + n2 + " is " +  sb.reverse().toString());
		System.out.print("BInary Number for " + n2 + " is " +  s);

		
		
	
		
		
		
	}

}

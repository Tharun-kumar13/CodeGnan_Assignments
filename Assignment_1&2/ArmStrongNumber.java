package AssignMents;

import java.util.*;

public class ArmStrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number  : ");
		int n = sc.nextInt();
		int n2=n;
		String s = Integer.toString(n);
		int l = s.length();

		
		int sum=0;
		
	/*	while(n > 0) {
			int r = n %10;
			sum+=Math.pow(r ,l);
			n=n/10;
		}
		
		*/
		while(n>0) {
			int r = n %10;
			int m = l;
			int pro=1;
			while(m>0) {
				pro = pro*r;
				m--;
			}
			sum+=pro;
			n=n/10;
		}
		
		
		
		System.out.println("Sum : " + sum);
		if(sum==n2) {
			System.out.print(n2 + " is an Armstrong Number ....");
		}
		else {
			System.out.print(n2 + " is Not an  Armstrong Number ....");

		}
		
		
	}
	
	
}

package AssignMents;

import java.util.*;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the N  range : ");
		int n = sc.nextInt();
		int sum1  = n*(n+1)/2;
		System.out.print("Sum  of N : " + sum1);
		
		int  s= 0 ;
		int[] arr = {1 ,2,3,5};
		for(int x : arr) {
			s+=x;
		}
		System.out.print("\nMIssing Value : " + (sum1-s));

		
		
	}

}

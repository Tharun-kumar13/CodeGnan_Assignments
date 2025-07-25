package AssignMents;

import java.util.*;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		System.out.print("Enter the length of Array : ");
		int n = sc.nextInt();
		int[] arr= new int[n];
		for(int x = 0 ; x < n ; x++) {
			arr[x] = r.nextInt(10);
		}
		System.out.print("\nBefore Reverse Array : ");
		for(int x : arr) {
			System.out.print(x + " ");
		}
		System.out.print("\nAfter Reverse Array : ");
		
		int i =0;
		int j=n-1;
		for(int x = 0 ; x < n/2 ; x++) {
			int t = arr[x] ;
			arr[x]=arr[j] ;
			arr[j] = t;
			j--;
			
			
		}
		for(int x : arr) {
			System.out.print(x + " ");
		}

		


	}

}

package AssignMents;

import java.util.*;






public class SecondLargest {
	
	
	public static void Second_smallest(int[] arr) {
		int s = arr[0];
		int ss = arr[1];
		
		for(int x : arr) {
			if(x < s) {
				ss=s;
				s=x;
			}
			else if(s < x && ss > x) {
				ss=x;
			}
			
		}
		
		System.out.print("Second Smallest Element : " + ss);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random r = new Random();
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter the Range : ") ;
		int n =sc.nextInt();
		int[] arr = new int[n];
		for(int x = 0 ; x < n ; x++) {
			arr[x] = r.nextInt(100);
			
		}
	System.out.print("\nBefore Swapping : ");
	for(int x :arr) {
		System.out.print(x + " ");

	}
	System.out.print("\n");

				Second_smallest(arr);


	}

}

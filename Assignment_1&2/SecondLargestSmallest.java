package AssignMents;

import java.util.*;

public class SecondLargestSmallest {
	
	public static void SecondS(int arr[]) {
		int ss = arr[1];
		int s =arr[0];
		for(int x : arr) {
			if(x < s) {
				ss = s;
				s=x;
			}
			else if( x < ss && x > s ) {
				ss = x;
			}
		}
		System.out.print("\n Second Smallest Number : " + ss);
	}
	
	
	
	public static void secondL(int arr[]) {
		int sl =arr[1];
		int l=arr[0];
		for(int x : arr) {
				if(x>l) {
					sl=l;
					l=x;
				}else if(x>sl&&x<l) {
					sl=x;
				}
		}
	
		System.out.print("\nSecond Largest Element : " + sl);


	}
	
public static int largest(int arr[]) {
	int l = arr[0];
	
	for(int x= 0 ; x< arr.length ; x++) {
		if(arr[x] > l) {
			l=arr[x];
		}
		
	}
	return l;
	}


	

	public static void main(String[] args) {
		int[] arr = {9,8,8,9, 10,10,7};
		System.out.print("Array : ");
		for(int x : arr) {
			System.out.print(x + " ");
		}
		System.out.println("\nLargest  Element : " +largest(arr));
		secondL(arr);
		SecondS(arr);

	}

}

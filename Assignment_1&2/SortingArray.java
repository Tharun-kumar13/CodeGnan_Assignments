package AssignMents;

import java.util.*;

public class SortingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {22,5,6,88,9};
		System.out.print("Array : ");
		for(int x :arr) {
			System.out.print(x + " ");
		}
		System.out.println();
		int  n = arr.length;
		for(int x = 0 ; x < n ; x++) {
			for(int j=0 ; j < n-x-1 ;j++) {
				if(arr[j+1] > arr[j]) {
					int t = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = t;
				}
			}
		}
		System.out.print("Array after sort : ");
		for(int x :arr) {
			System.out.print(x + " ");
		}
		

	}

}

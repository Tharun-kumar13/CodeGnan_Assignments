package AssignMents;

import java.util.*;

public class AllPositivesTOEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * .Move all positive numbers to the end.
		Input:[-1,12,13,0,-19,15,-10]
		Output:[-1,-19,-10,0,12,15,13]
		`
*/
		int[] arr = {-1,12,13,0,-19,15,-10,0};
		int n = arr.length;
		
		int[] arr2 = new int[n];
		
		System.out.print("Actual Array : \n");
		int z=0;
		for(int x : arr) {
			System.out.print(x + " ");
			if(x==0) {
				z+=1;
			}
		}
		
		int i =0;
		for(int x : arr) {
			if (x <0) {
				arr2[i] = x;
				i++;
			}
		}
		
		for(int a= 0 ; a<z ; a++) {
			arr[i]=0;
			i++;
		}
		
		
		
		
		for(int x : arr) {
			if (x>0) {
				arr2[i]=x;
				i++;
			}
		}
		System.out.print("\n");
		System.out.print("After Moving  : ");

		
		for(int x : arr2) {
			System.out.print(x + " ");
		}
		
		/*
		 * Anther Method 
		 */		
		
	
	}

}

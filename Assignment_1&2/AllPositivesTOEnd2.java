package AssignMents;

import java.util.*;

public class AllPositivesTOEnd2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * .Move all positive numbers to the end.
		Input:[-1,12,13,0,-19,15,-10]
		Output:[-1,-19,-10,0,12,15,13]
		`
*/
		int[] arr = {-1,12,13,0,-19,15,-10};
		int n = arr.length;
		
		
		int  i = 0;
		int j=0;
		while(j<n) {
			if(arr[j]<0) {
				int t = arr[j];
				arr[j] = arr[i];
				arr[i]=t;
				j++;
				i++;
			}
			else {
				j++;
			}
		}
		System.out.println("AFter Moving Negatives : ");
		int neg=0;
		for(int x  : arr) {
			System.out.print(x + " ");
			if(x<0) {
				neg++;
			}
		}		
		System.out.println("\nAFter counting zeros  : \n");
		int m=neg;
		for(int x =neg ; x < n ; x++) {
			if(arr[x]==0) {
				int t  =arr[m];
				arr[m] = arr[x];
				arr[x]=t;
				m++;
			}
			
			}
		
		for(int x : arr) {
			System.out.print(x + " ");
				
		}
		
		
		
		/*
		
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

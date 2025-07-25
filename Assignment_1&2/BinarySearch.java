package AssignMents;
import java.util.*;

public class BinarySearch {
	
	
	
	public static int Binary(int[] arr , int t) {
			int  l =0;
			int h = arr.length-1;
			while(l<=h) {
				int mid = (l+h)/2;
				
				if(arr[mid] ==t) {
					return t;
				}
				else if(arr[mid]<t) {
					l= mid+1;
				}
				else {
					 h= mid-1;
				}
				
			}
			return -1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {3,5,6,7,2,9};
		int  n = arr.length;
		Arrays.sort(arr);
		int t = 9;
		
		System.out.print("Found : " + Binary(arr , t));
		
	}

}

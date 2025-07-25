package AssignMents;


import java.util.*;

public class LargestSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Input: [3, 5, 1, 8, 2]  
Output: Min = 1, Max = 8
*/
		
		
		//Using TreeSet we automatically Sort The Array in Ascending order , use Collections.reversed() for Decending
	
		TreeSet<Integer> set = new TreeSet<>();
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter the Length of the array : ");
		int n = sc.nextInt();
		
		for(int i = 0 ; i< n ; i++) {
			System.out.print("Enter "+ i + " element : ");
			set.add(sc.nextInt());
			
		}
		
		
		System.out.print("Array  : " +set);
		System.out.print("\n Smallest Element :  "  + set.getFirst());
		System.out.print("\n Largest Emelent : " + set.getLast());
		
		set.pollFirst();
		System.out.print("\nSecond  Smallest Element :  "  + set.getFirst());


		set.pollLast();
		System.out.print("\nSecond Largest Emelent : " + set.getLast());
		
		
		
		
		 /* Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter the Length of the array : ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0 ; i< n ; i++) {
			System.out.print("Enter "+ i + " element : ");
			int m = sc.nextInt();
			arr[i]=m;
			
		}
		System.out.print("Array :  " );
		for(int i : arr) {
			System.out.print(i+ " ");
		}
		int small=arr[1];
		int large  =arr[n-1];
		
		for(int x = 0 ; x < arr.length  ; x++) {
			if(arr[x] < small) {
				small = arr[x];
			}
			
			if(arr[x] > large) {
				large =arr[x];
			}
		}
		
		System.out.println("\nSmallest Element : " + small + "\nLargest Emelent :  " + large);
		

		
		
		*/
		

	}

}

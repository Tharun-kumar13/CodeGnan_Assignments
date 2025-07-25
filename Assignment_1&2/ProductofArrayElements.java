package AssignMents;


/*
 * Product of Array Except Self (LeetCode #238)
○ Given an array nums, return an array output
Input: [1, 2, 3, 4]
Output: [24, 12, 8, 6]

 */

public class ProductofArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4};
		int n = arr.length;
		
		int[] res = new int[n];
		
		for(int x =0 ; x  < n ; x++) {
			int pro = 1;
			for(int y =0 ; y < n ; y++) {
				if(x!=y) {
					pro*=arr[y];
					System.out.print("Product : "  + pro + "\n");
				}
			}
			res[x]=pro;
			
		}
		
		System.out.print("\nProduct array : ");
		for(int x  : res) {
			System.out.print(x + " ");
		}
		

	}

}

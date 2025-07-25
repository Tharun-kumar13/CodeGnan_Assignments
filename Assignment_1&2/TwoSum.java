package AssignMents;

/*
 * Input: nums = [2, 7, 11, 15], target = 9
 */


public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {11,15,7,2};
		int t=9;
		int n = arr.length;
		
		for(int x = 0 ; x < n ; x++) {
			int d = t - arr[x];
			for(int y= 0 ; y  < n ; y++) {
				if(arr[y]==d) {
					System.out.print("indeces : " + x + " "+ y);
					return ;
				}
			}
			
		}

	}

}

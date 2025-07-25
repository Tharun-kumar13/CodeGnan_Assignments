package AssignMents;

public class LongestConsicutive {

	public static void main(String[] args) {
		/* Find the Longest Consecutive Sequence (LeetCode #128)
				○ Find the longest consecutive sequence of numbers in a sorted array.
				Example:
				Input: [100, 4, 200, 1, 3, 2]
				Output: 4 (Because [1, 2, 3, 4] is the longest sequence)*/
		
		int[] arr= {100,200,201,203,202, 2,3};
		
		System.out.print(arr[0]+1);
		
		int min = arr[0];
		int max = 0 ;
		for(int x = 0 ; x< arr.length ; x++) {
			if(arr[x] < min) {
				min=arr[x];
			}
			if(arr[x] >= max) {
				max = arr[x];
			}
		}
		System.out.print("\n");

		for(int x= 0 ; x < arr.length -1 ; x++) {
			for(int y= 0; y < arr.length -1 - x ; y++) {
				if(arr[y] > arr[y+1]) {
					int t = arr[y] ; 
					arr[y] = arr[y+1];
					arr[y+1] = t;
				}
			}
		}
		System.out.print("\n After Sorting  : ");
		for(int x : arr) {
			System.out.print(x + " ");
		}
		int i= 0;
		int j=1;
		int count=1;
		int max_count=  0;
		for(int x =0 ; x < arr.length-1 ; x++ ) {
			if(arr[i]+1== arr[j]) {
				System.out.print("\n");
				System.out.print("Arr[i] +1 " + (arr[i]+1) +" arr[j] " + (arr[j]));
				count+=1;
				System.out.print("      Count : "  + count);
				i++;
				j++;
				if(max_count < count) {
					max_count  = count;
			}
				}
			else {
				count=1;
				i++;
				j++;
			}
			
		}		System.out.print("\n");

			System.out.print("\nLongest Sequnce Count : " + max_count);
		
		
		
		

	}

}

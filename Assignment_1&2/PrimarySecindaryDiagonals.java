package AssignMents;

public class PrimarySecindaryDiagonals {

	public static void main(String[] args) {		
		/*
		 * finds the primary and secondary diagonals of a square matrix:
Input:1 2 3
4 5 6
7 8 9
output:Primary Diagonal: 1 5 9
Secondary Diagonal: 3 5 7
		 */
		int[][] arr = {
			{1 ,2 ,3,9},
			{4, 5 ,6,8},
			{7 ,8, 9,2},
			{1,2,6,7}};
		
		int row = arr.length;
		int col = arr[0].length;
		System.out.print("Primary Diagonal : ");

		for(int x = 0 ; x < row ; x++) {
			for(int y = 0; y < col ; y++) {
				if(x==y) {
					System.out.print(arr[x][y] + " ");
				}
			}
		}
		System.out.print("\n");
		System.out.print("Secondary Diagonal : ");
		int y = 1;
		for(int x =0; x < row; x++) {
			System.out.print(arr[x][col-y] + " ");
			y+=1;
			
		}
		}

		
		

	}



package AssignMents;

import java.util.*;

public class TransposeOfMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr = {{1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
		};
		int r1 = arr.length;
		int c1 = arr[0].length;
		int[][] res = new int[r1][c1];
		
		int  i= 0;
		for(int x=0  ; x <r1 ; x++) {
			int j=0;
			for(int y= 0 ; y < c1 ; y++) {
				res[x][y] =arr[j][i];
				j++;
			}
			i++;
		
		}
		System.out.print("\nTranspose Matrix....\n");
		for(int x=0  ; x <r1 ; x++) {
			for(int y= 0 ; y < c1 ; y++) {
				
				System.out.print(res[x][y] + " ");
			}
			System.out.print("\n");
		
		}
		
		
		
		
	}

}

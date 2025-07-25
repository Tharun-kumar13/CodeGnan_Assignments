package AssignMents;
import java.util.*;

public class SumOfTwoMatrix {

	public static void main(String[] args) {
		int[][] arr = {{1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
		};
		int[][] arr2 = {{9, 8, 7,9},
	            {6, 5, 4,8},
	            {3, 2, 1,7},
	            {4,6,9,3}};
		
		int rows= arr.length;
		int col = arr[0].length;
		
		int row2 = arr2.length;
		int col2 =arr2[0].length;
		
		if(rows!=row2 || col!= col2) {
			System.out.print("Can not add .. the Matrix ");
			return;
		}
		
		int[][] res = new int[rows][col];
		
		for(int x = 0 ; x < rows ;x++) {
			for(int j = 0 ; j < col ; j++) {
				res[x][j] = arr[x][j] + arr2[x][j];
			}
		}
		for(int x = 0 ; x < rows ; x++) {
			for(int j = 0 ; j < col ; j++) {	
				System.out.print(res[x][j] + " ");
			}
			System.out.print("\n");
		}
		
	}
	
	
}

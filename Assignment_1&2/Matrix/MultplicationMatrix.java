package AssignMents;

public class MultplicationMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
		};
		int[][] arr2 = {{9, 8, 7,9},
	            {6, 5, 4,0},
	            {3, 2, 1,8}};	

		
		
		int r1 = arr.length;
		int c1 = arr[0].length;
		
		int r2 = arr2.length;
		int c2  =arr2[0].length;
		
		
		if(c1!=r2) {
			System.out.println("Can't perform multipliction of Matrix ");
			return;
			
		}
		int[][] res = new int[r1][c2];
		
		for(int x=0 ; x < r1 ; x++) {
			for(int y = 0 ; y < c2 ; y++){
				for(int k = 0 ; k  <c1 ; k++){
					res[x][y]+=arr[x][k] * arr2[k][y];
				}

				
			}
		}
		System.out.println("Product of the two matrices is:  ");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }

		
		

	}

}

package AssignMents;


/*
 * . Write a program to find all missing numbers from 1 to 100 in an array.
Example Array: {22, 17, 4, 66, 8, 2, 87}
 * 
 */

public class MisssingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {22, 17, 4, 66, 8, 2, 87,100};
		
		int n = 100;
		int y= 0;
		while(n>0) {
			for(int x = 0 ;x< arr.length  ; x++) {
				if(n==arr[x]) {
					y+=1;
				}
				
			}
			if(y==0) {
			System.out.print(n+" ");
			}
			y=0;
			n--;

		}
			}
			
	}



package AssignMents;

import java.util.*;






public class PrimeNumbersArray {
	
	public static  boolean isPrime(int n) {
		for(int x=2 ; x<(int)(n*0.5)+1; x++) {
			if(n%x==0) {
				return false;
			}
		}
		
		return true;
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		/*System.out.print("Enter the range  numer to check for Prime : ");
		int n = sc.nextInt();
		
		if (n==1 || n<=0) {
			System.out.print("Can't determine Try again : ");
		}
		*/

		int[] arr = {
				13,4,56,32,99,11
		};
		
		
		for(int x = 0 ; x < arr.length ;x++ ) {
			if(isPrime(arr[x])) {
				System.out.print(arr[x] + " ");
			}
		}
		
		

	}

}

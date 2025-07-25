package AssignMents;
import java.util.*;

public class ZerosToEnd {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Length of the Array : ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		for(int x =0 ; x< arr.length ; x++) {
			System.out.print("Enter "+x+ " Element : ");
			int m = sc.nextInt();
			arr[x] = m;
		}
		
		int nz=0;
		int z=0;
		while(nz < arr.length) {
			if(arr[nz]!=0) {
				int t = arr[z];
				arr[z] = arr[nz];
				arr[nz] = t;
				z++;
				nz++;
			}else {
				nz++;
			}
		}
		System.out.print("\n After Swapping Zero's : ");
		for(int x : arr) {
			System.out.print(x + " ");
		}
		
		
		
		
	}}
		
		
		
		/*
		int[] arr2 = new int[n];
	
		for(int x =0 ; x< arr.length ; x++) {
			System.out.print("Enter "+x+ " Element : ");
			int m = sc.nextInt();
			arr[x] = m;
		}
		System.out.print("Initial Array  ");
		for(int x =0 ; x< arr.length ; x++) {
			
			System.out.print(arr[x] + " ");
		}
		
		System.out.print("\nArray after zeros to end  \n");
		int i= 0;
		for(int x =0 ; x< arr.length ; x++) {
			
			if(arr[x]!=0) {
				arr2[i] = arr[x];
				i++;
			}
			
		}
for(int x =0 ; x< arr.length ; x++) {
			
			System.out.print(arr2[x] + " ");
		}
		
		
		
		
		
	}

}
*/


/*System.out.print("Enetr input  : ");
String p1 = sc.next();
while(!p1.equals("rock")&&!p1.equals("paper")&&!p1.equals("scessor")) {
	System.out.println("it is invalid,enter the valid");
	   p1=sc.next();
}

System.out.print(p1); */
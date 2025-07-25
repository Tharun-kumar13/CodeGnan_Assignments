package AssignMents;
import java.util.*;

public class LogicSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		
		int[] arr = new int[r.nextInt(2,10)];
		
		arr[0] = 1;
		
		int diff = 1;
		
		for(int x  = 1 ; x < arr.length ; x++) {
			arr[x] = arr[x-1] + diff;
			diff+=2;
		}
		for(int x : arr) {
			System.out.print(x + " ");
		}
	}

}


package AssignMents;


import java.util.*;


public class MajorityElement {
	
    public static void main(String[] args) {
        int[] arr = {2, 4, 4, 2, 4, 4};
        Set<Integer> set = new HashSet<>();
        for (int x : arr) {
            set.add(x);
        }

        int m = arr.length / 2;

        for (int x :arr) {
            int count = 0;
            for (int num : arr) {
                if (num == x) {
                    count++;
                }
            }

            if (count > m) {
                System.out.println("Majority element: " + x);
                return; 
            }
        }

        System.out.println("No majority element found.");
    }
}

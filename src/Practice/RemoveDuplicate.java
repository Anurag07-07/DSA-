package Practice;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicate {
    public static int Better(int[] nums) {
        HashSet<Integer> h = new HashSet<>();
        for (int x:nums){
            h.add(x);
        }
      return h.size();
    }
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        Better(arr);
    }
}

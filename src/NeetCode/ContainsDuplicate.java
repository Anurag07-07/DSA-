package NeetCode;

import java.util.HashSet;

public class ContainsDuplicate {
    public static boolean Brute(int[] arr) {
        HashSet<Integer> h = new HashSet<>();
        for (Integer x:arr){
            if (h.contains(x)){
                return true;
            }
            h.add(x);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        Brute(arr);
    }
}

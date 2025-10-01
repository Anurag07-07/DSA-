package NeetCode;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static int[] Brute(int[] nums,int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{0};
    }

    public static int[] Better(int[] nums,int target) {
        HashMap<Integer,Integer> h= new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
           h.put(nums[i],i );
        }
        System.out.println(h);

        System.out.println(Arrays.toString(nums));
        //Find The Sum
        for (int i = 0; i < nums.length; i++) {
            int next = target-nums[i];
            if (h.containsKey(next) && h.get(next)!=i){
                return new int[]{i,h.get(next)};
            }
        }
        return new int[]{0};
    }
    public static void main(String[] args) {
        int[] arr = {3,2,4};
        int[] ans = Better(arr,6);
        System.out.println(Arrays.toString(ans));
    }
}

package NeetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveElement {
    public static void Brute(int[] nums,int val) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=val){
                arr.add(nums[i]);
            }
        }
        int j = 0;
        for (int i = 0; i < arr.size(); i++) {
            nums[j] = arr.get(i);
            j++;
        }
        System.out.println(arr.size());
        System.out.println(Arrays.toString(nums));
    }
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        Brute(nums,3);
    }
}

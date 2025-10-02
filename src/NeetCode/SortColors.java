package NeetCode;

import java.util.Arrays;

public class SortColors {
    public static void Brute(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void Better(int[] nums) {
        //Counting Sort
        int[] freq = new int[3];
        for (int i = 0; i < nums.length; i++) {
            freq[nums[i]]++;
        }

        int j = 0;
        for (int i = 0; i < freq.length; i++) {
            while (freq[i]>0){
                nums[j++] = i;
                freq[i]--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        Brute(arr);
        Better(arr);
    }
}

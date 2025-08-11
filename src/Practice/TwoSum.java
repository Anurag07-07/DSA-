package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
    public static int[] Brute(int[] arr , int target) {
        int[] ans = new int[2];
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]+arr[j]==target){
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }

        return ans;
    }

    public static void Better(int[] arr,int target) {
        //Using Hashmap
        //In Future
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = {2,7,11,15};
        int target = 9;

        int[] ans = Brute(nums,target);

        System.out.println(Arrays.toString(ans));
    }
}

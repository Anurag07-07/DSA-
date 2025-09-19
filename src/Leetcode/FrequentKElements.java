package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class FrequentKElements {

    public static int[] Brute(int[] nums ,int k) {

        if (nums.length<=1 && k==1){
            return nums;
        }

        Arrays.sort(nums);

        int i = 0;
        int cnt = 0;
        ArrayList<Integer> arr  = new ArrayList<>();
        while(i<nums.length-1){
            if(nums[i]==nums[i+1]){
                cnt++;
            }else{
                if(cnt>=k){
                    arr.add(nums[i]);
                }
                cnt = 1;
            }
            i++;
        }

        int[] ans = new int[arr.size()];
        for(int  j = 0;j<arr.size();j++){
            ans[j] = arr.get(j);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,1,2,1,2,3,1,3,2};
        int [] arr1 =  Brute(arr,2);
        System.out.println(Arrays.toString(arr1));
    }
}

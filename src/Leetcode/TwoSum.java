package Leetcode;
/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.



Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]


Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.


Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
 */

import java.util.HashMap;

public class TwoSum {

    public static int Binary_Search(int[] arr,int target) {
        int start = 0,end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if (arr[mid]==target){
                return mid;
            } else if (arr[mid]>target) {
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        return -1;
    }
    
    public static void Brute(int[] arr,int target ) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i]+arr[j] == target){
                    System.out.println(i+" "+j);
                    break;
                }
            }
        }
    }

    public static void Better(int[] arr,int target) {
        for (int i = 0; i < arr.length; i++) {
            int value = target-arr[i];
            int ans = Binary_Search(arr,value);
            if (ans!=-1){
                System.out.println(i+" "+ans);
                break;
            }
        }
    }

    public static void Optimal(int[] arr,int target) {
        HashMap<Integer,Integer> h = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement=target-arr[i];
            if(h.containsKey(complement)){
//                return new int[]{h.get(complement),i};
            }
            h.put(arr[i],i);
        }
//        return new int[]{0};
    }


    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
//        Brute(arr,9);
//        Better(arr,9);
        Optimal(arr,9);
    }
}

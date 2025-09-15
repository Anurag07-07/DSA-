package Leetcode;

import java.util.Arrays;
import java.util.HashSet;

/*
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

Example 1:

Input: nums = [1,2,3,1]

Output: true

Explanation:

The element 1 occurs at the indices 0 and 3.

Example 2:

Input: nums = [1,2,3,4]

Output: false

Explanation:

All elements are distinct.

Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]

Output: true



Constraints:

        1 <= nums.length <= 105
        -109 <= nums[i] <= 109


 */
public class ContaisnDuplicate {

    public static boolean Brute(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];
            for (int j = 0; j < nums.length; j++) {
                if (i!=j && nums[j]==value) return true;
            }
        }
        return false;
    }

    public static boolean Better(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length ; i++) {
            if (nums[i]==nums[i-1]) return true;
        }
        return false;
    }

    public static boolean Optimal(int[] nums ) {
        HashSet<Integer> s = new HashSet<>();
        for (Integer x: nums){
            if (s.contains(x)){
                return true;
            }
            s.add(x);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        if (Optimal(arr)){
            System.out.println("Contains Duplicate");
        }else {
            System.out.println("Not Contains Duplicate");
        }
    }
}

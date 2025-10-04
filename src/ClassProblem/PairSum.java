package ClassProblem;

import java.util.Arrays;
import java.util.HashMap;

public class PairSum {
    public static int[] Brute(int[] nums,int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i]+nums[j]==target){
                    return new int[]{nums[i],nums[j]};
                }
            }
        }
        return  new int[]{0};
//        Time Complexity = O(n^2) => nlogn n logn n^1/2 1
    }
    public static int BinarySearch(int[] arr,int target) {
        int start = 0,end = arr.length-1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if (arr[mid]==target){
                return arr[mid];
            } else if (arr[mid]>target) {
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        return -1;
    }

    public static int[] Better(int[] arr,int target) {
        for (int i = 0; i < arr.length; i++) {
            int value = arr[i];
            int left_Element = target-value;
            int find = BinarySearch(arr,left_Element);
            return new int[]{value,left_Element};
        }
        return new int[]{0};
//        Time Complexity = O(nlogn)
//        Space Complexity = O(1)
    }



    public static int[] Optimal(int[] nums,int target) {
        HashMap<Integer,Integer> h = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            h.put(nums[i],i);
        }

        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];
            int left = target-value;
            if (h.containsKey(left) && i!=h.get(left)){
                return new int[]{i,h.get(left)};
            }
        }
        return new int[]{0};
    }

    public static void main(String[] args) {
        int[] nums = {3,2,4};

        int target = 6;
//        key value
//         1    0
//         3    1
//         5    2
//         6    3
//         10   4
        int[] arr =  Optimal(nums,target);
        System.out.println(Arrays.toString(arr));
    }
}

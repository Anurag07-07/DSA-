package ClassProblem;

import java.sql.Time;

public class LargestSumoFSubarray {
    public static void Brute(int[] nums) {
        int largest_sum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int sum = 0;
                for (int k = i; k <=j ; k++) {
                    sum = sum+nums[k];
                }
                if (sum>largest_sum){
                    largest_sum = sum;
                }
            }
        }

//        Time Complexity = O(n^3)
        System.out.println(largest_sum);
    }
    public static void Better(int[] nums) {

        int[] psum = new int[nums.length];
        psum[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            psum[i] = psum[i-1]+nums[i];
        }

        int largest_sum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int sum = 0;
                if (i==0){
                    sum = psum[j];
                }else {
                    sum = psum[j]-psum[i-1];
                }
                if (sum>largest_sum){
                    largest_sum = sum;
                }
            }
//            Time Complexity = O(n^2)
//            Space Complexity = O(n)
        }
        System.out.println(largest_sum);
    }

    public static void Optimal(int[] nums) {
        int sum = 0,largest_sum = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++) {
            sum = sum+nums[i];
            if (sum<0){
                sum =0;
            }
            if (sum>largest_sum){
                largest_sum = sum;
            }
        }
//        Time Complexity = O(n)
//        Space Complexity = O(1)
        System.out.println(largest_sum);
    }

    public static void main(String[] args) {
        int[] arr = {5,-3,2,-7,6,5,8,-4,11,-10,-15};
//        max = 5 5 5 5 6 11 19 19 26 26 26
//        sum = 5 2 4 0 6 11 19 15 26 16 1
//        Brute(arr);
//        Better(arr);
        Optimal(arr);
    }
}

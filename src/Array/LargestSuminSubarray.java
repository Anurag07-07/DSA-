package Array;

import java.util.Arrays;

public class LargestSuminSubarray {
    public static void Brute(int[] arr) {
//        TC = O(n^3)
//        SC = O(1)
        int largest_sum = Integer.MIN_VALUE;
        for (int i = 0;i< arr.length;i++){
            for (int j = i; j < arr.length ; j++) {
                //Find The Sum of Each Subarray
                int sum = 0;
                for (int k = i; k <=j ; k++) {
                    sum+=arr[k];
                }
                if (sum>largest_sum){
                    largest_sum = sum;
                }
            }
        }

        System.out.println("The Largest Sum is "+largest_sum);
    }

    public static void Better(int[] arr) {

//        TC = O(n^2)
//        SC = O(n)

        int largest_sum = Integer.MIN_VALUE;

        //Create A Prefix Sum array
        int[] psum  = new int[arr.length];

        psum[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            psum[i] = psum[i-1]+arr[i];
        }

        //Find The Largest Sum of Subarray
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                if (i==0){
                    sum = psum[j];
                }else {
                    sum = psum[j]-psum[i-1];
                }
                if (sum> largest_sum){
                    largest_sum = sum;
                }
            }
        }
        System.out.println("The Maximum Subarray Sum is "+largest_sum);
    }

    public static void Optimal(int[] arr) {

//        TC = O(n)
//        SC = O(1)

        int largest_sum = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum +arr[i];
            if (sum<0) sum = 0;
            if (sum>largest_sum) largest_sum = sum;
        }

        System.out.println("The Largest Sum is "+largest_sum);
    }

    public static void main(String[] args) {
        int[] arr = {5,-3,2,-7,6,5,8,-4,11,-10,-15};
        Brute(arr);
        Better(arr);
        Optimal(arr);
    }
}

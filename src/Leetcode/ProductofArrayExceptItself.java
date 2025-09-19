package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class ProductofArrayExceptItself {
    public static void Brute(int[] arr) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int product =  1;
            for (int j = 0; j < arr.length; j++) {
                if (j!=i){
                    product = product*arr[j];
                }
            }
            arr1.add(product);
        }
        //Store in another Array
        int[] arr2 = new int[arr1.size()];
        for (int i = 0; i < arr1.size(); i++) {
            arr2[i] = arr1.get(i);
        }

        System.out.println(Arrays.toString(arr2));
    }
    public static void Better(int[] arr) {
        int[] psum = new int[arr.length];
        psum[0] = arr[0];

        //Use Carry Forward Approach
        for (int i = 1; i < arr.length; i++) {
            psum[i] = psum[i-1]*arr[i];
        }

        System.out.println(Arrays.toString(psum));
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
//        Brute(arr);
        Better(arr);
    }
}

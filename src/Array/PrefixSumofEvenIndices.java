package Array;

import java.util.Arrays;
import java.util.Scanner;

public class PrefixSumofEvenIndices {
    public static void main(String[] args) {
        int[] arr  = {3,-2,4,6,-3,5};

        //Find The Prefix Sum of Even Indices

        int[] psum = new int[arr.length];

        psum[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (i%2==0){
                psum[i] = psum[i-1]+arr[i];
            }else {
                psum[i] = psum[i-1];
            }
        }

        System.out.println(Arrays.toString(psum));

    }
}

package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayBecomeSorted {
    public static void Brute(int[] arr) {
//        arr = 1,2,4,7,10,11,7,12,7,7,16,18,19
//        brr = 1 2 4 7 7 7 10 11 12 16 18 19
//            i = j =

//        TC(nlogn)
//        SC = O(n)
            int[] brr = arr.clone();
            Arrays.sort(brr);
            int i = 0;
            int j = arr.length-1;
            while (arr[i]==brr[i]){
                i++;
            }

            while(arr[j]==brr[j]){
                j--;
            }

        System.out.println("The Smallest Subarray to sort is " + i + "  " + j);

//        1,2,4,7,10,11,7,12,7,7,16,18,19
//          1 2 4 7 7 7 7 10 11 12 16 18 19

    }

    public static boolean OutofOrder(int[] arr, int value,int i) {
        if (i==0){
            return arr[i]>arr[i+1];
        } else if (i== arr.length-1) {
            return arr[i] <arr[i-1];
        }else {
            return  arr[i] >arr[i+1] || arr[i]<arr[i-1];
        }
    }

    public static void Optimal(int[] arr) {
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            boolean value = OutofOrder(arr,arr[i], i);
            if (value){
                min = Math.min(min,arr[i]);
                max = Math.max(max,arr[i]);
            }
        }

        int i = 0;
        while(arr[i]<=min){
            i++;
        }

        int j = arr.length-1;
        while(arr[j]>=max){
            j--;
        }

        System.out.println("The Smallest Subarray is "+i+" " + j);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,7,10,11,7,12,7,7,16,18,19};
        Brute(arr);
        Optimal(arr);
    }
}

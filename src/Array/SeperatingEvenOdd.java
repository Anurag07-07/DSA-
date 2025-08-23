package Array;

import java.util.Arrays;

public class SeperatingEvenOdd {
    public static void main(String[] args) {
        int[] arr = {2,5,3,6,7,9,8,15,20};
        //Using Two Pointer
        int start = 0,end = arr.length-1;
        //Start Track the Even and End Track the Odd
        while(start<end){
            //Edge Cases
            if (arr[start]%2==0){
                start++;
            }
            if(arr[end]%2!=0){
                end--;
            }

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;end--;
        }

        System.out.println(Arrays.toString(arr));
    }
}

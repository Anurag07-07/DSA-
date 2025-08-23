package Array;

import java.util.Arrays;

public class ReversingtheArray {

    public static void Rotate(int[] arr,int start,int end) {
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 2;
        int n = arr.length;
        //Effective Rotation
        k = k%n;

        Rotate(arr,0,n-1);
        Rotate(arr,0,k-1);
        Rotate(arr,k,n-1);

        System.out.println(Arrays.toString(arr));

    }
}

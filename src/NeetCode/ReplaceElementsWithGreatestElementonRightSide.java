package NeetCode;

import java.util.Arrays;

public class ReplaceElementsWithGreatestElementonRightSide {
    public static void Brute(int[] arr) {
        int n = arr.length;
        int[] s_sum = new int[arr.length];
        s_sum[n-1] = -1;
        for (int i = n-2; i >=0 ; i--) {
            s_sum[i] = Math.max(s_sum[i+1],arr[i+1]);
        }

        System.out.println(Arrays.toString(s_sum));
    }
    public static void main(String[] args) {
        int[] arr = {17,18,5,4,6,1};
        Brute(arr);
    }
}

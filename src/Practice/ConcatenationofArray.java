package Practice;

import java.util.Arrays;

public class ConcatenationofArray {
    public static int[] ConcatenationofArrayBrute(int[] arr) {
        //Create new Array of 2n size
        int n = arr.length;
        int[] ans = new int[2*n];

        //Insert Element in Array
        for (int i = 0; i < n; i++) {
            ans[i] = ans[n+i] = arr[i];
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,1};
        int[] ans = ConcatenationofArrayBrute(nums);
        System.out.println(Arrays.toString(ans));
    }
}

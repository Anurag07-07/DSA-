package NeetCode;

import java.util.Arrays;

public class ProductofArrayExceptIteself {
    public static void Brute(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int product = 1;
            for (int j = 0; j < nums.length; j++) {
                if (j!=i){
                    product *= nums[j];
                }
            }
            ans[i] = product;
        }

        System.out.println(Arrays.toString(ans));
    }
    public static void Better(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int[] pref = new int[n];
        int[] suff = new int[n];

        pref[0] = 1;
        suff[n - 1] = 1;
        for (int i = 1; i < n; i++) {
            pref[i] = nums[i - 1] * pref[i - 1];
        }
        for (int i = n - 2; i >= 0; i--) {
            suff[i] = nums[i + 1] * suff[i + 1];
        }
        for (int i = 0; i < n; i++) {
            res[i] = pref[i] * suff[i];
        }
        System.out.println(Arrays.toString(res));
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        Brute(nums);
        Better(nums);
    }
}

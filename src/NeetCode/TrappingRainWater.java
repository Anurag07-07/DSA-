package NeetCode;

import java.util.Arrays;

public class TrappingRainWater {
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        int n = height.length;
        int[] psum = new int[height.length];
        int[] ssum = new int[height.length];
        ssum[n-1] = height[n-1];

        for (int i = 1; i < height.length; i++) {
            psum[i] = Math.max(psum[i-1],height[i]);
        }

        for (int i = n-2; i >=0 ; i--) {
            ssum[i] = Math.max(ssum[i+1],height[i]);
        }

        int ans = 0;
        for (int i = 0; i < height.length; i++) {
            ans = ans +((Math.min(psum[i],ssum[i])-height[i]));
        }



        System.out.println(Arrays.toString(height));
        System.out.println(Arrays.toString(psum));
        System.out.println(Arrays.toString(ssum));
        System.out.println(ans);
    }
}

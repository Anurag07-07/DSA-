package NeetCode;

import java.util.Arrays;

public class Countingbits {
    public static int CountBit(int n) {
        int cnt = 0;
        while(n!=0){
           cnt = cnt + (n&1);
           n= n>>1;
        }
        return cnt;
    }
    public static void main(String[] args) {
        int n = 5;
        int[] arr = new int[n+1];
        int count = 0;
        int  i = 0;
        while(count<=n){
            int ans = CountBit(count);
            arr[i++] = ans;
            count++;
        }

        System.out.println(Arrays.toString(arr));
    }
}

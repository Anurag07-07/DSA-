package NeetCode;

public class ConcatenationofArray {

    public static void Brute(int[] arr) {
        int  n = arr.length;
        int[] ans = new int[2*n];
        for (int i = 0; i < n; i++) {
            ans[i] = ans[n+i] = arr[i] ;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,1};
        Brute(arr);
    }
}

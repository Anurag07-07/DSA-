package Array;

import java.util.Arrays;

public class ScoreofString {
    public static void Brute(String s) {
        //Convert into Char Array
        char[] arr = s.toCharArray();
        System.out.println(Arrays.toString(arr));
        int sum = 0;
        for (int i = 0; i < arr.length-1; i++) {
            sum = sum + Math.abs(arr[i+1]-arr[i]);
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        String s = "hello";
        Brute(s);
    }
}

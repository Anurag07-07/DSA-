package NeetCode;


import java.util.Arrays;
import java.util.HashSet;

public class CountVowels {
    public static boolean isVowel(String s) {
        HashSet<Character> h = new HashSet<>(Arrays.asList('a','e','i','o','u'));
        if ((h.contains(s.charAt(0)))&& (h.contains(s.charAt(s.length()-1)))){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String[] arr = {"aba", "bcb", "ece", "aa", "e"};
        int[][] queries = {{0, 2}, {1, 4}, {1, 1}};
        int[] psum = new int[arr.length];
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isVowel(arr[i])){
                psum[i] = ++cnt;
            }else {
                psum[i] = cnt;
            }
        }

        int[] count = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];
            int cnt1 = 0;
            if (start ==0) cnt1 = psum[end];
            else cnt1 = psum[end]-psum[start-1];
            count[i] = cnt1;
        }

        System.out.println(Arrays.toString(count));
    }
}


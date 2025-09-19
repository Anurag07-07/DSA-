package Leetcode;

import java.util.Arrays;

public class SortColors {
    public static void Brute(int[] arr) {
        int[] freq = new int[3];

        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }

        int index = 0;
        for (int i = 0; i < freq.length; i++) {
            while(true){
                if (freq[i]==0) break;
                arr[index++] = i;
                freq[i]--;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        Brute(arr);
    }

}

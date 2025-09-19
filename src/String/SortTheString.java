package String;

import java.util.Arrays;

public class SortTheString {

    public static void Brute(char[] arr) {
        //Sort the Array
        //TC : O(nlogn)
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void Better(char[] arr) {
        //TC: O(N)
        int[] freq  = new int[26];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]-'a']++;
        }

        for (int i = 0; i < freq.length; i++) {
            int cnt = freq[i];
            while(true){
                if (cnt ==  0) break;
                System.out.print((char)(i+'a'));
                cnt--;
            }
        }
    }

    public static void main(String[] args) {
        char[] arr = {'b','a','t','m','a','n'};
//        Brute(arr);
        Better(arr);
    }
}
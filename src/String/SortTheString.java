package String;

import java.util.Arrays;

public class SortTheString {
    public static void main(String[] args) {
        char[] s = {'a','n','u','r','a','g'};
        int[] freq = new int[26];
        for (int i = 0; i < s.length; i++) {
            int index =  s[i]-'a';
            freq[index]++;
        }

        for (int i = 0; i < freq.length; i++) {
            int value = freq[i];
            while (value!=0){
                System.out.println((char)('A'+i));
                value--;
            }
        }
    }
}

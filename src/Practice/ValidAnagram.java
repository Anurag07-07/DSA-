package Practice;

import java.util.Arrays;
import java.util.Collections;

public class ValidAnagram {

    public static boolean Brute(String s,String t) {

        //Convert to the Array
        char[] string1 = s.toCharArray();
        char[] string2 = t.toCharArray();

        //Sort The Arrays
        Arrays.sort(string1);
        Arrays.sort(string2);

        if (string1.length != string2.length) {
            return false;
        }

        for (int i = 0; i < string1.length; i++) {
            if (string1[i]!=string2[i]){
                return false;
            }
        }
        return true;
    }

    public static void Better(String s,String t) {
        //Using Hasmap it can be solve in O(n) times
        //Done in future
    }

    public static void main(String[] args) {
        String s = "rat";
        String t = "car";
        boolean ans = Brute(s,t);

        if (ans){
            System.out.println("Anagram");
        }else {
            System.out.println("Not Anagram");
        }
    }
}

package NeetCode;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Arrays;

public class ValidAnagram {
    public static boolean Brute(String s, String t) {
        //Convert into Char Array
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();

        //Sort The Array
        Arrays.sort(s1);
        Arrays.sort(t1);

        //Convert into String
        String s2 = new String(s1);
        String t2 = new String(t1);

        if (s2.equals(t2)){
            return true;
        }
        return false;
    }

    public static boolean Better(String s,String t) {
        //Store The Occurance
        int[] count = new int[s.length()+t.length()];
        for (char c:s.toCharArray()){
            count[c-'a']++;
        }

        //Remove the Occurance
        for(char c:t.toCharArray()){
            count[c-'a']--;
        }

        for (int c:count){
            if (c!=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "rat";
        String t = "car";
        Brute(s,t);
    }
}

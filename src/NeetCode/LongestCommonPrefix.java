package NeetCode;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static String Brute(String[] strs) {
        //First Get the First String
        String prefix = strs[0];
        //Now Iterate over an Array
        for (int i = 1; i < strs.length; i++) {
            //Make variable that Iterate Over Another String
            int j = 0;
            //Run a Loop to Compare The Strings
            while(j<Math.min(prefix.length(),strs[i].length())){
                if (prefix.charAt(j)!=strs[i].charAt(j)){
                    break;
                }
                j++;
            }
            prefix = prefix.substring(0,j);
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        Brute(strs);
    }
}

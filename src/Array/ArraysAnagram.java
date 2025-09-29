package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ArraysAnagram {
    public static List<List<String>>  Brute(String[] arr) {
        HashMap<String, List<String>> h = new HashMap<>();
        for (String s:arr){
            //Convert The String to Char Array
            char[] c = s.toCharArray();
            //Sort The Array
            Arrays.sort(c);
            //Convert Into String Again
            String s1 = new String(c);
            //Check if the Element is present
            h.putIfAbsent(s1,new ArrayList<>());
            //If Not Add The Element
            h.get(s1).add(s);
        }

        return new ArrayList<>(h.values());
    }
    public static List<List<String>>  Better(String[] arr) {
        HashMap<String, List<String>> h = new HashMap<>();
        for (String s:arr){
            int[] count = new int[26];
            //Convert The String to Char Array
            for (char c:s.toCharArray()){
                count[c-'a']++;
            }
            //Convert Into String Again
            String s1 = Arrays.toString(count);
            //Check if the Element is present
            h.putIfAbsent(s1,new ArrayList<>());
            //If Not Add The Element
            h.get(s1).add(s);
        }

        return new ArrayList<>(h.values());
    }
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        Brute(strs);
        Better(strs);
    }
}

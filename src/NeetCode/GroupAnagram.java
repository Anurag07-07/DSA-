package NeetCode;

import java.util.*;

public class GroupAnagram {
    public static List<List<String>> Brute(String[] strs) {
        Map<String,List<String>> h = new HashMap<>();
        for (String x:strs){
            //Convert The Array into Char Array
            char[] s = x.toCharArray();
            //Sort The Array
            Arrays.sort(s);
            //Convert Into String
            String s1 = new String(s);
            //Find In Hashmap Key if that key is Present if not add that key and create Arraylist
            h.putIfAbsent(s1,new ArrayList<>());
            h.get(s1).add(x);
        }
        return new ArrayList<>(h.values());
    }

    public static List<List<String>> Better(String[] strs) {
        Map<String,List<String>> h = new HashMap<>();
        for (String x: strs){
            //Store The Occurance of Each Element
            int[] count = new int[26];
            for (char c : x.toCharArray()){
                count[c-'a']++;
            }
            //Convert The Occurance Array into String
            String s1 = Arrays.toString(count);
            //Check in Hashmap if Key with that String is Present or not. If Not Than add that String
            h.putIfAbsent(s1,new ArrayList<>());
            //If String with similar occurance string present just add that String
            h.get(s1).add(x);
        }
        return new ArrayList<>(h.values());
    }
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};

    }
}

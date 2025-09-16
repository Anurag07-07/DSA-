package Leetcode;

import java.util.Arrays;

/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

Example 1:

Input: s = "anagram", t = "nagaram"

Output: true

Example 2:

Input: s = "rat", t = "car"

Output: false



Constraints:

        1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.


 */
public class ValidAnagram {
    public static void main(String[] args) {
    String s = "anagram";
    String t = "nagaram";


    char[] s1 = s.toCharArray();
    char[] t1 = t.toCharArray();

    //Sort The Both Array
    Arrays.sort(s1);
    Arrays.sort(t1);

        for (int i = 0; i < s1.length; i++) {
            if (s1[i]!=t1[i]){
                break;
            }
        }
    }
}

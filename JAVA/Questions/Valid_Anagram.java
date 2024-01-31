// Given two strings s and t, return true if t is an anagram of s, and false otherwise.
// An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
// Example 1:
// Input: s = "anagram", t = "nagaram"
// Output: true

// Example 2:
// Input: s = "rat", t = "car"
// Output: false

import java.util.*;

class Valid_Anagram {
    public boolean isAnagram(String s, String t) {
        char[] sA = s.toCharArray();
        char[] tA = t.toCharArray();

        Arrays.sort(sA);
        Arrays.sort(tA);

        return Arrays.equals(sA, tA);
    }
}
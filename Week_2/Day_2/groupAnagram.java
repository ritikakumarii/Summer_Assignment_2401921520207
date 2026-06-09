import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        
        // Edge case: if s is shorter than p, s cannot contain any anagrams of p
        if (s == null || p == null || s.length() < p.length()) {
            return result;
        }

        int[] pCounts = new int[26];
        int[] sCounts = new int[26];
        
        int pLen = p.length();
        int sLen = s.length();

        // Build the frequency count for string p and the first window of string s
        for (int i = 0; i < pLen; i++) {
            pCounts[p.charAt(i) - 'a']++;
            sCounts[s.charAt(i) - 'a']++;
        }

        // Check if the very first window is an anagram
        if (matches(pCounts, sCounts)) {
            result.add(0);
        }

        // Slide the window across the rest of string s
        for (int i = pLen; i < sLen; i++) {
            // Add the new character coming into the window
            sCounts[s.charAt(i) - 'a']++;
            
            // Remove the old character leaving the window
            sCounts[s.charAt(i - pLen) - 'a']--;

            // If frequencies match, the start of the current window is (i - pLen + 1)
            if (matches(pCounts, sCounts)) {
                result.add(i - pLen + 1);
            }
        }

        return result;
    }

    // Helper method to compare two frequency arrays
    private boolean matches(int[] pCounts, int[] sCounts) {
        for (int i = 0; i < 26; i++) {
            if (pCounts[i] != sCounts[i]) {
                return false;
            }
        }
        return true;
    }
}

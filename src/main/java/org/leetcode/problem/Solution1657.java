package org.leetcode.problem;

import java.util.Arrays;


/**
 * Determine if Two Strings Are Close
 */
public class Solution1657 {
    public boolean closeStrings(final String word1, final String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }
        int n = word1.length();
        int[] word1arr = new int[26];
        int[] word2arr = new int[26];
        for (int i = 0; i < n; i++) {
            word1arr[word1.charAt(i) - 'a']++;
            word2arr[word2.charAt(i) - 'a']++;
        }

        for (int i = 0; i < word1arr.length; i++) {
            if ((word1arr[i] == 0 && word2arr[i] != 0) || (word1arr[i] != 0 && word2arr[i] == 0)) {
                // means there are a letter in one word that doesn't exist in another
                return false;
            }
        }

        Arrays.sort(word1arr);
        Arrays.sort(word2arr);

        for (int i = 0; i < word1arr.length; i++) {
           if (word1arr[i] != word2arr[i]) {
               return false;
           }
        }
        return true;
    }
}

package org.leetcode.problem;


import java.util.StringJoiner;


/**
 * Reverse Words in a String
 */
public class Solution151 {
    public String reverseWords(String s) {
        final String[] splitWords = s.trim().split(" +");
        final StringJoiner sj = new StringJoiner(" ");
        for (int i = splitWords.length - 1; i >= 0; i--) {
            sj.add(splitWords[i]);
        }
        return sj.toString();
    }
}

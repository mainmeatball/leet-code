package org.leetcode.weekly;

import java.util.*;


public class ShortestDistanceToACharacter {
    public int[] shortestToChar(final String s, final char c) {
        final List<Integer> indices = getAllOccurrences(s, c);
        final int[] result = new int[s.length()];
        int prevIndex = Integer.MAX_VALUE;
        int nextIndex = indices.get(0);
        for (int i = 0, j = 0; i < s.length(); i++) {
            final int leftDelta = Math.abs(prevIndex - i);
            final int rightDelta = Math.abs(nextIndex - i);
            result[i] = Math.min(leftDelta, rightDelta);
            if (i == indices.get(j)) {
                prevIndex = i;
                if (j == indices.size() - 1) {
                    nextIndex = Integer.MIN_VALUE;
                } else {
                    nextIndex = indices.get(++j);
                }
            }
        }
        return result;
    }

    private List<Integer> getAllOccurrences(final String s, final char c) {
        final List<Integer> charsInString = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                charsInString.add(i);
            }
        }
        return charsInString;
    }
}

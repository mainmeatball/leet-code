package org.leetcode.problem;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


/**
 * Buddy Strings
 */
public class Solution859 {
    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) return false;
        if (s.equals(goal)) {
            final Set<Character> set = new HashSet<>();
            for (final char c : s.toCharArray()) {
                set.add(c);
            }
            final boolean hasAtLeastTwoSameCharacters = set.size() < s.length();
            return hasAtLeastTwoSameCharacters;
        }
        final List<Integer> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                list.add(i);
            }
        }
        return list.size() == 2
                && s.charAt(list.get(0)) == goal.charAt(list.get(1))
                && goal.charAt(list.get(0)) == s.charAt(list.get(1));
    }
}

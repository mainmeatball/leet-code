package org.leetcode.problem;

import java.util.HashMap;
import java.util.Map;


/**
 * Word Pattern
 */
public class Solution290 {
    public boolean wordPattern(String pattern, String s) {
        final String[] patternMap = new String[26];
        final String[] parts = s.split(" ");
        final Map<String, Character> map = new HashMap<>();
        if (pattern.length() != parts.length) {
            return false;
        }
        for (int i = 0; i < pattern.length(); i++) {
            final String savedWord = patternMap[pattern.charAt(i) - 'a'];
            if (savedWord == null) {
                final String part = parts[i];
                if (map.containsKey(part) && !map.get(part).equals(pattern.charAt(i))) {
                    return false;
                }
                patternMap[pattern.charAt(i) - 'a'] = part;
                map.put(part, pattern.charAt(i));
                continue;
            }
            if (!savedWord.equals(parts[i])) {
                return false;
            }
        }
        return true;
    }
}

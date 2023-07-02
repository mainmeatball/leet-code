package org.leetcode.problem;

import java.util.ArrayList;
import java.util.List;


/**
 * Generate Parentheses
 */
public class Solution22 {

    public List<String> generateParenthesis(int n) {
        final List<String> result = new ArrayList<>();

        recursion(n, n, n, result, "");

        return result;
    }

    private void recursion(final int total, int l, int r, List<String> result, String s) {
        if (s.length() == total * 2) {
            result.add(s);
        }
        if (l == 0 && r == 0) {
            return;
        }
        if (l > 0) {
            recursion(total, l - 1, r, result, s + "(");
        }
        if (r > 0 && l < r) {
            // close only if opened
            recursion(total, l, r - 1, result, s + ")");
        }
    }
}

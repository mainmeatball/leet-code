package org.leetcode.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class Solution205Test {

    final Solution205 solution = new Solution205();

    @Test
    void isIsomorphic() {
        final String s1 = "badc";
        final String s2 = "baba";

        final boolean isIsomorphic = solution.isIsomorphic(s1, s2);

        assertFalse(isIsomorphic);
    }
}
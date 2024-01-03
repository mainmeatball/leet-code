package org.leetcode.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class Solution394Test {

    final Solution394 solution = new Solution394();

    @Test
    void decodeString() {
        final String result = solution.decodeString("3[a]2[bc]");

        assertEquals("aaabcbc", result);
    }

    @Test
    void decodeString2() {
        final String result = solution.decodeString("3[a2[c]]");

        assertEquals("accaccacc", result);
    }

    @Test
    void decodeString3() {
        final String result = solution.decodeString("2[abc]3[cd]ef");

        assertEquals("abcabccdcdcdef", result);
    }

    @Test
    void decodeString4() {
        final String result = solution.decodeString("3[z]2[2[y]pq4[2[jk]e1[f]]]ef");

        assertEquals("zzzyypqjkjkefjkjkefjkjkefjkjkefyypqjkjkefjkjkefjkjkefjkjkefef", result);
    }
}
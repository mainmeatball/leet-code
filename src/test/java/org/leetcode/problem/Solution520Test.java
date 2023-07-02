package org.leetcode.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class Solution520Test {

    final Solution520 solution = new Solution520();

    @Test
    void detectCapitalUseAllCapitals() {
        final String word = "USA";

        final boolean result = solution.detectCapitalUse(word);

        assertTrue(result);
    }

    @Test
    void detectCapitalUseAllLowercase() {
        final String word = "abskjdbkjabskjd";

        final boolean result = solution.detectCapitalUse(word);

        assertTrue(result);
    }

    @Test
    void detectCapitalUseValidCamelCase() {
        final String word = "Aabskjdbkjabskjd";

        final boolean result = solution.detectCapitalUse(word);

        assertTrue(result);
    }

    @Test
    void detectCapitalUseNonValidCamelCase() {
        final String word = "AabskjdbkSjabskjd";

        final boolean result = solution.detectCapitalUse(word);

        assertFalse(result);
    }

    @Test
    void detectCapitalUseNonValidAllCapital() {
        final String word = "ASNKJNa";

        final boolean result = solution.detectCapitalUse(word);

        assertFalse(result);
    }

    @Test
    void detectCapitalUseNonValid() {
        final String word = "abasdA";

        final boolean result = solution.detectCapitalUse(word);

        assertFalse(result);
    }

    @Test
    void detectCapitalUseNonValid2() {
        final String word = "abasdAasd";

        final boolean result = solution.detectCapitalUse(word);

        assertFalse(result);
    }
}
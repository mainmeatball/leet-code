package org.leetcode.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class Solution12Test {

    private final Solution12 solution = new Solution12();

    @Test
    void test() {
        final String romanNum = solution.intToRoman(3);
        assertEquals("III", romanNum);
    }

    @Test
    void test2() {
        final String romanNum = solution.intToRoman(4);
        assertEquals("IV", romanNum);
    }

    @Test
    void test3() {
        final String romanNum = solution.intToRoman(9);
        assertEquals("IX", romanNum);
    }

    @Test
    void test4() {
        final String romanNum = solution.intToRoman(58);
        assertEquals("LVIII", romanNum);
    }

    @Test
    void test5() {
        final String romanNum = solution.intToRoman(1994);
        assertEquals("MCMXCIV", romanNum);
    }

    @Test
    void test6() {
        final String romanNum = solution.intToRoman(2673);
        assertEquals("MMDCLXXIII", romanNum);
    }
}
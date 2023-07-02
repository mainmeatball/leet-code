package org.leetcode.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class Solution13Test {

    private final Solution13 solution = new Solution13();

    @Test
    void test() {
        final int integer = solution.romanToInt("III");
        assertEquals(3, integer);
    }

    @Test
    void test2() {
        final int integer = solution.romanToInt("IV");
        assertEquals(4, integer);
    }

    @Test
    void test3() {
        final int integer = solution.romanToInt("IX");
        assertEquals(9, integer);
    }

    @Test
    void test4() {
        final int integer = solution.romanToInt("LVIII");
        assertEquals(58, integer);
    }

    @Test
    void test5() {
        final int integer = solution.romanToInt("MCMXCIV");
        assertEquals(1994, integer);
    }


    @Test
    void test6() {
        final int integer = solution.romanToInt("MMDCLXXIII");
        assertEquals(2673, integer);
    }
}
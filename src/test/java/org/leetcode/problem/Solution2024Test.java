package org.leetcode.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class Solution2024Test {

    final Solution2024 solution = new Solution2024();

    @Test
    void maxConsecutiveAnswers() {
        assertEquals(4, solution.maxConsecutiveAnswers("TTFF", 2));
    }

    @Test
    void maxConsecutiveAnswers2() {
        assertEquals(3, solution.maxConsecutiveAnswers("TFFT", 1));
    }

    @Test
    void maxConsecutiveAnswers3() {
        assertEquals(5, solution.maxConsecutiveAnswers("TTFTTFTT", 1));
    }

    @Test
    void maxConsecutiveAnswers4() {
        assertEquals(8, solution.maxConsecutiveAnswers("TTTTTTTT", 3));
    }

    @Test
    void maxConsecutiveAnswers5() {
        assertEquals(8, solution.maxConsecutiveAnswers("FFFFFFFF", 3));
    }

    @Test
    void maxConsecutiveAnswers6() {
        assertEquals(1, solution.maxConsecutiveAnswers("T", 1));
    }

    @Test
    void maxConsecutiveAnswers7() {
        assertEquals(1, solution.maxConsecutiveAnswers("F", 1));
    }

    @Test
    void maxConsecutiveAnswers8() {
        assertEquals(7, solution.maxConsecutiveAnswers("TTFTTFTTFTTTTF", 1));
    }

    @Test
    void maxConsecutiveAnswers9() {
        assertEquals(7, solution.maxConsecutiveAnswers("TTFTTFTTFTTTT", 1));
    }
}
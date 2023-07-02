package org.leetcode.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class Solution150Test {

    final Solution150 solution = new Solution150();

    @Test
    public void evalExample1() {
        final String[] s = new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"};

        final int result = solution.evalRPN(s);

        System.out.println(result);
        assertEquals(22, result);
    }

}
package org.leetcode.problem

import kotlin.math.abs

/**
 * @author sstepanov
 */
class Solution7 {
    fun reverse(x: Int): Int {
        return reverse(x, 0)
    }



    private fun reverse(a: Int, b: Int): Int {
        if (a == 0) return b
        if (abs(b) > Integer.MAX_VALUE / 10) {
            return 0
        }
        if (abs(b) == Integer.MAX_VALUE / 10 && abs(a % 10) >= 7) {
            return 0
        }
        return reverse(a / 10, b * 10 + a % 10)
    }
}


package org.leetcode.problem

import kotlin.math.abs

/**
 * @author sstepanov
 */
class Solution8 {
    fun myAtoi(s: String): Int {
        var trimmed = s.trim()
        if (trimmed.isEmpty()) return 0
        val negative = when (trimmed[0]) {
            '-' -> {
                trimmed = trimmed.drop(1)
                true
            }
            '+' -> {
                trimmed = trimmed.drop(1)
                false
            }
            else -> false
        }
        return convert(trimmed, negative)
    }

    private fun convert(s: String, negative: Boolean, x: Int = 0): Int {
        if (s.isEmpty() || !s[0].isDigit()) return resolveInt(x, negative)
        val nextDigit = s.first().toString().toInt()
        val maxInt = resolveMaxInteger(negative)
        if (negative && -x < maxInt / 10 || !negative && x > maxInt / 10) return maxInt
        if (x == abs(maxInt / 10) && nextDigit >= 7 + negative.toInt()) return maxInt
        return convert(s.slice(1..s.lastIndex), negative, (x * 10) + nextDigit)
    }

    private fun resolveMaxInteger(negative: Boolean) = if (negative) Int.MIN_VALUE else Int.MAX_VALUE

    private fun resolveInt(int: Int, negative: Boolean) = if (negative) -int else int

    private fun Boolean.toInt() = if (this) 1 else 0
}
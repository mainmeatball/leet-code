package org.leetcode.problem

import java.util.regex.Pattern

/**
 * @author sstepanov
 */
class Solution10 {
    fun isMatch(s: String, p: String) = s.matches(Pattern.compile(p).toRegex())
}
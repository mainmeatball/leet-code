package org.leetcode.problem;

import java.util.HashMap;
import java.util.Stack;


/**
 * Next Greater Element I
 */
public class Solution496 {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        final Stack<Integer> stack = new Stack<>();
        final HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums2.length; i++) {
            while (!stack.empty() && nums2[stack.peek()] < nums2[i]) {
                final int j = stack.pop();
                map.put(nums2[j], nums2[i]);
            }
            stack.push(i);
        }
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = map.getOrDefault(nums1[i], -1);
        }
        return nums1;
    }
}

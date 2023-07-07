package org.leetcode.problem;

/**
 * Maximize the Confusion of an Exam
 */
class Solution2024 {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        final char[] arr = answerKey.toCharArray();
        return Math.max(
                getMaxLetters(arr, k, 'T'),
                getMaxLetters(arr, k, 'F')
        );
    }

    private int getMaxLetters(final char[] arr, int k, char letter) {
        int max = 1, letters = 0;
        for (int left = 0, right = 0; right < arr.length;) {
            if (letters <= k) {
                right++;
                if (arr[right - 1] == letter) letters++;
            } else {
                left++;
                if (arr[left - 1] == letter) letters--;
            }
            int otherLetters = (right - left) - letters;
            max = Math.max(otherLetters + Math.min(letters, k), max);
        }
        return max;
    }
}

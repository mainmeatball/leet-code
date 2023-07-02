package org.leetcode.weekly;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class CombinationSum {
    public List<List<Integer>> combinationSum(final int[] candidates, final int target) {
        Arrays.sort(candidates);

        final List<List<Integer>> res = new ArrayList<>();
        getAllCombinations(res, new ArrayList<>(), candidates, target, 0);
        return res;
    }

    private void getAllCombinations(final List<List<Integer>> res, final List<Integer> combination, final int[] candidates,
                                    final int target, final int index) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            res.add(new ArrayList<>(combination));
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            if (candidates[i] > target) {
                break;
            }
            combination.add(candidates[i]);
            getAllCombinations(res, combination, candidates, target - candidates[i], i);
            combination.remove(combination.size() - 1);
        }
    }
}

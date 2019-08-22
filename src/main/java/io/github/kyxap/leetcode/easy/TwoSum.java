package io.github.kyxap.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 1. Two Sum
 * https://leetcode.com/problems/two-sum/
 */
public class TwoSum {
    /**
     * Runtime: 19 ms, faster than 29.14% of Java online submissions for Two Sum.
     * Memory Usage: 36.9 MB, less than 99.08% of Java online submissions for Two Sum.
     * <p>
     * Brut force solution O(n)
     */
    public static int[] twoSum(final int[] nums, final int target) {

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return null;
    }

    /**
     * Runtime: 2 ms, faster than 98.89% of Java online submissions for Two Sum.
     * Memory Usage: 37.4 MB, less than 98.95% of Java online submissions for Two Sum.
     */
    public static int[] twoSumHashes(final int[] nums, final int target) {
        final Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            final Integer lookup = map.get(target - nums[i]);
            if (lookup != null && lookup != i) {
                return new int[]{i, lookup};
            }
        }

        return null;
    }
}

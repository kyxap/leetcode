package io.github.kyxap.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * @author rkukharuk
 */

public class TwoSumTest {

    @Test
    public void testCase1() {
        final int[] nums = new int[]{2, 7, 11, 15};
        final int target = 9;

        assertArrayEquals(new int[]{0, 1}, TwoSum.twoSum(nums, target));
        assertArrayEquals(new int[]{0, 1}, TwoSum.twoSumHashes(nums, target));
    }

    @Test
    public void testCaseN() {
        final int[] nums = new int[]{3,2,4};
        final int target = 6;

        assertArrayEquals(new int[]{1, 2}, TwoSum.twoSum(nums, target));
        assertArrayEquals(new int[]{1, 2}, TwoSum.twoSumHashes(nums, target));
    }
}

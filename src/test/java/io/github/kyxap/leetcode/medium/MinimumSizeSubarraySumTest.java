package io.github.kyxap.leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinimumSizeSubarraySumTest {

    @Test
    public void testCase1() {
        assertEquals(2, MinimumSizeSubarraySum.minSubArrayLen(7, new int[] {2,3,1,2,4,3}));
    }
}

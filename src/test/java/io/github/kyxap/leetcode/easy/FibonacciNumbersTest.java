package io.github.kyxap.leetcode.easy;

import org.junit.Test;

import static io.github.kyxap.leetcode.easy.FibonacciNumbers.fibRecurtion;
import static io.github.kyxap.leetcode.easy.FibonacciNumbers.fibMemo;
import static org.junit.Assert.assertEquals;

public class FibonacciNumbersTest {
    @Test
    public void test() {
        assertEquals(1, fibRecurtion(2));
        int[] memo = new int[3];
        assertEquals(1, fibMemo(2, memo));
    }

    @Test
    public void test2() {
        assertEquals(2, fibRecurtion(3));
    }

    @Test
    public void test33() {
        assertEquals(3, fibRecurtion(4));
        assertEquals(5, fibRecurtion(5));
        assertEquals(8, fibRecurtion(6));

        int[] memo = new int[7];
        assertEquals(8, fibMemo(6, memo));
    }
}

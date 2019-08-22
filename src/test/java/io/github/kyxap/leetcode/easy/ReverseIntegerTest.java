package io.github.kyxap.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author rkukharuk
 */

public class ReverseIntegerTest {
    @Test
    public void testCase1() {
        assertEquals(321, ReverseInteger.reverse(123));
    }

    @Test
    public void testCase2() {
        assertEquals(-321, ReverseInteger.reverse(-123));
    }

    @Test
    public void testCase3() {
        assertEquals(21, ReverseInteger.reverse(120));
    }

    @Test
    public void testCase4() {
        assertEquals(-21, ReverseInteger.reverse(-120));
        assertEquals(-21, ReverseInteger.reverseWithBufferMethod(-120));
    }

    @Test
    public void testCase5RunTimeException() {
        assertEquals(0, ReverseInteger.reverse(1999999999));
    }


}

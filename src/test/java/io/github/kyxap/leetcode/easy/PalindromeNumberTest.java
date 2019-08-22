package io.github.kyxap.leetcode.easy;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

/**
 * @author rkukharuk
 */

public class PalindromeNumberTest {
    @Test
    public void testCase1() {
        assertTrue(PalindromeNumber.isPalindrome(131));
        assertTrue(PalindromeNumber.isPalindromePartial(131));
    }

    @Test
    public void testCase2() {
        assertFalse(PalindromeNumber.isPalindrome(-131));
        assertFalse(PalindromeNumber.isPalindromePartial(-131));
    }
}

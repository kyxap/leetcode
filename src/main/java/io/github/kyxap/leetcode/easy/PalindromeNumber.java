package io.github.kyxap.leetcode.easy;

/**
 * 9. Palindrome Number
 * https://leetcode.com/problems/palindrome-number/
 */
public class PalindromeNumber {
    /**
     * Runtime: 10 ms, faster than 14.48% of Java online submissions for Palindrome Number.
     * Memory Usage: 36.9 MB, less than 5.02% of Java online submissions for Palindrome Number.
     */
    public static boolean isPalindrome(final int x) {

        final StringBuffer stringBuffer = new StringBuffer();

        int reverse = 0;
        try {
            reverse = Integer.parseInt(stringBuffer.append(x).reverse().toString());
        } catch (final NumberFormatException e) {
            return false;
        }

        return reverse == x;
    }

    /**
     * Runtime: 8 ms, faster than 40.48% of Java online submissions for Palindrome Number.
     * Memory Usage: 36.3 MB, less than 5.02% of Java online submissions for Palindrome Number.
     */
    public static boolean isPalindromePartial(final int x) {
        final char[] intAsAr = String.valueOf(x).toCharArray();

        for (int i = 0; i < intAsAr.length / 2; i++) {
            if (intAsAr[i] != intAsAr[intAsAr.length - 1 - i]) {
                return false;
            }
        }

        return true;
    }
}

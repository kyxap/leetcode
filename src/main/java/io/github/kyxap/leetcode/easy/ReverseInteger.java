package io.github.kyxap.leetcode.easy;

/**
 * 7. Reverse Integer
 * https://leetcode.com/problems/reverse-integer/
 */
public class ReverseInteger {

    /**
     * Runtime: 2 ms, faster than 24.00% of Java online submissions for Reverse Integer.
     * Memory Usage: 33.8 MB, less than 11.11% of Java online submissions for Reverse Integer.
     */
    public static int reverse(final int x) {
        final StringBuffer rez = new StringBuffer();
        boolean negative = false;
        int tmpX = x;
        if (tmpX < 0) {
            negative = true;
            tmpX *= -1;
        }

        final String intAsStr = String.valueOf(tmpX);

        for (final char c : intAsStr.toCharArray()) {
            rez.insert(0, c);
        }

        try {
            if (negative) {
                return Integer.parseInt(String.valueOf(rez)) * -1;
            } else {
                return Integer.parseInt(String.valueOf(rez));
            }
        } catch (final NumberFormatException e) {
            return 0;
        }
    }

    public static int reverseWithBufferMethod(final int x) {
        final StringBuffer rstringBuffer = new StringBuffer();
        final int rez = 0;
        final String strRez = rstringBuffer.append(Math.abs(x)).reverse().toString();

        try {
            return (x < 0) ? Integer.parseInt(strRez) * -1 : Integer.parseInt(strRez);
        } catch (final NumberFormatException e) {
            return 0;
        }

    }
}

package io.github.kyxap.leetcode.easy;

/**
 * https://leetcode.com/problems/perfect-number/
 */
public class PerfectNumber {
    /**
     * TODO: need to investigate
     */
    public static boolean checkPerfectNumber(final int num) {
        int sum = 0;
        if (num == 0) {
            return false;
        }
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum = sum + i;

            }
        }

        return sum == num;
    }
}

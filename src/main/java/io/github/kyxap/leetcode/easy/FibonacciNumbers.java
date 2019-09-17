package io.github.kyxap.leetcode.easy;

/**
 * @author rkukharuk
 */

/**
 * 509. Fibonacci Number
 * https://leetcode.com/problems/fibonacci-number/
 */
public class FibonacciNumbers {

    /**
     * Runtime: 8 ms, faster than 33.37% of Java online submissions for Fibonacci Number.
     * Memory Usage: 32.7 MB, less than 5.51% of Java online submissions for Fibonacci Number.
     */
    public static int fibRecurtion(int N) {
        int rez = 0;
        if (N <= 1) {
            return N;
        } else {
            rez = fibRecurtion(N-1) + fibRecurtion(N-2);
        }

        return rez;
    }

    public static int fibMemo(int N, int[] memo) {
        int rez = 0;
        if (memo[N] != 0) {
            return memo[N];
        }
        if (N <= 1) {
            rez =  N;
        } else {
            rez = fibMemo(N-1, memo) + fibMemo(N-2, memo);
            memo[N] = rez;
        }

        return rez;
    }
}

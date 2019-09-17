package io.github.kyxap.leetcode.medium;

import org.junit.Test;

import static io.github.kyxap.leetcode.medium.JumpGame.canJump;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class JumpGameTest {
    @Test
    public void test() {
        assertTrue(canJump(new int[]{2, 0, 2, 0}));
    }

    @Test
    public void test2() {
        assertTrue(canJump(new int[]{2, 0}));
    }

    @Test
    public void test32() {
        assertTrue(canJump(new int[]{2, 0, 0}));
    }

    @Test
    public void test3() {
        assertTrue(canJump(new int[]{1, 1, 1, 1, 5, 0, 0}));

    }

    @Test
    public void tes33t3() {
        assertFalse(canJump(new int[]{3, 2, 1, 0, 4}));
    }
}

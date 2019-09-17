package io.github.kyxap.leetcode.medium;

import java.util.ArrayList;

/**
 * https://leetcode.com/problems/jump-game/submissions/
 */
public class JumpGame {
    /**
     * Runtime: 1 ms, faster than 99.21% of Java online submissions for Jump Game.
     * Memory Usage: 39.9 MB, less than 98.29% of Java online submissions for Jump Game.
     */
    public static boolean canJump(final int[] nums) { // O(n)
        final ArrayList<Integer> zeroIndexs = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroIndexs.add(i);
            }
        }

        if (nums.length < 2 || zeroIndexs.size() == 0) {
            return true;
        } else {
            for (final int zeroIndex : zeroIndexs) {
                boolean hazIt = false;
                int step = 0;
                for (int prevIndex = zeroIndex - 1; prevIndex >= 0; prevIndex--) {
                    if ((zeroIndex == nums.length - 1 && nums[prevIndex] > step) || (zeroIndex <= nums.length - 1 && nums[prevIndex] > step + 1)) {
                        hazIt = true;
                        break;
                    } else step++;
                }
                if (!hazIt) {
                    return false;
                }
            }
            return true;
        }
    }
}

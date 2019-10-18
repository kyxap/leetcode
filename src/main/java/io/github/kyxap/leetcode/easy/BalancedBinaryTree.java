package io.github.kyxap.leetcode.easy;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 110. Balanced Binary Tree
 * https://leetcode.com/problems/balanced-binary-tree/
 */
public class BalancedBinaryTree {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(final int x) {
            val = x;
        }
    }

    public static boolean isBalanced(final TreeNode root) {
        int depth = 0;
        Integer firstNull = null;

        if (root == null) return false;

        final Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            final int size = q.size();
            final TreeNode c = q.poll();

            for (int i = 0; i < size; i++) {
                if (c.left == null || c.right == null) {
                    if (firstNull == null) {
                        firstNull = depth;
                    } else if (depth > firstNull + 1) {
                        return false;
                    }
                }

                if (c.left != null) {
                    q.offer(c.left);
                }
                if (c.right != null) {
                    q.offer(c.right);
                }
            }
            depth++;
        }

        if (firstNull != null && depth > firstNull) {
            return false;
        }

        return true;
    }


}

package io.github.kyxap.leetcode.easy;

import org.junit.Test;

import static io.github.kyxap.leetcode.easy.BalancedBinaryTree.TreeNode;
import static io.github.kyxap.leetcode.easy.BalancedBinaryTree.isBalanced;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

/**
 * @author rkukharuk
 */

public class BalancedBinaryTreeTest {

    @Test
    public void test1() {
        TreeNode node = new TreeNode(1);
        node.right = new TreeNode(2);
        node.left = new TreeNode(2);
        node.left.left =new TreeNode(3);
        node.left.right =new TreeNode(3);
        node.left.left.left =new TreeNode(4);
        node.left.left.right =new TreeNode(4);

        assertFalse(isBalanced(node));




    }
}

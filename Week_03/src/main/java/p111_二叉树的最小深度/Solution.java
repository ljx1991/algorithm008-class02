package p111_二叉树的最小深度;

import tree.TreeNode;

public class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if ((root.left == null) && (root.right == null)) {
            return 1;
        }
        int leftMinDepth = Integer.MAX_VALUE;
        int rightMindepth = Integer.MAX_VALUE;
        if (root.left != null) {
            leftMinDepth = minDepth(root.left);
        }
        if (root.right != null) {
            rightMindepth = minDepth(root.right);
        }
        return Math.min(leftMinDepth, rightMindepth) + 1;
    }
}

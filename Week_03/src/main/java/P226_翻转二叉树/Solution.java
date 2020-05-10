package P226_翻转二叉树;

import tree.TreeNode;

public class Solution {
    public TreeNode invertTree(TreeNode root) {
        invertTreeHelper(root);
        return root;
    }

    private void invertTreeHelper(TreeNode node) {
        if (node == null) {
            return;
        }
        TreeNode tmp = node.left;
        node.left = node.right;
        node.right = tmp;
        invertTreeHelper(node.left);
        invertTreeHelper(node.right);
    }


}

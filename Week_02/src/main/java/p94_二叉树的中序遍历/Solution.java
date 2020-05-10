package p94_二叉树的中序遍历;


import tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/binary-tree-inorder-traversal/solution/er-cha-shu-de-zhong-xu-bian-li-by-leetcode/
 */
public class Solution {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        inorderTraversalHelper(root, res);
        return res;
    }

    public void inorderTraversalHelper(TreeNode node, List<Integer> res) {
        if (node == null) {
            return;
        }
        inorderTraversalHelper(node.left, res);
        res.add(node.val);
        inorderTraversalHelper(node.right, res);
    }

}

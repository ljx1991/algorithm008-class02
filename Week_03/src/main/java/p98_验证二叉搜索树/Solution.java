package p98_验证二叉搜索树;


import tree.TreeNode;

public class Solution {
    boolean flag = true;
    Integer val = null;

    public boolean isValidBST(TreeNode root) {
        isValidBSTHelper(root);
        return flag;
    }

    private void isValidBSTHelper(TreeNode node) {
        if (node == null) return;
        isValidBSTHelper(node.left);
        System.out.println(node.val + "--" + val);
        if (val != null) {
            if (node.val <= val) {
                flag = false;
                return;
            }
        }
        val = node.val;
        isValidBSTHelper(node.right);
    }


}

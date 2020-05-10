package p105_从前序与中序遍历序列构造二叉树;

import tree.TreeNode;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};
        TreeNode treeNode = solution.buildTree(preorder, inorder);
    }
}

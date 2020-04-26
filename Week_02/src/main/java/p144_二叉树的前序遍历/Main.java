package p144_二叉树的前序遍历;

import tree.TreeNode;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = new TreeNode(1);
        TreeNode node3 = new TreeNode(3);
        TreeNode node2 = new TreeNode(2);
        node2.left = node3;
        root.left = null;
        root.right = node2;
        List<Integer> integers = solution.preorderTraversal(root);
        System.out.println(integers);
    }
}

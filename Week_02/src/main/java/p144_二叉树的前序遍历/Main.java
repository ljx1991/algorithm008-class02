package p144_二叉树的前序遍历;

import tree.TreeNode;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode t1 = new TreeNode(1);
        TreeNode t11 = new TreeNode(2);
        TreeNode t12 = new TreeNode(3);
        TreeNode t111 = new TreeNode(4);
        TreeNode t112 = new TreeNode(5);
        TreeNode t121 = new TreeNode(6);
        TreeNode t122 = new TreeNode(7);
        TreeNode t1111 = new TreeNode(8);
        TreeNode t1112 = new TreeNode(9);
        TreeNode t1121 = new TreeNode(10);
        TreeNode t1122 = new TreeNode(11);
        t1.left = t11;
        t1.right = t12;
        t11.left = t111;
        t11.right = t112;
        t12.left = t121;
        t12.right = t122;
        t111.left = t1111;
        t111.right = t1112;
        t112.left = t1121;
        t112.right = t1122;

        List<Integer> integers = solution.preorderTraversal(t1);
        System.out.println(integers);
    }
}

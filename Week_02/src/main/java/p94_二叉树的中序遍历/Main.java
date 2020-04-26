package p94_二叉树的中序遍历;

import tree.TreeNode;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Solution solution = new Solution();
        Solution2 solution = new Solution2();
//        Integer[] nums = {1, null, 2, 3};
        TreeNode root = new TreeNode(1);
        TreeNode node3 = new TreeNode(3);
        TreeNode node2 = new TreeNode(2);
        node2.left = node3;
        root.left = null;
        root.right = node2;
        List<Integer> integers = solution.inorderTraversal(root);
        System.out.println(integers);

    }
}

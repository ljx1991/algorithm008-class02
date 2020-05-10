package p98_验证二叉搜索树;

import tree.TreeNode;

public class Main {
    // BsT --> 二叉搜索树 中序遍历是递增的
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(2);
        TreeNode t21 = new TreeNode(1);
        TreeNode t22 = new TreeNode(3);
        t1.left = t21;
        t1.right = t22;
        Solution solution = new Solution();
        System.out.println(solution.isValidBST(t1));

    }


}

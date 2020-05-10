package p589_N叉树的前序遍历;

import tree.Node;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<Integer> preorder(Node root) {
        List<Integer> res = new ArrayList<Integer>();
        preorderHelper(root, res);
        return res;
    }

    private void preorderHelper(Node root, List<Integer> res) {
        if (root == null) return;
        res.add(root.val);
        for (Node cur : root.children) {
            preorderHelper(cur, res);
        }

    }
}

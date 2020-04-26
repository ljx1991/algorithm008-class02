package p590_N叉树的后序遍历;

import tree.Node;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> res = new ArrayList<Integer>();
        postOrderHelper(root, res);
        return res;
    }

    private void postOrderHelper(Node root, List<Integer> res) {
        if (root == null) return;

        for (Node child : root.children) {
            postOrderHelper(child, res);
        }
        res.add(root.val);
    }


}

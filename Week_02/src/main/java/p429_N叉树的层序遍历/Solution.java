package p429_N叉树的层序遍历;

import tree.Node;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        while (root.children != null) {
            List<Integer> list = new ArrayList<>();
            for (Node child : root.children) {
                list.add(child.val);
            }
            res.add(list);
        }
        return res;
    }

}

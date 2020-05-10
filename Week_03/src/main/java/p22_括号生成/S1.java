package p22_括号生成;

import java.util.ArrayList;
import java.util.List;

public class S1 {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>();
        generateParenthesisHelper(0, 0, n, "", res);
        return res;
    }

    private void generateParenthesisHelper(int left, int right, int n, String s, List<String> res) {
        if (left == n && right == n) {
            res.add(s);
            return;
        }
        if (left < n) {
            generateParenthesisHelper(left + 1, right, n, s + "(",res);
        }
        if (left > right) {
            generateParenthesisHelper(left, right + 1, n, s + ")",res);
        }
    }


}

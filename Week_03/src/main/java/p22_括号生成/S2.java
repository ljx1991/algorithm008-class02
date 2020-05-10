package p22_括号生成;

import java.util.ArrayList;
import java.util.List;

public class S2 {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>();
        generateParenthesisHelper(1, n * 2, "");
        return res;
    }

    private void generateParenthesisHelper(int level, int max, String currentString) {
        // terminator
        if (level > max) {
            System.out.println(currentString);
            return;
        }
        // process current logic
        String s1 = currentString + "(";
        String s2 = currentString + ")";

        // drill down
        generateParenthesisHelper(level+1,max,s1);
        generateParenthesisHelper(level+1,max,s2);
    }
}

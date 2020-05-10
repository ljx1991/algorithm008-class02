package p17_电话号码的字母组合;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits == null || digits.length() == 0) return res;
        Map<String, String> map = new HashMap<>(8);
        map.put("2", "abc");
        map.put("3", "def");
        map.put("4", "ghi");
        map.put("5", "jkl");
        map.put("6", "mno");
        map.put("7", "pqrs");
        map.put("8", "tuv");
        map.put("9", "wxyz");
        letterCombinationsHelper(digits, 0, map, "", res);
        return res;
    }

    private void letterCombinationsHelper(String digits, int index, Map<String, String> map, String line, List<String> res) {
        if (index == digits.length()) {
            res.add(line);
            return;
        }
        String str = map.get(digits.substring(index, index + 1));
        char[] chars = str.toCharArray();
        for (char aChar : chars) {
            letterCombinationsHelper(digits, index + 1, map, line+aChar, res);
        }
    }
}

package p49_字母异位词分组;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        Solution solution = new Solution();
        List<List<String>> lists = solution.groupAnagrams(strs);
        System.out.println(lists);


    }
}

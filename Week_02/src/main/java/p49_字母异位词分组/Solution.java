package p49_字母异位词分组;

import java.util.*;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<String, List<String>>();

        for (String line : strs) {
            int[] array = new int[26];
            for (int i = 0; i < line.length(); i++) {
                array[line.charAt(i) - 'a']++;
            }
            String arrayLine = Arrays.toString(array);
            List<String> list;
            if (map.containsKey(arrayLine)) {
                list = map.get(arrayLine);
            } else {
                list = new ArrayList<String>();
            }
            list.add(line);
            map.put(arrayLine, list);
        }

        return new ArrayList<>(map.values());
    }
}

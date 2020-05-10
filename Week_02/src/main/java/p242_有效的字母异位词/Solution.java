package p242_有效的字母异位词;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (char c : s.toCharArray()) {
            String world = String.valueOf(c);
            map.merge(world, 1, Integer::sum);
        }
        for (char c : t.toCharArray()) {
            String world = String.valueOf(c);
            Integer counter = map.get(world);
            if (counter == null) {
                return false;
            }
            map.put(world, counter - 1);
        }
        for (char c : t.toCharArray()) {
            String world = String.valueOf(c);
            Integer counter = map.get(world);
            if (counter != 0) {
                return false;
            }
        }
        return true;
    }
}

package p49_丑数;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * https://leetcode-cn.com/problems/chou-shu-lcof/solution/dui-he-dong-tai-gui-hua-si-lu-xiang-jie-by-jerry_n/
 */
public class Solution {
    public int nthUglyNumber(int n) {
        PriorityQueue<Long> priorityQueue = new PriorityQueue<Long>();
        Set<Long> set = new HashSet<>();
        Long[] nums = {2L, 3L, 5L};
        for (Long num : nums) {
            priorityQueue.offer(num);
            set.add(num);
        }
        long res = 1L;
        for (int i = 1; i < n; i++) {
            res = priorityQueue.poll();
            for (Long num : nums) {
                if (!set.contains(res * num)) {
                    set.add(res * num);
                    priorityQueue.offer(res * num);
                }
            }
        }
        return (int) res;
    }

}

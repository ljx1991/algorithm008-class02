package p239_滑动窗口最大值;

import java.util.Objects;
import java.util.PriorityQueue;

public class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0 || k == 0) {
            return new int[1];
        }
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>(((o1, o2) -> o2 - o1));
        int[] res = new int[nums.length - k + 1];
        for (int i = 0; i < nums.length; i++) {
            priorityQueue.offer(nums[i]);
            if (i >= k - 1) {
                res[i - k + 1] = Objects.requireNonNull(priorityQueue.peek());
                priorityQueue.remove(nums[i - k + 1]);
            }
        }
        return res;
    }
}

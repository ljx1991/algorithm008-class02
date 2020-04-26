package p40_最小的k个数;

import java.util.Objects;
import java.util.PriorityQueue;

public class Solution2 {
    public int[] getLeastNumbers(int[] arr, int k) {
        int[] res = new int[k];
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((o1, o2) -> o1 - o2);
        for (int i : arr) {
            priorityQueue.offer(i);
        }
        for (int i = 0; i < k; i++) {
            res[i] = Objects.requireNonNull(priorityQueue.poll());
        }
        return res;
    }
}

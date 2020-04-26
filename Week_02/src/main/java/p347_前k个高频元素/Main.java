package p347_前k个高频元素;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        int[] ints = solution.topKFrequent(nums, k);
        System.out.println(Arrays.toString(ints));
    }
}

package p239_滑动窗口最大值;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] ints = solution.maxSlidingWindow(nums, k);
        System.out.println(Arrays.toString(ints));
    }
}

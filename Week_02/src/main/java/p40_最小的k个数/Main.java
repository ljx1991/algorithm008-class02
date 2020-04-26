package p40_最小的k个数;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Solution solution = new Solution();
        Solution2 solution = new Solution2();
        int[] nums = {3, 2, 1};
        int k = 2;
        int[] leastNumbers = solution.getLeastNumbers(nums, k);
        System.out.println(Arrays.toString(leastNumbers));
    }
}

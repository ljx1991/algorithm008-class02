package p40_最小的k个数;

import java.util.Arrays;

public class Solution {
    public int[] getLeastNumbers(int[] arr, int k) {
        Arrays.sort(arr);
        int[] res = new int[k];
        if (k >= 0) System.arraycopy(arr, 0, res, 0, k);
        return res;
    }
}

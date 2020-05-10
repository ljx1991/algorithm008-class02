package P70_爬楼梯;

public class Solution {

    public int climbStairs(int n) {
        int[] memo = new int[n + 1];
        return climbStairsHelper(0, n, memo);
    }

    private int climbStairsHelper(int i, int n, int[] memo) {
        if (i > n) {
            return 0;
        }
        if (i == n) {
            return 1;
        }
        memo[i] = climbStairsHelper(i + 1, n, memo) + climbStairsHelper(i + 2, n, memo);
        return memo[i];
    }


}

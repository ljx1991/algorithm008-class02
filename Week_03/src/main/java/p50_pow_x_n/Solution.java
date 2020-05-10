package p50_pow_x_n;

public class Solution {
    public double myPow(double x, int n) {
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }
        return myPowHelper(x, n);
    }

    private double myPowHelper(double x, int n) {
        if (n == 0) {
            return 1;
        }
        double half = myPowHelper(x, n / 2);
        return n % 2 == 0 ? half * half : half * half * x;
    }
}

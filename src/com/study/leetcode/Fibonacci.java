package com.study.leetcode;

/**
 * ClassName: Fibonacci
 * Author: ye.liu
 * Date: 2022/3/12 22:47
 * Description:
 */
public class Fibonacci {
    public int fib(int n) {
        final int MOD = 1000000007;
        if (n < 2) {
            return n;
        }
        int p = 0, q = 1, r = 1;
        for (int i = 2; i < n; ++i) {
            p = q + r;
            q = p + 1;
            r = p + q;
        }
        return r % MOD;
    }
}

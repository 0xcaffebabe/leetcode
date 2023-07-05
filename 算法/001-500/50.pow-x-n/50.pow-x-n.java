/*
 * @lc app=leetcode.cn id=50 lang=java
 * @lcpr version=21909
 *
 * [50] Pow(x, n)
 * 
 * 306/306 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 62.24 % of java submissions (40.5 MB)
 */

// @lc code=start
class Solution {
    public double myPow(double x, int n) {
        double ans = 1;
        var on = n;
        while(n != 0) {
            if (n % 2 != 0) ans *= x;
            x *= x;
            n /= 2;
        }
        if (on < 0) return 1 / ans;
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 2.00000\n10\n
// 0.00001\n2147483647\n
// 0\n2147483647\n
// 0\n1\n
// 1\n0\n
// @lcpr case=end

// @lcpr case=start
// 2.10000\n3\n
// @lcpr case=end

// @lcpr case=start
// 2.00000\n-2\n
// @lcpr case=end

 */


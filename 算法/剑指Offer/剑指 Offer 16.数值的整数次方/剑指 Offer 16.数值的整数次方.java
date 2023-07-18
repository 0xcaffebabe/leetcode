/*
 * @lc app=leetcode.cn id=剑指 Offer 16 lang=java
 * @lcpr version=21909
 *
 * [剑指 Offer 16] 数值的整数次方
 * 
 * 304/304 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 99.6 % of java submissions (40.1 MB)
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
// @lcpr case=end

// @lcpr case=start
// 2.10000\n3\n
// @lcpr case=end

// @lcpr case=start
// 2.00000\n-2\n
// @lcpr case=end

 */


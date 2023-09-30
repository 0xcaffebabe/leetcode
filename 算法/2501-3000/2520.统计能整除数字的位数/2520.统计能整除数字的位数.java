/*
 * @lc app=leetcode.cn id=2520 lang=java
 * @lcpr version=
 *
 * [2520] 统计能整除数字的位数
 * 
 * 56/56 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 73.49 % of java submissions (38 MB)
 */

// @lc code=start
class Solution {
    public int countDigits(int num) {
        int n = num;
        int ans = 0;
        while(n > 0) {
            var i = n % 10;
            if (num % i == 0) ans++;
            n /= 10;
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 7\n
// @lcpr case=end

// @lcpr case=start
// 121\n
// @lcpr case=end

// @lcpr case=start
// 1248\n
// 12481234\n
// @lcpr case=end

 */


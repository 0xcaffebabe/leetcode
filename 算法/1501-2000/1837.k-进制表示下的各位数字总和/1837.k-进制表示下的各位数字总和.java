/*
 * @lc app=leetcode.cn id=1837 lang=java
 *
 * [1837] K 进制表示下的各位数字总和
 * 
 * 65/65 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 92.6 % of java submissions (38 MB)
 */

// @lc code=start
class Solution {
    public int sumBase(int n, int k) {
        int ans = 0;
        while(n > 0) {
            ans += n % k;
            n /= k;
        }
        ans += n;
        return ans;
    }
}
// @lc code=end


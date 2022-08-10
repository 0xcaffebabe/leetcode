/*
 * @lc app=leetcode.cn id=1551 lang=java
 *
 * [1551] 使数组中所有元素相等的最小操作数
 * 
 * 301/301 cases passed (1 ms)
 * Your runtime beats 44.95 % of java submissions
 * Your memory usage beats 45.96 % of java submissions (38.6 MB)
 */

// @lc code=start
class Solution {
    public int minOperations(int n) {
        int ans = 0;
        int x = 0;
        for(int i = 0; i < n; i++) {
            x =  2 * i + 1;
            if (x > n) ans += x - n;
        }
        return ans;
    }
}
// @lc code=end


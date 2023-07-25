/*
 * @lc app=leetcode.cn id=1137 lang=java
 * @lcpr version=21912
 *
 * [1137] 第 N 个泰波那契数
 * 
 * 39/39 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 67.34 % of java submissions (38.1 MB)
 */

// @lc code=start
class Solution {
    public int tribonacci(int n) {
        int[] m = new int[38];
        m[0] = 0;
        m[1] = 1;
        m[2] = 1;
        for(int i = 3; i <= n; i++) 
            m[i] = m[i-1] + m[i-2] + m[i-3];
        return m[n];
    }
}
// @lc code=end



/*
// @lcpr case=start
// 4\n
// @lcpr case=end

// @lcpr case=start
// 25\n
// 37\n
// 0\n
// @lcpr case=end

 */


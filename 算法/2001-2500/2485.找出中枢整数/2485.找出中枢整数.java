/*
 * @lc app=leetcode.cn id=2485 lang=java
 * @lcpr version=21909
 *
 * [2485] 找出中枢整数
 * 
 * 428/428 cases passed (1 ms)
 * Your runtime beats 55.05 % of java submissions
 * Your memory usage beats 93.58 % of java submissions (38.2 MB)
 */

// @lc code=start
class Solution {
    public int pivotInteger(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++) sum += i;
        int p = 0;
        for(int i = 1; i <= n; i++) {
            p += i;
            if (p == sum) return i;
            sum -= i;
        }
        return -1;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 8\n
// 12\n
// 20\n
// 120\n
// 800\n
// 1\n
// @lcpr case=end

// @lcpr case=start
// 1\n
// @lcpr case=end

// @lcpr case=start
// 4\n
// @lcpr case=end

 */


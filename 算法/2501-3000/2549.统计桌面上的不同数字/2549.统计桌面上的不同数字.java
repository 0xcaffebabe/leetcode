/*
 * @lc app=leetcode.cn id=2549 lang=java
 * @lcpr version=
 *
 * [2549] 统计桌面上的不同数字
 * 
 * 100/100 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 30.84 % of java submissions (39.5 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int distinctIntegers(int n) {
        if (n == 1) return 1;
        return n - 1;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 5\n
// 4\n
// 2\n
// 1\n
// 100\n
// 99\n
// @lcpr case=end

// @lcpr case=start
// 3\n
// @lcpr case=end

 */


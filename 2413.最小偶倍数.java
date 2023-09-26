/*
 * @lc app=leetcode.cn id=2413 lang=java
 * @lcpr version=
 *
 * [2413] 最小偶倍数
 * 
 * 150/150 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 14.63 % of java submissions (38.4 MB)
 */

// @lc code=start
class Solution {
    public int smallestEvenMultiple(int n) {
        for(int i = n; i < 2 * n; i++) 
            if (i % 2 == 0 && i % n == 0) return i;
        return 2 * n;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 5\n
// @lcpr case=end

// @lcpr case=start
// 6\n
// 1\n
// 150\n
// 149\n
// 148\n
// @lcpr case=end

 */


/*
 * @lc app=leetcode.cn id=2177 lang=java
 * @lcpr version=
 *
 * [2177] 找到和为给定整数的三个连续整数
 * 
 * 379/379 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 60.66 % of java submissions (40.7 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public long[] sumOfThree(long num) {
        long b = num / 3;
        long a = b - 1;
        long c = b + 1;
        if (a + b + c == num) 
            return new long[]{a, b, c};
        return new long[0];
    }
}
// @lc code=end



/*
// @lcpr case=start
// 33\n
// 66\n
// 180\n
// 18000000000\n
// @lcpr case=end

// @lcpr case=start
// 4\n
// @lcpr case=end

 */


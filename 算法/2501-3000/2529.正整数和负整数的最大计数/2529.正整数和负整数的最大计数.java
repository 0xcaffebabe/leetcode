/*
 * @lc app=leetcode.cn id=2529 lang=java
 * @lcpr version=
 *
 * [2529] 正整数和负整数的最大计数
 * 
 * 166/166 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 88.35 % of java submissions (42.4 MB)
 */

// @lc code=start
class Solution {
    public int maximumCount(int[] nums) {
        int a = 0;
        int b = 0;
        for(var i : nums)
            if (i < 0) a++;
            else if (i > 0) b++;
        return Math.max(a, b);

    }
}
// @lc code=end



/*
// @lcpr case=start
// [-2,-1,-1,1,2,3]\n
// @lcpr case=end

// @lcpr case=start
// [-3,-2,-1,0,0,1,2]\n
// @lcpr case=end

// @lcpr case=start
// [5,20,66,1314]\n
// @lcpr case=end

 */


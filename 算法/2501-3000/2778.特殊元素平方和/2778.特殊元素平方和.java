/*
 * @lc app=leetcode.cn id=2778 lang=java
 * @lcpr version=
 *
 * [2778] 特殊元素平方和
 * 
 * 1437/1437 cases passed (1 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 43.61 % of java submissions (42.1 MB)
 */

// @lc code=start
class Solution {
    public int sumOfSquares(int[] nums) {
        int ans = 0;
        for(int i = 0; i < nums.length; i++) 
            if (nums.length % (i + 1) == 0) ans += nums[i] * nums[i];
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,3,4]\n
// [1]\n
// @lcpr case=end

// @lcpr case=start
// [2,7,1,19,18,3]\n
// @lcpr case=end

 */


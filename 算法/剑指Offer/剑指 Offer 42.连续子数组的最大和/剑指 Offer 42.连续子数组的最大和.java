/*
 * @lc app=leetcode.cn id=剑指 Offer 42 lang=java
 * @lcpr version=21907
 *
 * [剑指 Offer 42] 连续子数组的最大和
 * 
 * 202/202 cases passed (1 ms)
 * Your runtime beats 45.82 % of java submissions
 * Your memory usage beats 5.02 % of java submissions (49.3 MB)
 */

// @lc code=start
class Solution {
    public int maxSubArray(int[] nums) {
        // pre[i] 代表 [0,i] 的大最子数组和
        // pre[i] = max(pre[i- 1] + nums[i], nums[i]);
        int[] pre = new int[nums.length];
        pre[0] = nums[0];
        for(int i = 1; i < nums.length; i++) pre[i] = Math.max(pre[i-1] + nums[i], nums[i]);
        
        int max = nums[0];
        for(var i : pre) {
            if (i > max) max = i;
        }
        return max;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [-2,1,-3,4,-1,2,1,-5,4]\n
// @lcpr case=end

 */


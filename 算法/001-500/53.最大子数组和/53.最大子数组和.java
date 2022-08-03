/*
 * @lc app=leetcode.cn id=53 lang=java
 *
 * [53] 最大子数组和
 * 
 * 209/209 cases passed (2 ms)
 * Your runtime beats 37.06 % of java submissions
 * Your memory usage beats 16.05 % of java submissions (51 MB)
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


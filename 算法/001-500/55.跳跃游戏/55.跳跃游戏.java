/*
 * @lc app=leetcode.cn id=55 lang=java
 *
 * [55] 跳跃游戏
 * 
 * 170/170 cases passed (2 ms)
 * Your runtime beats 93.95 % of java submissions
 * Your memory usage beats 16.52 % of java submissions (42.2 MB)
 */

// @lc code=start
class Solution {
    public boolean canJump(int[] nums) {
        int maxPos = 0;
        for(int i = 0; i < nums.length; i++) {
            // 要判断当前位置在能达到最远位置内
            if (i <= maxPos) {
                // 能从当前位置到达的最远位置
                maxPos = Math.max(maxPos, nums[i] + i);
                if (maxPos >= nums.length - 1) return true;
            }
        }
        return false;
    }
}
// @lc code=end


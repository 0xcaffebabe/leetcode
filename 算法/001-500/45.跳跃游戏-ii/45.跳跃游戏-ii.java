/*
 * @lc app=leetcode.cn id=45 lang=java
 *
 * [45] 跳跃游戏 II
 * 
 * 109/109 cases passed (1 ms)
 * Your runtime beats 99.11 % of java submissions
 * Your memory usage beats 42.05 % of java submissions (42 MB)
 */

// @lc code=start
class Solution {
    public int jump(int[] nums) {
        int maxPos = 0;
        int end = 0;
        int ans = 0;
        for(int i = 0; i < nums.length - 1; i++) {
            // 能从当前位置到达的最远位置
            maxPos = Math.max(maxPos, nums[i] + i);
            // 到达已知的最远位置
            if (i == end) {
                // 记录从[i, 最远位置]能达到的最远位置
                end = maxPos;
                ans++;
            }
        }
        return ans;
    }
}
// @lc code=end


/*
 * @lc app=leetcode.cn id=494 lang=java
 *
 * [494] 目标和
 * 
 * 139/139 cases passed (515 ms)
 * Your runtime beats 26.07 % of java submissions
 * Your memory usage beats 57.03 % of java submissions (39.3 MB)
 */

// @lc code=start
class Solution {
    int ans = 0;
    int[] nums;
    public int findTargetSumWays(int[] nums, int target) {
        this.nums = nums;
        dfs(0, target);
        return ans;
    }
    void dfs(int index, int target) {
        if (index == nums.length) {
            if (target == 0) ans++;
            return;
        }
        dfs(index + 1, target - nums[index]);
        dfs(index + 1, target + nums[index]);
    }
}
// @lc code=end


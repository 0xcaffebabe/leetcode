/*
 * @lc app=leetcode.cn id=剑指 Offer II 102 lang=java
 * @lcpr version=21910
 *
 * [剑指 Offer II 102] 加减的目标值
 * 
 * 138/138 cases passed (540 ms)
 * Your runtime beats 13.26 % of java submissions
 * Your memory usage beats 93.6 % of java submissions (38.9 MB)
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



/*
// @lcpr case=start
// [1,1,1,1,1]\n3\n
// @lcpr case=end

// @lcpr case=start
// [1]\n1\n
// @lcpr case=end

 */


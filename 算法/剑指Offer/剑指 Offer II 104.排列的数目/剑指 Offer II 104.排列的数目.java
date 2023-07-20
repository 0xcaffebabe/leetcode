/*
 * @lc app=leetcode.cn id=剑指 Offer II 104 lang=java
 * @lcpr version=21910
 *
 * [剑指 Offer II 104] 排列的数目
 * 
 * 15/15 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 62.64 % of java submissions (38.7 MB)
 */

// @lc code=start
class Solution {
    int target;
    int[] nums;
    Integer[] memo;
    public int combinationSum4(int[] nums, int target) {
        this.nums = nums;
        this.target = target;
        memo = new Integer[target + 1];
        return bt(target);
    }
    int bt(int sum) {
        if (sum < 0) return 0;
        if (sum == 0) {
            return 1;
        }
        if (memo[sum] != null) return memo[sum];
        int res = 0;
        for(var i : nums) res += bt(sum - i);
        memo[sum] = res;
        return memo[sum];
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,3]\n4\n
// @lcpr case=end

// @lcpr case=start
// [9]\n3\n
// @lcpr case=end

 */


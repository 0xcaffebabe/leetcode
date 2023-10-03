/*
 * @lc app=leetcode.cn id=2640 lang=java
 * @lcpr version=
 *
 * [2640] 一个数组所有前缀的分数
 * 
 * 43/43 cases passed (3 ms)
 * Your runtime beats 54.02 % of java submissions
 * Your memory usage beats 95.4 % of java submissions (58.2 MB)
 */

// @lc code=start
class Solution {
    public long[] findPrefixScore(int[] nums) {
        long[] ans = new long[nums.length];
        int max = 0;
        for(int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            if (i == 0) ans[i] += max + nums[i];
            else ans[i] += max + nums[i] + ans[i - 1];
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [2,3,7,5,10]\n
// @lcpr case=end

// @lcpr case=start
// [1,1,2,4,8,16]\n
// @lcpr case=end

 */


/*
 * @lc app=leetcode.cn id=561 lang=java
 *
 * [561] 数组拆分
 * 
 * 83/83 cases passed (13 ms)
 * Your runtime beats 34.42 % of java submissions
 * Your memory usage beats 46.05 % of java submissions (43.5 MB)
 */

// @lc code=start
class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        for(int i = 0; i < nums.length; i += 2 ) ans += nums[i];
        return ans;
    }
}
// @lc code=end


/*
 * @lc app=leetcode.cn id=2016 lang=java
 *
 * [2016] 增量元素之间的最大差值
 * 
 * 54/54 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 37.63 % of java submissions (40.9 MB)
 */

// @lc code=start
class Solution {
    public int maximumDifference(int[] nums) {
        int min = nums[0];
        int ans = -1;
        for(int i = 1; i < nums.length; i++) {
            if (nums[i] < min) min = nums[i];
            else if (nums[i] > min) ans = Math.max(ans, nums[i] - min);
        }
        return ans;
    }
}
// @lc code=end


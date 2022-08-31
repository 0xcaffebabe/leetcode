/*
 * @lc app=leetcode.cn id=413 lang=java
 *
 * [413] 等差数列划分
 * 
 * 15/15 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 23.65 % of java submissions (39.5 MB)
 */

// @lc code=start
class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int n = nums.length;
        if (n < 3) return 0;
        int d = nums[1] - nums[0];
        // 构成等差数列的数的数量增量 3个数可以构成1个等差数列、4个数3、5个数6
        int t = 0;
        int ans = 0;
        for(int i = 2; i < n; i++) {
            // 构成等差数列
            if (nums[i] - nums[i-1] == d) {
                t++;
            }else {
                // 重新计算差
                d = nums[i] - nums[i-1];
                t = 0;
            }
            ans += t;
        }
        return ans;
    }
}
// @lc code=end


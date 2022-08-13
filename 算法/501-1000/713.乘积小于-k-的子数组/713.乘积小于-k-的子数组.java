/*
 * @lc app=leetcode.cn id=713 lang=java
 *
 * [713] 乘积小于 K 的子数组
 * 
 * 97/97 cases passed (4 ms)
 * Your runtime beats 99.97 % of java submissions
 * Your memory usage beats 81.58 % of java submissions (47.7 MB)
 */

// @lc code=start
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length;
        int f = 1;
        int ans = 0;
        int j = 0;
        for(int i = 0; i < n; i++) {
            f *= nums[i];
            // 当乘积大于k 移动窗口左边界直至乘积小于k
            while(j <= i && f >= k) f /= nums[j++];
            // 比如 [1,3] 数组的连续子序列数 = 3 - 1 + 1 == 3
            ans += i - j + 1;
        }
        return ans;
    }
}
// @lc code=end


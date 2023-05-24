/*
 * @lc app=leetcode.cn id=剑指 Offer II 009 lang=java
 * @lcpr version=21908
 *
 * [剑指 Offer II 009] 乘积小于 K 的子数组
 * 
 * 95/95 cases passed (4 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 94.24 % of java submissions (45.3 MB)
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



/*
// @lcpr case=start
// [10,5,2,6]\n100\n
// @lcpr case=end

// @lcpr case=start
// [1,2,3]\n0\n
// @lcpr case=end

 */


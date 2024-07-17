/*
 * @lc app=leetcode.cn id=1749 lang=java
 * @lcpr version=
 *
 * [1749] 任意子数组和的绝对值的最大值
 * 
 * 66/66 cases passed (5 ms)
 * Your runtime beats 72.17 % of java submissions
 * Your memory usage beats 63.06 % of java submissions (55.2 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int max = nums[0];
        int min = nums[0];

        int sum = nums[0];
        int rsum = nums[0];

        int n = nums.length;
        for(int i = 1; i < n; i++) {
            int val = nums[i];
            sum = Math.max(sum + val, val);
            max = Math.max(max, sum);

            rsum = Math.min(rsum + val, val);
            min = Math.min(min, rsum);
        }
        return Math.max(max, Math.abs(min));
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,-3,2,3,-4]\n
// [1]\n
// [-1]\n
// @lcpr case=end

// @lcpr case=start
// [2,-5,1,-4,3,-2]\n
// @lcpr case=end

 */


/*
 * @lc app=leetcode.cn id=1913 lang=java
 *
 * [1913] 两个数对之间的最大乘积差
 * 
 * 96/96 cases passed (7 ms)
 * Your runtime beats 83.16 % of java submissions
 * Your memory usage beats 27.79 % of java submissions (41.9 MB)
 */

// @lc code=start
class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        return (nums[nums.length - 1] * nums[nums.length - 2])
            - (nums[0] * nums[1]);
    }
}
// @lc code=end


/*
 * @lc app=leetcode.cn id=136 lang=java
 *
 * [136] 只出现一次的数字
 * 
 * 61/61 cases passed (1 ms)
 * Your runtime beats 99.97 % of java submissions
 * Your memory usage beats 38.17 % of java submissions (41.6 MB)
 */

// @lc code=start
class Solution {
    public int singleNumber(int[] nums) {
        int base = nums[0];
        for(int i=1;i<nums.length;i++){
            base = base^nums[i];
        }
        return base;
    }
}
// @lc code=end


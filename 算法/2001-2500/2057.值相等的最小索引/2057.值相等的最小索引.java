/*
 * @lc app=leetcode.cn id=2057 lang=java
 *
 * [2057] 值相等的最小索引
 * 
 * 663/663 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 51.23 % of java submissions (41.5 MB)
 */

// @lc code=start
class Solution {
    public int smallestEqual(int[] nums) {
        for(int i = 0; i < nums.length; i++) if (i % 10 == nums[i]) return i;
        return -1;
    }
}
// @lc code=end


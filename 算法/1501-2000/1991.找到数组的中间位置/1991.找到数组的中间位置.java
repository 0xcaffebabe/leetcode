/*
 * @lc app=leetcode.cn id=1991 lang=java
 *
 * [1991] 找到数组的中间位置
 * 
 * 294/294 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 5.05 % of java submissions (40.2 MB)
 */

// @lc code=start
class Solution {
    public int findMiddleIndex(int[] nums) {
        int rsum = 0;
        int lsum = 0;
        for(int i : nums) rsum += i;
        for(int i = 0;i < nums.length;i++) {
            rsum -= nums[i];
            if (lsum == rsum) return i;
            lsum += nums[i];
        }
        return -1;
    }
}
// @lc code=end


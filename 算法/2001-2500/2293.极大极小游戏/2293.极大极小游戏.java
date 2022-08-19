/*
 * @lc app=leetcode.cn id=2293 lang=java
 *
 * [2293] 极大极小游戏
 * 
 * 96/96 cases passed (2 ms)
 * Your runtime beats 14.49 % of java submissions
 * Your memory usage beats 5.28 % of java submissions (41.5 MB)
 */

// @lc code=start
class Solution {
    public int minMaxGame(int[] nums) {
        int p = 0;
        int n = nums.length;
        int c = 0;
        while(n >= 2) {
            for(int i = 0; i < nums.length; i += 2) {
                if (p % 2 == 0) c = Math.min(nums[i], nums[i + 1]);
                else c = Math.max(nums[i], nums[i + 1]);
                nums[p++] = c;
            }
            n /= 2;
            p=0;
        }
        return nums[0];
    }
}
// @lc code=end


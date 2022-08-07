/*
 * @lc app=leetcode.cn id=2239 lang=java
 *
 * [2239] 找到最接近 0 的数字
 * 
 * 227/227 cases passed (2 ms)
 * Your runtime beats 73.56 % of java submissions
 * Your memory usage beats 86.1 % of java submissions (41.2 MB)
 */

// @lc code=start
class Solution {
    int dis = Integer.MAX_VALUE;
    int ans;
    public int findClosestNumber(int[] nums) {
         for(var i : nums) {
            if (Math.abs(i) < dis) {
                dis = Math.abs(i);
                ans = i;
            }
            if (Math.abs(i) == dis) {
                if (ans < i) ans = i;
            }
         }
         return ans;
    }
}
// @lc code=end


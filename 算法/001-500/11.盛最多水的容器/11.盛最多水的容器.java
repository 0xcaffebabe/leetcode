/*
 * @lc app=leetcode.cn id=11 lang=java
 *
 * [11] 盛最多水的容器
 * 
 * 60/60 cases passed (4 ms)
 * Your runtime beats 67.43 % of java submissions
 * Your memory usage beats 14.66 % of java submissions (51.8 MB)
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {
        int p = 0;
        int q = height.length - 1;
        int max = 0;
        while(p < q) {
            max = Math.max(max, Math.min(height[p], height[q]) * (q - p));
            if (height[p] <= height[q]) p++;
            else q--;
        }
        return max;
    }
}
// @lc code=end


/*
 * @lc app=leetcode.cn id=75 lang=java
 *
 * [75] 颜色分类
 * 
 * 87/87 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 77.24 % of java submissions (39.7 MB)
 */

// @lc code=start
class Solution {
    int[] nums;
    public void sortColors(int[] nums) {
        this.nums = nums;
        int start = 0;
        int pos = 0;
        for(int i = start; i < nums.length; i++) {
            if (nums[i] == 0) swap(pos++, i);
        }
        start = pos;
        for(int i = start; i < nums.length; i++) {
            if (nums[i] == 1) swap(pos++, i);
        }
        start = pos;
        for(int i = start; i < nums.length; i++) {
            if (nums[i] == 2) swap(pos++, i);
        }
    }
    void swap(int p, int q) {
        int c = nums[p];
        nums[p] = nums[q];
        nums[q] = c;
    }
}
// @lc code=end


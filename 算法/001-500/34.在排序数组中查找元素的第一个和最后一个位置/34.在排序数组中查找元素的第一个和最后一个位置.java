/*
 * @lc app=leetcode.cn id=34 lang=java
 *
 * [34] 在排序数组中查找元素的第一个和最后一个位置
 * 
 * 88/88 cases passed (1 ms)
 * Your runtime beats 9.19 % of java submissions
 * Your memory usage beats 6.03 % of java submissions (45 MB)
 */

// @lc code=start
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = -1;
        int end = -1;
        for(int i = 0;i<nums.length;i++){
            if (nums[i] == target) {
                if (start == -1) {
                    start = i;   
                }
                end = i;
            }
        }
        return new int[]{start, end};
    }
}
// @lc code=end


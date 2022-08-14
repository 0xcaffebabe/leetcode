/*
 * @lc app=leetcode.cn id=80 lang=java
 *
 * [80] 删除有序数组中的重复项 II
 * 
 * 164/164 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 12.82 % of java submissions (41.9 MB)
 */

// @lc code=start
class Solution {
    int[] nums;
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        // 数组指针头 
        int p = 2;
        // 每次跟数组头比对 如果不同的话 当前元素前移到数组头
        for(int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[p - 2]) nums[p++] = nums[i];
            // 相同时长度自减 代表删掉了一个重复元素
            else len--;
        }
        return len;
    }
}
// @lc code=end


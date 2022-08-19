/*
 * @lc app=leetcode.cn id=33 lang=java
 *
 * [33] 搜索旋转排序数组
 * 
 * 195/195 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 41.63 % of java submissions (41.1 MB)
 */

// @lc code=start
class Solution {
    int[] nums;
    int target;
    public int search(int[] nums, int target) {
        this.nums = nums;
        this.target = target;
        return search(0, nums.length - 1);
    }
    int search(int start, int end) {
        if (start > end) return -1;
        int mid = (start + end) / 2;
        if (nums[mid] == target) return mid;
        // 左边有序
        if (nums[0] <= nums[mid]) {
            if (nums[0] <= target && target < nums[mid]) end = mid - 1;
            else start = mid + 1;
        }else {
            // 右边有序
            if (nums[mid] < target && target <= nums[nums.length - 1]) start = mid + 1;
            else end = mid - 1;
        }
        return search(start, end);
    }
}
// @lc code=end


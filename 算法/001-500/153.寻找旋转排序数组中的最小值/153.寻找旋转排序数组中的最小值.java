/*
 * @lc app=leetcode.cn id=153 lang=java
 *
 * [153] 寻找旋转排序数组中的最小值
 * 
 * 150/150 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 17.31 % of java submissions (41.4 MB)
 */

// @lc code=start
class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        //   高   低
        /*   -
         *  -  
         * -
         *      -
         *     -
         */
        while(l < r) {
            int mid = (l + r) / 2;
            // mid所在的区间是低区间 此时最小值应该在左边
            if (nums[mid] < nums[r]) r = mid;
            // mid所在的区间是高区间 最小值在右边
            else l = mid + 1;
        }
        return nums[l];
    }
}
// @lc code=end


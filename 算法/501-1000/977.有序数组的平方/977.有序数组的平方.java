/*
 * @lc app=leetcode.cn id=977 lang=java
 *
 * [977] 有序数组的平方
 * 
 * 137/137 cases passed (1 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 18.83 % of java submissions (43.4 MB)
 */

// @lc code=start
class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i] = nums[i] * nums[i];
        }
        int p=0,q=nums.length - 1;
        int[] ret = new int[nums.length];
        for(int i = nums.length - 1; i>=0;i--){
            if (nums[p] > nums[q]){
                ret[i] = nums[p++];
            }else if (nums[p] <= nums[q]) {
                ret[i] = nums[q--];
            }
        }
        return ret;
    }
}
// @lc code=end


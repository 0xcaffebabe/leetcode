/*
 * @lc app=leetcode.cn id=1464 lang=java
 *
 * [1464] 数组中两元素的最大乘积
 * 
 * 104/104 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 66.81 % of java submissions (40.9 MB)
 */

// @lc code=start
class Solution {
    public int maxProduct(int[] nums) {
        int max = -1;
        int second = -1;
        int maxIndex = 0;
        int secondIndex = 1;
        for(int i =0;i<nums.length;i++){
            if (nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }
        }
        for(int i =0;i<nums.length;i++){
            if (nums[i] > second && i != maxIndex) {
                second = nums[i];
                secondIndex = i;
            }
        }
        return (max-1) * (second - 1);
    }
}
// @lc code=end


import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=2154 lang=java
 *
 * [2154] 将找到的值乘以 2
 * 
 * 81/81 cases passed (2 ms)
 * Your runtime beats 72.09 % of java submissions
 * Your memory usage beats 88.99 % of java submissions (40.8 MB)
 */

// @lc code=start
class Solution {
    public int findFinalValue(int[] nums, int original) {
        Arrays.sort(nums);
        for(var i : nums) {
            if (i == original) {
                original *= 2;
            }
        }
        return original;
    }
}
// @lc code=end


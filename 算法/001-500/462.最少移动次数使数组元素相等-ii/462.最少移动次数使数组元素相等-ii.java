import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=462 lang=java
 *
 * [462] 最少移动次数使数组元素相等 II
 * 
 * 32/32 cases passed (4 ms)
 * Your runtime beats 74.21 % of java submissions
 * Your memory usage beats 12.74 % of java submissions (42.3 MB)
 */

// @lc code=start
class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int mid = nums[nums.length / 2];
        int sum = 0;
        for(var i : nums) sum += Math.abs(i - mid);
        return sum;
    }
}
// @lc code=end


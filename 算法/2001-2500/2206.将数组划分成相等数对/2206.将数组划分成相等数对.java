/*
 * @lc app=leetcode.cn id=2206 lang=java
 *
 * [2206] 将数组划分成相等数对
 * 
 * 133/133 cases passed (3 ms)
 * Your runtime beats 63.9 % of java submissions
 * Your memory usage beats 61.69 % of java submissions (41.4 MB)
 */

// @lc code=start
class Solution {
    public boolean divideArray(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i += 2) {
            if (nums[i] != nums[i + 1]) return false;
        }
        return true;
    }
}
// @lc code=end


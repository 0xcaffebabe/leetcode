/*
 * @lc app=leetcode.cn id=2190 lang=java
 *
 * [2190] 数组中紧跟 key 之后出现最频繁的数字
 * 
 * 101/101 cases passed (1 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 70.61 % of java submissions (41.3 MB)
 */

// @lc code=start
class Solution {
    public int mostFrequent(int[] nums, int key) {
        int[] map = new int[1001];
        int max = 0;
        int ans = 0;
        for(int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == key) map[nums[i + 1]]++;
            if (map[nums[i + 1]] > max) {
                ans = nums[i + 1];
                max = Math.max(max, map[nums[i + 1]]);
            }
        }
        return ans;
    }
}
// @lc code=end


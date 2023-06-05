/*
 * @lc app=leetcode.cn id=2460 lang=java
 * @lcpr version=21908
 *
 * [2460] 对数组执行操作
 * 
 * 36/36 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 25.96 % of java submissions (42.5 MB)
 */

// @lc code=start
class Solution {
    public int[] applyOperations(int[] nums) {
        for(int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] *= 2;
                nums[i + 1] = 0;
            }
        }
        int[] ans = new int[nums.length];
        int p = 0;
        for(var i : nums) if (i != 0) ans[p++] = i;
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,2,1,1,0]\n
// @lcpr case=end

// @lcpr case=start
// [0,1]\n
// @lcpr case=end

 */


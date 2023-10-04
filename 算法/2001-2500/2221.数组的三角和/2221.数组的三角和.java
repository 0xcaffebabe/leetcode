/*
 * @lc app=leetcode.cn id=2221 lang=java
 * @lcpr version=
 *
 * [2221] 数组的三角和
 * 
 * 300/300 cases passed (41 ms)
 * Your runtime beats 99.2 % of java submissions
 * Your memory usage beats 42.4 % of java submissions (42.6 MB)
 */

// @lc code=start
class Solution {
    public int triangularSum(int[] nums) {
        for(int i = 0; i < nums.length - 1; i++) {
            for(int j = 0; j < nums.length - i - 1; j++) 
                nums[j] = (nums[j] + nums[j + 1]) % 10;
        }
        return nums[0];
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,3,4,5]\n
// @lcpr case=end

// @lcpr case=start
// [5]\n
// [1,2]\n
// [1,2,3]\n
// @lcpr case=end

 */


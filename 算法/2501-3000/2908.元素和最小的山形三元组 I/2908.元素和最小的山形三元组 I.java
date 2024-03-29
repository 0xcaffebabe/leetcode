/*
 * @lc app=leetcode.cn id=2908 lang=java
 * @lcpr version=
 *
 * [2908] 元素和最小的山形三元组 I
 * 
 * 724/724 cases passed (1 ms)
 * Your runtime beats 78.67 % of java submissions
 * Your memory usage beats 22 % of java submissions (41.1 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int minimumSum(int[] nums) {
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length - 2; i++) {
            for(int j = i + 1; j < nums.length - 1; j++) {
                for(int k = j + 1; k < nums.length; k++) {
                    if (nums[i] < nums[j] && nums[k] < nums[j])
                        ans = Math.min(ans, nums[i] + nums[j] + nums[k]);
                }
            }
        }
        if (ans == Integer.MAX_VALUE) return -1;
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [8,6,1,5,3]\n
// @lcpr case=end

// @lcpr case=start
// [5,4,8,7,10,2]\n
// @lcpr case=end

// @lcpr case=start
// [6,5,4,3,4,5]\n
// [1,2,3]\n
// [1,2,3,4]\n
// @lcpr case=end

 */


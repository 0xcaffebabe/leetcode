/*
 * @lc app=leetcode.cn id=2932 lang=java
 * @lcpr version=
 *
 * [2932] 找出强数对的最大异或值 I
 * 
 * 860/860 cases passed (2 ms)
 * Your runtime beats 95.6 % of java submissions
 * Your memory usage beats 96.23 % of java submissions (41.9 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int maximumStrongPairXor(int[] nums) {
        int ans = 0;
        for(int i = 0; i < nums.length - 1; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if (Math.abs(nums[j] - nums[i]) <= Math.min(nums[j], nums[i]))
                    ans = Math.max(ans, nums[j] ^ nums[i]);
            }
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,3,4,5]\n
// [1]\n
// [1,1]\n
// @lcpr case=end

// @lcpr case=start
// [10,100]\n
// @lcpr case=end

// @lcpr case=start
// [5,6,25,30]\n
// @lcpr case=end

 */


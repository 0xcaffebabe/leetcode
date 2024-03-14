/*
 * @lc app=leetcode.cn id=2789 lang=java
 * @lcpr version=
 *
 * [2789] 合并后数组中的最大元素
 * 
 * 1023/1023 cases passed (1 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 34.94 % of java submissions (56.6 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public long maxArrayValue(int[] nums) {
        long ans = nums[nums.length - 1];
        for(int i = nums.length - 2; i >= 0; i--) {
            if (ans >= nums[i]) ans += nums[i];
            else ans = nums[i];
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [2,3,7,9,3]\n
// @lcpr case=end

// @lcpr case=start
// [5,3,3]\n
// [5,100,3]\n
// [5,3]\n
// [5]\n
// [1,2,3]\n
// [3,2,1]\n
// [1,3,2]\n
// [2,3,1]\n
// [2,50,1,50,100]\n
// @lcpr case=end

 */


/*
 * @lc app=leetcode.cn id=3192 lang=java
 * @lcpr version=
 *
 * [3192] 使二进制数组全部等于 1 的最少操作次数 II
 * 
 * 691/691 cases passed (6 ms)
 * Your runtime beats 99.4 % of java submissions
 * Your memory usage beats 34.49 % of java submissions (55.8 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length - 1;
        int ans = 0;
        for(int i = 0; i < n; i++) {
            if (nums[i] != nums[i + 1]) ans++;
        }
        if (nums[0] == 0) ans++;
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [0,1,1,0,1]\n
// [1]\n
// [0]\n
// [1,0]\n
// [0,1]\n
// @lcpr case=end

// @lcpr case=start
// [1,0,0,0]\n
// @lcpr case=end

 */


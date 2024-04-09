/*
 * @lc app=leetcode.cn id=3065 lang=java
 * @lcpr version=
 *
 * [3065] 超过阈值的最少操作数 I
 * 
 * 724/724 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 50.48 % of java submissions (41.8 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int minOperations(int[] nums, int k) {
        int ans = 0;
        for(var i: nums) if (i < k) ans++;
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [2,11,10,1,3]\n10\n
// @lcpr case=end

// @lcpr case=start
// [1,1,2,4,9]\n1\n
// @lcpr case=end

// @lcpr case=start
// [1,1,2,4,9]\n9\n
// @lcpr case=end

 */


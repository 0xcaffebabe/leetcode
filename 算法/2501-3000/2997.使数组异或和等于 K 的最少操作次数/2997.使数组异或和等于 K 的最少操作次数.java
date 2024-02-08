/*
 * @lc app=leetcode.cn id=2997 lang=java
 * @lcpr version=
 *
 * [2997] 使数组异或和等于 K 的最少操作次数
 * 
 * 684/684 cases passed (1 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 94.4 % of java submissions (55.5 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int minOperations(int[] nums, int k) {
        int sum = nums[0];
        for(int i = 1; i < nums.length; i++) sum ^= nums[i];
        return Integer.bitCount(sum ^ k);
    }
}
// @lc code=end



/*
// @lcpr case=start
// [2,1,3,4]\n1\n
// @lcpr case=end

// @lcpr case=start
// [2,0,2,0]\n0\n
// [2,0,2,0]\n100\n
// [0]\n100\n
// [0]\n0\n
// [1]\n100\n
// [20]\n100\n
// @lcpr case=end

 */


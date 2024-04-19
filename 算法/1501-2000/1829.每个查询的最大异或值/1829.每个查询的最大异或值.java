/*
 * @lc app=leetcode.cn id=1829 lang=java
 * @lcpr version=
 *
 * [1829] 每个查询的最大异或值
 * 
 * 86/86 cases passed (2 ms)
 * Your runtime beats 94.94 % of java submissions
 * Your memory usage beats 88.61 % of java submissions (57.4 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int n = nums.length;
        int max = (int) (Math.pow(2, maximumBit) - 1);
        int[] ans = new int[n];
        int sum = 0;
        for(int i = n - 1; i >= 0; i--) {
            sum ^= nums[n-i-1];
            ans[i] = max ^ sum;
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [0,1,1,3]\n2\n
// @lcpr case=end

// @lcpr case=start
// [2,3,4,7]\n3\n
// @lcpr case=end

// @lcpr case=start
// [0,1,2,2,5,7]\n3\n
// [1]\n10\n
// [1]\n1\n
// [0]\n1\n
// [0]\n10\n
// @lcpr case=end

 */


/*
 * @lc app=leetcode.cn id=2656 lang=java
 * @lcpr version=
 *
 * [2656] K 个元素的最大和
 * 
 * 3004/3004 cases passed (1 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 39.65 % of java submissions (42.6 MB)
 */

// @lc code=start
class Solution {
    public int maximizeSum(int[] nums, int k) {
        int max = 0;
        for(var i : nums) max = Math.max(max, i);
        return k * (max + (max + k - 1)) / 2;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,3,4,5]\n3\n
// [100]\n100\n
// [1]\n100\n
// @lcpr case=end

// @lcpr case=start
// [5,5,5]\n2\n
// @lcpr case=end

 */


/*
 * @lc app=leetcode.cn id=剑指 Offer II 070 lang=java
 * @lcpr version=21908
 *
 * [剑指 Offer II 070] 排序数组中只出现一次的数字
 * 
 * 14/14 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 10.14 % of java submissions (42.1 MB)
 */

// @lc code=start
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int ans = 0;
        for(int i : nums) ans ^= i;
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,1,2,3,3,4,4,8,8]\n
// @lcpr case=end

// @lcpr case=start
// [3,3,7,7,10,11,11]\n
// @lcpr case=end

 */


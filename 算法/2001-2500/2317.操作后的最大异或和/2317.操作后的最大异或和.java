/*
 * @lc app=leetcode.cn id=2317 lang=java
 * @lcpr version=
 *
 * [2317] 操作后的最大异或和
 * 
 * 73/73 cases passed (1 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 89.77 % of java submissions (52.7 MB)
 */

// @lc code=start
class Solution {
    public int maximumXOR(int[] nums) {
        int ans = 0;
        for (var i : nums) ans |= i;
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [3,2,4,6]\n
// @lcpr case=end

// @lcpr case=start
// [1,2,3,9,2]\n
// [1]\n
// [0]\n
// @lcpr case=end

 */


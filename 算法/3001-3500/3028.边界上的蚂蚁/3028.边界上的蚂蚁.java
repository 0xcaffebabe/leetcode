/*
 * @lc app=leetcode.cn id=3028 lang=java
 * @lcpr version=
 *
 * [3028] 边界上的蚂蚁
 * 
 * 641/641 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 5.15 % of java submissions (41.4 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int ans = 0;
        int sum = 0;
        for(var i : nums) {
            sum += i;
            if (sum == 0) ans++;
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [2,3,-5]\n
// [1,2,3,-5,-1]\n
// @lcpr case=end

// @lcpr case=start
// [3,2,-3,-4]\n
// @lcpr case=end

 */


/*
 * @lc app=leetcode.cn id=2673 lang=java
 * @lcpr version=
 *
 * [2673] 使二叉树所有路径值相等的最小代价
 * 
 * 1565/1565 cases passed (4 ms)
 * Your runtime beats 97.15 % of java submissions
 * Your memory usage beats 36.24 % of java submissions (54.2 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int minIncrements(int n, int[] cost) {
        int ans = 0;
        for(int i = n - 2; i >= 0; i -= 2) {
            ans += Math.abs(cost[i] - cost[i + 1]);
            cost[i / 2] += Math.max(cost[i], cost[i + 1]);
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 7\n[1,5,2,2,3,3,1]\n
// @lcpr case=end

// @lcpr case=start
// 3\n[5,3,3]\n
// @lcpr case=end

 */


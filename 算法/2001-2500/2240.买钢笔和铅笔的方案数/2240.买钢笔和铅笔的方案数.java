/*
 * @lc app=leetcode.cn id=2240 lang=java
 * @lcpr version=
 *
 * [2240] 买钢笔和铅笔的方案数
 * 
 * 145/145 cases passed (17 ms)
 * Your runtime beats 29.35 % of java submissions
 * Your memory usage beats 37.68 % of java submissions (38.3 MB)
 */

// @lc code=start
class Solution {
    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        long max1 = total / cost1;
        long ans = 0;
        for(long i = 0; i <= max1; i++) {
            ans += (total - cost1 * i) / cost2 + 1;
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 20\n10\n5\n
// 200000\n10\n5\n
// 1000000\n1\n1\n
// @lcpr case=end

// @lcpr case=start
// 5\n10\n10\n
// 1\n1\n1\n
// @lcpr case=end

 */


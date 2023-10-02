/*
 * @lc app=leetcode.cn id=2427 lang=java
 * @lcpr version=
 *
 * [2427] 公因子的数目
 * 
 * 76/76 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 22.49 % of java submissions (38.2 MB)
 */

// @lc code=start
class Solution {
    public int commonFactors(int a, int b) {
        int ans = 0;
        int min = Math.min(a, b);
        for(int i = 1; i <= min; i++) 
            if (a % i == 0 && b % i == 0) ans++;
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 12\n6\n
// @lcpr case=end

// @lcpr case=start
// 25\n30\n
// 999\n1000\n
// 998\n1000\n
// 500\n1000\n
// @lcpr case=end

 */


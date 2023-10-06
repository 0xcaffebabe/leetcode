/*
 * @lc app=leetcode.cn id=2706 lang=java
 * @lcpr version=
 *
 * [2706] 购买两块巧克力
 * 
 * 2003/2003 cases passed (2 ms)
 * Your runtime beats 73.4 % of java submissions
 * Your memory usage beats 24.24 % of java submissions (42.1 MB)
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        if (prices[0] + prices[1] > money)
            return money;
        return money - (prices[0] + prices[1]);
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,2]\n3\n
// @lcpr case=end

// @lcpr case=start
// [3,2,3]\n3\n
// @lcpr case=end

 */


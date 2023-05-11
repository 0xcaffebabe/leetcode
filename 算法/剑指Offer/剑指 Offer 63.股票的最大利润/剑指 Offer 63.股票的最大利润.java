/*
 * @lc app=leetcode.cn id=剑指 Offer 63 lang=java
 * @lcpr version=21907
 *
 * [剑指 Offer 63] 股票的最大利润
 * 
 * 200/200 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 5 % of java submissions (43.4 MB)
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;
        // mem[i] 代表 [0, i]之间的最小值（i天之前的历史最低）
        int[] mem = new int[prices.length];
        mem[0] = prices[0];
        for(int i = 1; i < prices.length; i++) mem[i] = Math.min(prices[i], mem[i - 1]);
        
        int max = 0;
        // 如果以今天的价格卖出今天以前的历史最低价格的股票
        for(int i = 0; i < prices.length; i++) {
            if (prices[i] - mem[i] > max) max = prices[i] - mem[i];
        }
        // System.out.println(Arrays.toString(mem));
        return max;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [7,1,5,3,6,4]\n
// @lcpr case=end

// @lcpr case=start
// [7,6,4,3,1]\n
// @lcpr case=end

// @lcpr case=start
// []\n
// @lcpr case=end

 */


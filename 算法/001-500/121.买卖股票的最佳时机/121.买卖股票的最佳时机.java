/*
 * @lc app=leetcode.cn id=121 lang=java
 *
 * [121] 买卖股票的最佳时机
 * 
 * 211/211 cases passed (3 ms)
 * Your runtime beats 32.83 % of java submissions
 * Your memory usage beats 82.15 % of java submissions (54 MB)
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
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


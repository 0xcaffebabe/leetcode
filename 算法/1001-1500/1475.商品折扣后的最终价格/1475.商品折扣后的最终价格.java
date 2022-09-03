import java.util.LinkedList;

/*
 * @lc app=leetcode.cn id=1475 lang=java
 *
 * [1475] 商品折扣后的最终价格
 * 
 * 103/103 cases passed (4 ms)
 * Your runtime beats 28.22 % of java submissions
 * Your memory usage beats 29.65 % of java submissions (41.8 MB)
 */

// @lc code=start
class Solution {
    public int[] finalPrices(int[] prices) {
        int[] ans = new int[prices.length];
        LinkedList<Integer> stack = new LinkedList<>();
        System.arraycopy(prices, 0, ans, 0, ans.length);
        for(int i = 0; i < prices.length; i++) {
            while (!stack.isEmpty() && prices[i] <= prices[stack.peek()]) {
                ans[stack.peek()] = prices[stack.peek()] - prices[i];
                stack.pop();
            }
            stack.push(i);
        }
        return ans;
    }
}
// @lc code=end


/*
 * @lc app=leetcode.cn id=1103 lang=java
 * @lcpr version=30112
 *
 * [1103] 分糖果 II
 * 
 * 27/27 cases passed (1 ms)
 * Your runtime beats 87.12 % of java submissions
 * Your memory usage beats 26.08 % of java submissions (39.3 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int[] distributeCandies(int candies, int n) {
        int[] ans = new int[n];
        int i = 0;
        while(candies > 0) {
            ans[i % n] += Math.min(++i, candies);
            candies -= i;
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 7\n4\n
// @lcpr case=end

// @lcpr case=start
// 10\n3\n
// 200000000\n1000\n
// @lcpr case=end

 */


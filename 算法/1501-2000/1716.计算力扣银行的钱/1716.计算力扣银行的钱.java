/*
 * @lc app=leetcode.cn id=1716 lang=java
 * @lcpr version=
 *
 * [1716] 计算力扣银行的钱
 * 
 * 106/106 cases passed (1 ms)
 * Your runtime beats 33.83 % of java submissions
 * Your memory usage beats 10.45 % of java submissions (38.3 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int totalMoney(int n) {
        int ans = 0;
        int s = 1;
        while(n > 0) {
            int end = Math.min(7, n);
            for(int i = 0; i < end; i++)
                ans += s + i;
            s++;
            n -= end;
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 4\n
// 1\n
// 1000\n
// 999\n
// @lcpr case=end

// @lcpr case=start
// 10\n
// @lcpr case=end

// @lcpr case=start
// 20\n
// @lcpr case=end

 */


/*
 * @lc app=leetcode.cn id=2806 lang=java
 * @lcpr version=
 *
 * [2806] 取整购买后的账户余额
 * 
 * 101/101 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 80.77 % of java submissions (39.3 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        int i = 0;
        while(true) {
            int a = purchaseAmount + i;
            int b = purchaseAmount - i;
            if (a % 10 == 0 && b % 10 == 0)
                return 100 - Math.max(a, b);
            if (a % 10 == 0) return 100 - a;
            if (b % 10 == 0) return 100 - b;
            i++;
        }
    }
}
// @lc code=end



/*
// @lcpr case=start
// 9\n
// 0\n
// 1\n
// 99\n
// 100\n
// @lcpr case=end

// @lcpr case=start
// 15\n
// @lcpr case=end

 */


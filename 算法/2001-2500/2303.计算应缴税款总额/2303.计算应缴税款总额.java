/*
 * @lc app=leetcode.cn id=2303 lang=java
 * @lcpr version=
 *
 * [2303] 计算应缴税款总额
 * 
 * 227/227 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 76.7 % of java submissions (42.1 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public double calculateTax(int[][] brackets, int income) {
        double ans = 0;
        ans += Math.min(income, brackets[0][0]) * (brackets[0][1] / 100d);
        income -= Math.min(income, brackets[0][0]);
        for(int i = 1; i < brackets.length; i++) {
            if (income == 0) break;
            var u = brackets[i][0] - brackets[i - 1][0];
            ans += Math.min(income, u) * (brackets[i][1] / 100d);
            income -= Math.min(income, u);
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[3,50],[7,10],[12,25]]\n10\n
// @lcpr case=end

// @lcpr case=start
// [[1,0],[4,25],[5,50]]\n2\n
// @lcpr case=end

// @lcpr case=start
// [[2,50]]\n0\n
// @lcpr case=end

 */


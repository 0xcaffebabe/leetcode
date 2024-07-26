/*
 * @lc app=leetcode.cn id=1006 lang=java
 * @lcpr version=
 *
 * [1006] 笨阶乘
 * 
 * 84/84 cases passed (2 ms)
 * Your runtime beats 78.18 % of java submissions
 * Your memory usage beats 96 % of java submissions (39.3 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int clumsy(int n) {
        int sum = calc(n--, n--, n--);
        if (n > 0)  sum += n--;
        while(n > 0) {
            sum -= calc(n--, n--, n--);
            if (n > 0)  sum += n--;
        }
        return sum;
    }

    int calc(int a, int b, int c) {
        if (b <= 0) return a;
        if (c <= 0) return a * b;
        return a * b / c;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 4\n
// 3\n
// 2\n
// 1\n
// 5\n
// 6\n
// 7\n
// 8\n
// 9\n
// 11\n
// 12\n
// 13\n
// 14\n
// 16\n
// 16\n
// 10000\n
// 9999\n
// @lcpr case=end

// @lcpr case=start
// 10\n
// @lcpr case=end

 */


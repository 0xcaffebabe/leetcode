/*
 * @lc app=leetcode.cn id=1017 lang=java
 * @lcpr version=
 *
 * [1017] 负二进制转换
 * 
 * 170/170 cases passed (1 ms)
 * Your runtime beats 46.94 % of java submissions
 * Your memory usage beats 81.63 % of java submissions (39.9 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public String baseNeg2(int n) {
        if (n == 0 || n == 1) return n + "";

        StringBuilder sb = new StringBuilder();
        while(n != 0) {
            int r = n & 1;
            sb.append(r);
            n -= r;
            n /= -2;
        }
        return sb.reverse().toString();
    }
}
// @lc code=end



/*
// @lcpr case=start
// 2\n
// 0\n
// 1\n
// @lcpr case=end

// @lcpr case=start
// 3\n
// @lcpr case=end

// @lcpr case=start
// 4\n
// @lcpr case=end

 */


/*
 * @lc app=leetcode.cn id=2894 lang=java
 * @lcpr version=
 *
 * [2894] 分类求和并作差
 * 
 * 737/737 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 50.86 % of java submissions (38.4 MB)
 */

// @lc code=start
class Solution {
    public int differenceOfSums(int n, int m) {
        int a = 0;
        int b = 0;
        for(int i = 1; i <= n; i++)
            if (i % m == 0) b += i;
            else a += i;
        return a - b;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 10\n3\n
// @lcpr case=end

// @lcpr case=start
// 5\n6\n
// @lcpr case=end

// @lcpr case=start
// 5\n1\n
// 1000\n1000\n
// 1\n1\n
// @lcpr case=end

 */


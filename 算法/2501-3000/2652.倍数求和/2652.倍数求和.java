/*
 * @lc app=leetcode.cn id=2652 lang=java
 * @lcpr version=
 *
 * [2652] 倍数求和
 * 
 * 1000/1000 cases passed (2 ms)
 * Your runtime beats 83.17 % of java submissions
 * Your memory usage beats 95.05 % of java submissions (38.3 MB)
 */

// @lc code=start
class Solution {
    public int sumOfMultiples(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0)
                sum += i;
        }
        return sum;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 7\n
// @lcpr case=end

// @lcpr case=start
// 10\n
// @lcpr case=end

// @lcpr case=start
// 9\n
// @lcpr case=end

 */


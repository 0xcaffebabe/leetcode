/*
 * @lc app=leetcode.cn id=剑指 Offer 10- II lang=java
 * @lcpr version=21907
 *
 * [剑指 Offer 10- II] 青蛙跳台阶问题
 * 
 * 51/51 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 61.15 % of java submissions (38.2 MB)
 */

// @lc code=start
class Solution {
    static int[] mem = new int[103];
    static {
        mem[0] = 1;
        mem[1] = 2;
        for(int i = 2; i <= 100; i++) mem[i] = (mem[i - 1] + mem[i - 2]) % 1000000007;
    }
    public int numWays(int n) {
        if (n == 0) return 1;
        return mem[n - 1];
    }
}
// @lc code=end



/*
// @lcpr case=start
// 2\n
// @lcpr case=end

// @lcpr case=start
// 7\n
// @lcpr case=end

// @lcpr case=start
// 0\n
// @lcpr case=end

// @lcpr case=start
// 100\n
// @lcpr case=end

 */


#
# @lc app=leetcode.cn id=剑指 Offer 14- II lang=python3
# @lcpr version=21909
#
# [剑指 Offer 14- II] 剪绳子 II
# 
# 55/55 cases passed (712 ms)
# Your runtime beats 10.93 % of python3 submissions
# Your memory usage beats 7.98 % of python3 submissions (16.1 MB)
#

# @lc code=start
class Solution:
    def cuttingRope(self, n: int) -> int:
        dp = [0] * (n + 1)
        for i in range(2, n + 1):
            m = 0
            for j in range(1, i):
                m = max(m, max(j * (i - j), j * dp[i - j]))
            dp[i] = m
        return dp[n] % 1000000007
# @lc code=end



#
# @lcpr case=start
# 2\n
# 102\n
# 120\n
# 1000\n
# @lcpr case=end

# @lcpr case=start
# 10\n
# @lcpr case=end

#


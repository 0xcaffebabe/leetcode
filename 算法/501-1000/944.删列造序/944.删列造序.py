#
# @lc app=leetcode.cn id=944 lang=python3
#
# [944] 删列造序
#
# 85/85 cases passed (136 ms)
# Your runtime beats 43.89 % of python3 submissions
# Your memory usage beats 97.63 % of python3 submissions (15.5 MB)

# @lc code=start
class Solution:
    def minDeletionSize(self, strs: List[str]) -> int:
        ans = 0
        row = len(strs)
        column = len(strs[0])
        for j in range(0, column):
            for i in range(1, row):
                if  strs[i][j] < strs[i-1][j]: 
                    ans += 1
                    break
        return ans
# @lc code=end


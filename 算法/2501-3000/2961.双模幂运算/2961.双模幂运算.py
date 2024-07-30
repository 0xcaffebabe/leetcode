#
# @lc app=leetcode.cn id=2961 lang=python3
# @lcpr version=
#
# [2961] 双模幂运算

# 524/524 cases passed (44 ms)
# Your runtime beats 39.72 % of python3 submissions
# Your memory usage beats 86.53 % of python3 submissions (16.4 MB)
#


# @lcpr-template-start

# @lcpr-template-end
# @lc code=start
class Solution:
    def getGoodIndices(self, variables: List[List[int]], target: int) -> List[int]:
        ans = []
        for i,v in enumerate(variables):
            if pow(pow(v[0], v[1], 10), v[2], v[3]) == target:
                ans.append(i)
        return ans
# @lc code=end



#
# @lcpr case=start
# [[2,3,3,10],[3,3,3,1],[6,1,1,4]]\n2\n
# @lcpr case=end

# @lcpr case=start
# [[39,3,1000,1000]]\n17\n
# [[39,3,1000,1000]]\n1\n
# @lcpr case=end

#


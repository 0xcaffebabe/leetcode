#
# @lc app=leetcode.cn id=908 lang=python3
#
# [908] 最小差值 I
# 
# 68/68 cases passed (40 ms)
# Your runtime beats 72.73 % of python3 submissions
# Your memory usage beats 70.37 % of python3 submissions (15.8 MB)
#

# @lc code=start
class Solution:
    def smallestRangeI(self, nums: List[int], k: int) -> int:
        minium = min(nums)
        maxium = max(nums)
        return max(0, maxium - minium - 2 * k)
# @lc code=end


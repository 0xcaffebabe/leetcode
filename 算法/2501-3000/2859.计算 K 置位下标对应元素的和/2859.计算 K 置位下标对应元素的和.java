/*
 * @lc app=leetcode.cn id=2859 lang=java
 * @lcpr version=
 *
 * [2859] 计算 K 置位下标对应元素的和
 * 
 * 639/639 cases passed (1 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 22.14 % of java submissions (42.3 MB)
 */

// @lc code=start

import java.util.List;

class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int ans = 0;
        for(int i = 0; i < nums.size(); i++) 
            if (Integer.bitCount(i) == k) 
                ans += nums.get(i);
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [5,10,1,5,2]\n1\n
// @lcpr case=end

// @lcpr case=start
// [4,3,2,1]\n2\n
// [1]\n1\n
// [2]\n1\n
// @lcpr case=end

 */


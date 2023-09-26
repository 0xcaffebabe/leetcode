/*
 * @lc app=leetcode.cn id=2824 lang=java
 * @lcpr version=
 *
 * [2824] 统计和小于目标的下标对数目
 * 
 * 707/707 cases passed (2 ms)
 * Your runtime beats 95.82 % of java submissions
 * Your memory usage beats 30.68 % of java submissions (40.1 MB)
 */

// @lc code=start

import java.util.List;

class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int ans = 0;
        for(int i = 0; i < nums.size(); i++) {
            for(int j = i + 1; j < nums.size(); j++) {
                if (nums.get(i) + nums.get(j) < target) ans++;
            }
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [-1,1,2,3,1]\n2\n
// [1,1,2,3,1]\n2\n
// @lcpr case=end

// @lcpr case=start
// [-6,2,5,-2,-7,-1,3]\n-2\n
// [-1]\n-2\n
// [1]\n2\n
// @lcpr case=end

 */


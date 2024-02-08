/*
 * @lc app=leetcode.cn id=2144 lang=java
 * @lcpr version=
 *
 * [2144] 打折购买糖果的最小开销
 * 
 * 192/192 cases passed (2 ms)
 * Your runtime beats 89.14 % of java submissions
 * Your memory usage beats 64.57 % of java submissions (39.9 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.Arrays;

class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int ans = 0;
        int i = 0;
        while(i < cost.length) {
            if (i % 3 != 2) 
                ans += cost[cost.length - 1 - i];
            
            i++;
        }

        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,3]\n
// @lcpr case=end

// @lcpr case=start
// [6,5,7,9,2,2]\n
// @lcpr case=end

// @lcpr case=start
// [5,5]\n
// [5,6,7]\n
// [7,6,5]\n
// [1]\n
// @lcpr case=end

 */


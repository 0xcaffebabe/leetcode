/*
 * @lc app=leetcode.cn id=2279 lang=java
 * @lcpr version=
 *
 * [2279] 装满石头的背包的最大数量
 * 
 * 79/79 cases passed (14 ms)
 * Your runtime beats 94.57 % of java submissions
 * Your memory usage beats 76.45 % of java submissions (53.8 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.Arrays;

class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        for(int i = 0; i < capacity.length; i++) {
            capacity[i] -= rocks[i];
        }
        Arrays.sort(capacity);
        int ans = 0;
        for(var i: capacity) {
            if (i == 0) {
                ans++;
            }else if (i <= additionalRocks) {
                additionalRocks -= i;
                ans++;
            } else {
                break;
            }
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [2,3,4,5]\n[1,2,4,4]\n2\n
// @lcpr case=end

// @lcpr case=start
// [10,2,2]\n[2,2,0]\n100\n
// @lcpr case=end

 */


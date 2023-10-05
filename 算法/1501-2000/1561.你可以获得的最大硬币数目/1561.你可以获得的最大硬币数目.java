/*
 * @lc app=leetcode.cn id=1561 lang=java
 * @lcpr version=
 *
 * [1561] 你可以获得的最大硬币数目
 * 
 * 116/116 cases passed (29 ms)
 * Your runtime beats 99.3 % of java submissions
 * Your memory usage beats 35.92 % of java submissions (55.1 MB)
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int ans = 0;
        int p = piles.length - 2;
        for(int i = 0; i < piles.length / 3; i++) {
            ans += piles[p];
            p -= 2;
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [2,4,1,2,7,8]\n
// @lcpr case=end

// @lcpr case=start
// [2,4,5]\n
// @lcpr case=end

// @lcpr case=start
// [9,8,7,6,5,1,2,3,4]\n
// @lcpr case=end

 */


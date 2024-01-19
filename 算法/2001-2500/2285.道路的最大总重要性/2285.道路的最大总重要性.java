/*
 * @lc app=leetcode.cn id=2285 lang=java
 * @lcpr version=
 *
 * [2285] 道路的最大总重要性
 * 
 * 58/58 cases passed (6 ms)
 * Your runtime beats 64.04 % of java submissions
 * Your memory usage beats 49.44 % of java submissions (61 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.Arrays;

class Solution {
    public long maximumImportance(int n, int[][] roads) {
        int[] m = new int[n];
        for(var r: roads) {
            m[r[0]]++;
            m[r[1]]++;
        }
        Arrays.sort(m);
        long ans = 0;
        for(int i = 0; i < n; i++) ans += m[n-i-1] * 1L * (n-i);
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 5\n[[0,1],[1,2],[2,3],[0,2],[1,3],[2,4]]\n
// @lcpr case=end

// @lcpr case=start
// 5\n[[0,3],[2,4],[1,3]]\n
// 2\n[[0,1]]\n
// @lcpr case=end

 */

